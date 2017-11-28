package mobileapp.a1127android;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by fallaye on 11/28/17.
 */

public class Coding {
    //Problem 1
    //Create a function to print the duplicate in a lsit of string

    public String printDuplicate(String listStr){
        String list[] = listStr.split(" ");
        String duplicateList = "";

        Set <String> uniqueStr = new HashSet<String>();

        for(int i = 0; i < list.length - 1; i++){
            if(!uniqueStr.contains(list[i])){
                duplicateList += list[i] + " ";
            }
        }
        //System.out.println(duplicateList);
        return duplicateList;
    }

    //Problem 2
    // Create a function to check if the string is a palindrome

    public boolean palin(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    //Problem 3
    // Create a function that will print
    // "fizz" is the number is divisible by 3
    // "buzz" is the number is divisible by 5
    // "fizzBuzz" is the number is divisible by both
    // and the integer for the rest

    public String isDivisible(int num) {
        //for (int i = 0; i < num; i++) {
            if (num / 3 == 0 && num / 5 == 0) {
                return "fizzBuzz";
            }
            if (num / 3 == 0) {
                return "fizz";
            }
            if (num / 5 == 0) {
               return "buzz";
            }
            return "None";
        //}
    }

    public static void main(String[] args){
        //Test dublicate string
        String list = "John Victor Sam Sam";
        Coding test = new Coding();
        System.out.println(test.printDuplicate(list));

        //Is Palin
        if(test.palin("radar")){
            System.out.println("Palin");
        }else{
            System.out.println("Not a Palin");
        }

        //Test for divisibility
        System.out.println(test.isDivisible(15));
    }
}

