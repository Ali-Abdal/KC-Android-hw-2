package com.example.myapplication;

public class Cv {
    private String name;
    private int age;
    private String job;
    private int phonenum;
    private String email;

    public Cv(String name, int age, String job, int phonenum, String email) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.phonenum = phonenum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
