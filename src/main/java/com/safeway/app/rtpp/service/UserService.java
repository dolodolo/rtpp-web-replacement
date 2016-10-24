package com.safeway.app.rtpp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.safeway.app.rtpp.domain.User;
import com.safeway.app.rtpp.domain.UserRepository;

@Component
public class UserService {

	private final static Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
    protected JdbcTemplate jdbcTemplate;
    
    @Autowired
    protected UserRepository customerRepository;

    @Transactional
    public void insertCustomer(int[] ids)
    {
    	List<User> persons = customerRepository.getUsers(ids);
    	
        for (User person : persons) 
        {
            log.info("Inserting " + person + " to CUSTOMER_TABLE...");            	
            jdbcTemplate.update("insert into azhou01.CUSTOMER_TABLE(cust_id,cust_name) values (?,?)", person.id,person.name);            
        }
    }
    
    @Transactional
    public void cleanCustomer()
    {
    	log.info("Clean up CUSTOMER table");
        jdbcTemplate.execute("DELETE FROM azhou01.CUSTOMER_TABLE");
    }
    
    @Transactional
    public void updateCustomer(int id) 
    {   	
    	User person = customerRepository.getUser(id);        
    	log.info("Updating " + person + " in the CUSTOMER table...");
        jdbcTemplate.update("update azhou01.CUSTOMER_TABLE set cust_name = ? where cust_id = ?", person.name, person.id);
    }
}
