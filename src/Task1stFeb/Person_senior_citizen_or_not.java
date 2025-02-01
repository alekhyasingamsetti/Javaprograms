package Task1stFeb;

import java.util.Scanner;

public class Person_senior_citizen_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age>=0 && age<=12){
            System.out.println(age+" is the age of child");
        } else if (age>=13 && age<=19) {
            System.out.println(age+" is the age of teenager");
        }else if(age>=20 && age<=64){
            System.out.println(age+" is the age of adult");
        } else if (age>=65) {
            System.out.println(age+" is the age of senior citizen");
        }else{
            System.out.println("Please enter the correct age");
        }
    }
}
