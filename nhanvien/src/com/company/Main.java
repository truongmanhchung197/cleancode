package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Staff> list = new ArrayList<>();

        list.add(new StaffFulltime("001", "Cristiano Ronaldo", 35, "01234567", "ronaldo@gmail.com"));
        list.add(new StaffFulltime("002", "Lionel Messi", 33, "01234568", "messi@gmail.com"));
        list.add(new StaffFulltime("003", "Gareth Bale", 31, "01234569", "bale@gmail.com"));
        list.add(new StaffFulltime("004", "Karim Benzema", 33, "01234570", "benzema@gmail.com"));
        list.add(new StaffFulltime("005", "Sergio Ramos", 35, "01234571", "ramos@gmail.com"));

        list.add(new StaffParttime("006", "Dani Carvajal", 28, "01234589", "carvajal@gmail.com"));
        list.add(new StaffParttime("007", "Raphael Varane", 27, "0123490", "varane@gmail.com"));
        list.add(new StaffParttime("008", "Marcelo", 32, "0123491", "marcelo@gmail.com"));
        list.add(new StaffParttime("009", "Toni Kroos", 30, "01234592", "kroos@gmail.com"));
        list.add(new StaffParttime("010", "Luka Modric", 34, "01234595", "modric@gmail.com"));

        Scanner sc = new Scanner(System.in);

        for (Staff staff : list) {
            System.out.println(staff.toString());
        }

        System.out.println("Add new staff: ");
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("FullName: ");
        String fullName = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Tel: ");
        String tel = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        list.add(new Staff(id, fullName, age, tel, email));

        double sumSalaryOfFulltime = 0;
        double sumSalaryOfParttime = 0;
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                System.out.print("Salary of " + staff.getFullName() + ": ");
                double salary = sc.nextDouble();
                ((StaffFulltime) staff).setSalary(salary);
                System.out.print("Bonus of " + staff.getFullName() + ": ");
                double bonus = sc.nextDouble();
                ((StaffFulltime) staff).setBonus(bonus);
                System.out.print("Fine of " + staff.getFullName() + ": ");
                double fine = sc.nextDouble();
                ((StaffFulltime) staff).setBonus(fine);
                sumSalaryOfFulltime += ((StaffFulltime) staff).getRealSalary();
            } else {
                System.out.print("Worktime of " + staff.getFullName() + ": ");
                int workTime = sc.nextInt();
                ((StaffParttime) staff).setWorkTime(workTime);
                sumSalaryOfParttime += ((StaffParttime) staff).getRealSalary();
            }
        }
        double averageOfSalary = (sumSalaryOfFulltime + sumSalaryOfParttime) / (list.size());
        System.out.println("Danh sach nhan vien toan thoi gian co muc luonh thap hon trung binh la: ");
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                if (((StaffFulltime) staff).getRealSalary() < averageOfSalary) {
                    System.out.println(staff.getFullName());
                }
            }
        }

        System.out.println("So luong phai tra cho tat ca nhan vien ban thoi gian la: " + sumSalaryOfParttime);


        ArrayList<StaffFulltime> listOfFullTime = new ArrayList<>();
        for (Staff staff : list) {
            if (staff instanceof StaffFulltime) {
                listOfFullTime.add((StaffFulltime) staff);
            }
        }
        for (int i = 0; i < listOfFullTime.size(); i++) {
            StaffFulltime min = listOfFullTime.get(i);
            int index = i;
            for (int j = i + 1; j < listOfFullTime.size(); j++) {
                if (listOfFullTime.get(j).getRealSalary() < min.getRealSalary()) {
                    min = listOfFullTime.get(j);
                    index = j;
                }
            }
            if (index != i) {
                listOfFullTime.set(i,listOfFullTime.get(index));
                listOfFullTime.set(index,listOfFullTime.get(i));
            }
        }
        System.out.println("Danh sach nhan vien toan thoi gian theo so luong tang dan la: ");
        for (StaffFulltime staffFulltime: listOfFullTime){
            System.out.println(staffFulltime.getFullName());
        }


    }
}
