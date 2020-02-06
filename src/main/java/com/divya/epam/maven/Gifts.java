package com.divya.epam.maven;

import java.util.ArrayList;
import java.util.Collections;

class Gifts implements GiftsMethods{
	ArrayList<Sweets> sweets; 
	ArrayList<Chocolates> chocos;
	ArrayList<Candies> candies;
	float totalweight;
    Gifts(ArrayList<Sweets> sweets,ArrayList<Chocolates> chocos,ArrayList<Candies> candies){
    	this.chocos=chocos;
    	this.sweets=sweets;
    	this.candies=candies;
    }
	public int sumweight() {
		float s=0;
		for (Sweets i: sweets){
			s+=i.n*i.weight;}
		for(Chocolates i: chocos) {
			s+=i.n*i.weight;
		}
		for(Candies i: candies) {
			s+=i.n*i.weight;
		}
		this.totalweight=s;
		return (int)s;
	}
	public void sortChocolates(String option) {
		if(option.compareTo("weight")==0) {
			Collections.sort(chocos,new SortByWeight()); // sorting candies by weight
			System.out.println("chocolates in giftbox sorted on the weights");
        	for(Chocolates j: chocos) {
        		System.out.println(j.weight);}
		}
		if(option.compareTo("price")==0) {
			Collections.sort(chocos,new SortByPrice()); // sorting candies by price
			System.out.println("chocolates in giftbox sorted on the prices");
	        	for(Chocolates j: chocos) {
	        		System.out.println(j.price);}
	}

  }
	public void rangeTheCandies(String option, float lower, float higher) {
		int k=1;
		if(option.compareTo("weight")==0) {
			//Collections.sort(candies,new SortByWeight()); sorting candies by weight
			System.out.println("candies in giftbox between "+lower+" "+higher);
        	for(Candies j: candies) {
        		if(j.weight>=lower && j.weight<=higher) {
        			System.out.println("candy "+k+" with weight "+ j.weight);}
        		k++;
        		}
		}
		if(option.compareTo("price")==0) {
			//Collections.sort(candies,new SortByPrice()); sorting candies by price 
			System.out.println("candies in giftbox  between "+lower+" "+higher);
        	for(Candies j: candies) {
        		if(j.price>=lower && j.price<=higher) {
        			System.out.println("candy "+k+" with price "+ j.price);}
        		k++;
        		}
		}

	}
}
