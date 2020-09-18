package com.company;

public class Staff {
    private String id;
    private String fullName;
    private int age;
    private String tel;
    private String email;

    public Staff() {
    }

    public Staff(String id, String fullName, int age, String tel, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Id: " + getId()
                + ", fullname: " + getFullName()
                + ", age: " + getAge()
                + ", tel: " + getTel()
                + ", email: " + getEmail();
    }
}
