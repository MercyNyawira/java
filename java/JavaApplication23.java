/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author STUDENTS
 */
public class JavaApplication23 {
public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int first = 1;
        int second = 2;
        
        while (second <= limit) {
            if (second % 2 == 0) {
                sum += second;
            }
            
            int next = first + second;
            first = second;
            second = next;
        }
        
        return sum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10; // number of terms to generate
        int first = 1; // first term
        int second = 2; // second term
        
        System.out.print("First " + n + " terms of Fibonacci sequence: ");
        System.out.print(first + " " + second + " ");
        
        for (int i = 3; i <= n; i++) {
            int next = first + second; // generate the next term
            System.out.print(next + " ");
            first = second; // shift the terms
            second = next;
        }
        
        int limit = 4000000; // maximum term value for summing even terms
        int sumEven = sumEvenFibonacci(limit);
        System.out.println("\nSum of even-valued Fibonacci terms below " + limit + ": " + sumEven);
        
        // Bonus: print the first 20 prime numbers
        int count = 0;
        int num = 2;
        System.out.print("First 20 prime numbers: ");
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
    }
    
}
