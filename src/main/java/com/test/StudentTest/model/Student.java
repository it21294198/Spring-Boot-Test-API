package com.test.StudentTest.model;

public class Student {

    private int sid;
    private String name;
    private String mobile;
    private String email;
    private String nic;

    public Student(String name, String mobile, String email, String nic) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.nic = nic;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
