package com.safeway.app.rtpp.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

	protected final static Logger log = LoggerFactory.getLogger(UserRepository.class);

    @Autowired
    protected JdbcTemplate jdbc;

    public User getUser(int id) {
        return jdbc.queryForObject("SELECT * FROM USER_TABLE WHERE id=?", userMapper, id);
    }

    public List<User> getUsers(int[] ids) {
        String inIds = StringUtils.arrayToCommaDelimitedString(ObjectUtils.toObjectArray(ids));
        return jdbc.query("SELECT * FROM USER_TABLE WHERE id IN (" + inIds + ")", userMapper);
    }

    private static final RowMapper<User> userMapper = new RowMapper<User>() {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User(rs.getInt("id"), rs.getString("name"));
            log.info("User " + user.name + " are selected in USER_TABLE...");  
            return user;
        }
    };
}
