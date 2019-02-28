package NumWrappers;


import java.util.Scanner;

public class numWrappersMain {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        byte bVal = 0;
        long lVal = 0;
        short sVal = 0;
        float fVal = 0;

        System.out.println("enter a number");
        int num = keyboard.nextInt();

        if((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE)){
            bVal = (byte)num;
            System.out.println("This number can be put into a byte: " + (byte)num);
        }else if((num <=Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
            sVal = (short)num;
            System.out.println("This number can be put into a short: " + (short)num);
        }else if((num <= Long.MAX_VALUE) && (num >= Long.MIN_VALUE)){
            lVal = (long)num;
            System.out.println("This number can be put into a long: " + (long)num);
        }else{

        }
    }
}
