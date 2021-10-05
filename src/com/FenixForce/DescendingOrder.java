package com.FenixForce;
import java.util.*;
/*Examples:
        Input: 42145 Output: 54421

        Input: 145263 Output: 654321

        Input: 123456789 Output: 987654321

 */
public class DescendingOrder {
    //method
    static String convertINTtoString(int num) {
        System.out.println("----convertINTtoString-----");
        String temp = Integer.toString(num);
        return temp;
    }
    //method
    static int[] convertSTRINGtoArray(String strNum) {
        System.out.println("----convertSTRINGtoArray-----");
        int[] arrayNum = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            arrayNum[i] = strNum.charAt(i) - '0';
            System.out.print(arrayNum[i]); //arrayNum = {123456789}
        }
        return arrayNum;
    }

    static int[] sorterMethod(int[] num){
        System.out.println("----SORTING IT-----");
        int temp = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i +1; j <num.length; j++){
                if(num[i] < num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    static int returnNumber(int[] num){
        int tempNum = 0;
        for(int i = 0; i < num.length; i++){
            tempNum *= 10;
            tempNum += num[i];
        }
        return tempNum;
    }

    public static int sortDesc(final int num) {
        System.out.println("Incoming number: "+num);
        System.out.println("===Inside the sortDesc method");
        //Take the int number and convert to string.
        String strNum = convertINTtoString(num);
        System.out.println("\n===Result of convertINTtoString "+strNum);
        // take the returned String from convertINTtoString() and put each number
        // into an array
        int[] arrNum = convertSTRINGtoArray(strNum);
        System.out.println("\n===Result of convertSTRINGtoArray ");
        int[] sortNum = new int[strNum.length()];
        sorterMethod(arrNum);

        //"for-each StringN in arrayNum"the array and prints its contents from index [0] - [8]
        int newNum = returnNumber(arrNum);
        System.out.println("\n===Leaving sortDesc METHOD\n"+newNum);


        return newNum;
    }
}



