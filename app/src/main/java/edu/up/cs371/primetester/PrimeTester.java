package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        boolean answer = false;

        if(n == 0 || n == 1){
            //answer is false
        }
        else if(n == 2){
            answer = true;
        }
        //check if odd or divisible by and odd number
        else if(n%2 > 0){
            for(int i = 3; i <= 1999; i = i+2){
                if(n%i > 0){
                    answer = true;
                }
            }
        }

        return answer;
        // for now, return a random result
        //return Math.random() > 0.5;
    }
}
