package com.corefortune.coreapi;
public class Usercontroller{
    public static final String getId = null;
	Integer id;
    String name;
    long age;

    public Usercontroller(Integer id, String name, long age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
		this.age = age;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    


}