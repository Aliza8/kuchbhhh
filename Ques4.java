package com.company;

import java.util.Scanner;

public class Ques4 {

    String name, course, teacher;
    int age, id;

    public void setName(String a){
        name = a;
    }

    public void setCourse(String b){
        course = b;
    }

    public void setTeacher(String c){
        teacher = c;
    }

    public void setAge(int d){
        age = d;
    }

    public void setId(int e){
        id = e;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public String getTeacher(){
        return teacher;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public void display(){

        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Teacher: " + getTeacher());
        System.out.println("Age: " + getAge());
        System.out.println("Id: " + getId());
    }

    public Ques4(String a, String b, String c, int d, int e){

        name = a;
        course = b;
        teacher = c;
        age = d;
        id = e;
    }

    public static void main (String[] args){

        Scanner a = new Scanner(System.in);

        System.out.println("Name: ");
        String name = a.nextLine();

        System.out.println("Course: ");
        String course = a.nextLine();

        System.out.println("Teacher: ");
        String teacher = a.nextLine();

        System.out.println("Age: ");
        int age = a.nextInt();

        System.out.println("Id: ");
        int id = a.nextInt();

        Ques4 obj = new Ques4(name, course, teacher, age, id);

        obj.setName(name);
        obj.setCourse(course);
        obj.setTeacher(teacher);
        obj.setAge(age);
        obj.setId(id);

        obj.display();

    }
}