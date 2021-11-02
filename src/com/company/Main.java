package com.company;

import java.util.ArrayList;
import java.util.List;

// Given a list of integers, return a list where each integer is multiplied by 2.
public class Main {
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(item -> item * 2);
        return nums;
    }

    public static void main(String[] args) {
	List<Integer> myList = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
	doubling(myList);
	for(Integer i : myList){
	    System.out.println(i);
    }
    }
}
