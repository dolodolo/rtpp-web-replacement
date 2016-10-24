package com.safeway.app.rtpp.domain;

public class User {
	public long id;
    public String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, name='%s']", id, name);
    }
        
    // getters & setters omitted for brevity
}

