package com.company;

import java.util.Scanner;

class Ques2 {

    String title, author;
    double price;

    public void setTitle(String a){
        title = a;
    }

    public void setAuthor(String b){
        author = b;
    }

    public void setPrice(double c){
        price = c;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void display(){

        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }

    public Ques2 (String a, String b, double c){

        title = a;
        author = b;
        price = c;

    }

    protected void finalize (){
        System.out.println("");
    }

        public static void main (String[] args){

            String title, author;
            double price;

            Scanner in = new Scanner(System.in);

            System.out.println("Title?");
            title = in.nextLine();

            System.out.println("Author?");
            author = in.nextLine();

            System.out.println("Price?");
            price = in.nextDouble();

            Ques2 obj = new Ques2 (title, author, price);


            obj.setTitle(title);
            obj.setAuthor(author);
            obj.setPrice(price);


            obj.display();

        }
    }

