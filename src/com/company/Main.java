package com.company;

class Student
{
    String name,address;
    int roll_no,ph_no;
}
class Main
{
    public static void main(String[] args)
    {
        Student a=new Student();
        Student b=new Student();
        a.name="John";
        a.roll_no=2;
        a.ph_no=2590;
        a.address="wall st 204";
        b.name="Sam";
        b.roll_no=7;
        b.ph_no=512;
        b.address="12 park avenue";

        System.out.println("STUDENT A INFO\n");
        System.out.println("Name=\t\t"+a.name+"\nRoll no.=\t"+ a.roll_no+"\nPhone no.=\t"+ a.ph_no+"\nAddress=\t"+ a.address);

        System.out.println("\n\nSTUDENT B INFO\n");
        System.out.println("Name=\t\t"+b.name+"\nRoll no.=\t"+ b.roll_no+"\nPhone no.=\t"+ b.ph_no+"\nAddress=\t"+ b.address);
    }
}
