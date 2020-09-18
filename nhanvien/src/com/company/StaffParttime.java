package com.company;

public class StaffParttime extends Staff{
    private int workTime;
    public StaffParttime(){
    }
    public StaffParttime(String id, String fullName, int age, String tel, String email){
        super(id, fullName, age, tel, email);
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public double getRealSalary(){
        return this.workTime*100000;
    }
}
