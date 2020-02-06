package com.divya.epam.maven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s= new Scanner(System.in);
        Sweets ob1 =new Sweets(2,5,4);
        Sweets ob2 =new Sweets(3,2.3f,6);
        Sweets ob3 =new Sweets(4,2.3f,3);
        ArrayList<Sweets> sw1=new ArrayList<Sweets>();
        sw1.add(ob1);
        sw1.add(ob2);
        ArrayList<Sweets> sw2=new ArrayList<Sweets>();
        sw2.add(ob1);
        sw2.add(ob3);
        Chocolates c1=new Chocolates(2,5,15);
        Chocolates c2=new Chocolates(6,1,2);
        Chocolates c3=new Chocolates(3,15,20);
        ArrayList<Chocolates> cs1=new ArrayList<Chocolates>();
        cs1.add(c1);
        cs1.add(c2);
        ArrayList<Chocolates> cs2=new ArrayList<Chocolates>();
        cs2.add(c2);
        cs2.add(c1);
        cs2.add(c3);
        Candies ca1=new Candies(3,3,6);
        Candies ca2=new Candies(2,7,4);
        Candies ca3= new Candies(5,5,5);
        ArrayList<Candies> can1=new ArrayList<Candies>();
        can1.add(ca1);
        can1.add(ca3);
        ArrayList<Candies> can2=new ArrayList<Candies>();
        can2.add(ca2);
        can2.add(ca3);
        ArrayList<Gifts> al=new ArrayList<Gifts>(); //gifts in arraylist
        Gifts g1=new Gifts(sw1,cs1,can1); //gift1
        Gifts g2=new Gifts(sw2,cs2,can2); //gift2
        //add gifts to array
        al.add(g1);
        al.add(g2);
        System.out.println("enter the option to sort chocolates");
        String option=s.next();
        int x=1;
        for (Gifts i : al) {
        	System.out.println("chocolates in gift "+ x);
        	i.sortChocolates(option); // print chocolates in each gift in sorted order
        	System.out.println("giftbox "+x+" weight "+i.sumweight());//print weight of each gift
        	x++;
        }
        System.out.println("Enter the option to find candies in given range");
        String opt=s.next();
        System.out.println("Enter low and high range values");
        float l=s.nextFloat();
        float h=s.nextFloat();
        s.close();// closing scanner
        x=1;
        for (Gifts i : al) {
        	System.out.println("candies in gift "+ x);
        	i.rangeTheCandies(opt,l,h);}// print candies in given range
        x++;
        }

    }

