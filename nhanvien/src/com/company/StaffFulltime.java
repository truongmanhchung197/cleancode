package com.company;

public class StaffFulltime extends Staff{
    private double bonus;
    private double fine;
    private double salary;

    public StaffFulltime(){
    }
    public StaffFulltime(String id, String fullName, int age, String tel, String email){
        super(id, fullName, age, tel, email);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getRealSalary(){
        return (this.salary+this.bonus-this.fine);
    }
}
