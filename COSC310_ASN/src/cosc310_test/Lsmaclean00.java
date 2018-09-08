package cosc310_test;

import java.util.*;

/** 
* Author: Luke MacLean
* Date: 9/8/2018
* Assignment: Lab00 
**/

public class Lsmaclean00 {

    public static void main(String[] args) {
        // Declare Variables
    	problem2();
    }

    /**this method iterates over an ArrayList and a
    * LinkedList, adding string values of the current 
    * iteration. 
    **/
    public static void problem2() {
        //variables
        List a = new ArrayList<>(100000);
        List b = new LinkedList();
        long start = System.currentTimeMillis();
        //looping through the ArrayList a  
        for (Integer i = 0; i < a.size(); i++) {
            a.add(i, Integer.toString(i));
        }
        long stop = System.currentTimeMillis();
        long time = stop - start; 
        System.out.println("ArrayList time : " + time);
        
        //LinkedList
        start = System.currentTimeMillis();
        for (Integer j = 0; j < 100000; j++) {
            b.add(j, Integer.toString(j));
        }
        stop = System.currentTimeMillis();
        time = stop - start;
        System.out.println("LinkedList time : " + time);
        
    }
}
