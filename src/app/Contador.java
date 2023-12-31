package app;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("              Flow control - DIO challenge");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first parameter: ");
        int firstParameter = sc.nextInt();
        System.out.print("Enter the second parameter: ");
        int secondParameter = sc.nextInt();
        System.out.println();
        
        try{
            count(firstParameter, secondParameter);
        }catch (ParametrosInvalidosException e){
            System.err.println("Error: The second parameter must be greater than the first.");
        }finally{
            sc.close();
        }        
    }

    static void count (int firstParameter, int secondParameter) throws ParametrosInvalidosException{
        if (firstParameter > secondParameter){
            throw new ParametrosInvalidosException();
        }else{
            int score = secondParameter - firstParameter;
            for(int i = 1; i <= score; i++){
                if(i == score){
                    System.out.println("Printing number " + (i) + ".");
                }else{
                    System.out.print("Printing number " + (i) + ", ");
                }
            }
        }
    }

    

}
