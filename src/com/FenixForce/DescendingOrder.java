package com.FenixForce;
import java.util.*;
public class DescendingOrder {
    public static int sortDesc(final int num) {
        System.out.println("Incoming Number: "+num+"\n");
        String strNum = Integer.toString(num);
        System.out.println("Number is now a String: "+strNum);
        System.out.println("Number of Digits: " +strNum.length());
        int[] arrayNum = new int[strNum.length()];
        int[] sortNum = new int[strNum.length()];
        System.out.println("Created array\nStart of FOR-LOOP");
        for(int i = 0 ; i < strNum.length() ; i++){
            arrayNum[i] = strNum.charAt(i) - '0';
            System.out.print(arrayNum[i]); //arrayNum = {123456789}

            if(arrayNum[i] > strNum.length()){
                arrayNum[strNum.length()-1] = arrayNum[i];
            }
            }

        /*//this for loops starts at the end of teh array and de-increments to [0]
        //System.out.println("\nReverse it ");
        int max = strNum.length() -1 ;
        for(int j = max; j >= 0; j--){
            System.out.print(arrayNum[j]);  //987654321{
        }*/

        System.out.println("\nFor EACH loop:");
        for(int stringN : arrayNum)
            System.out.print(stringN); //123456789

    return num;
    }

}
