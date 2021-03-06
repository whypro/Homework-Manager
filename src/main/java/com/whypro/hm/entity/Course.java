package com.whypro.hm.entity;


public class Course {
    private int id;
    private String number;
    private String name;
    private String description;

    public Course() {}
    
    public Course(String number, String name, String description) {
        setNumber(number);
        setName(name);
        setDescription(description);
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString() {
        return "Number: " + this.getNumber() + 
                ", Name: " + this.getName() + 
                ", Description: " + this.getDescription();
    }
}
