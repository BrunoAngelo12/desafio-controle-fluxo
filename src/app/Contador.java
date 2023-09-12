package app;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first parameter: ");
        int firstParameter = sc.nextInt();
        System.out.print("Enter the second parameter: ");
        int secondParameter = sc.nextInt();
        count(firstParameter, secondParameter);

        sc.close();
    }

    static void count (int firstParameter, int secondParameter) throws ParametrosInvalidosException{
        System.out.println("hello");
    }

    

}
