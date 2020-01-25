package com.example.jordansfirstapp;

public class Person {

    //Constructors
    Person () {
        //nothing
    }

    Person (String name, String job, Integer age){
        this.Name = name;
        this.Job = job;
        this.Age = age;
    }

    //Properties
    private String Name;
    private String Job;
    private Integer Age;


    //Methods
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
