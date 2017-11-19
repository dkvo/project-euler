package com.KhoaVo;

/**
 * Created by dangkhoavo on 11/18/17.
 */
public class Problem3 {

    public void solver(long num) {
        int i;
        int largest = 0;
        if(!isPrime(num)) {
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    num /= i;
                    if (isPrime(i)) {
                        if (i > largest)
                            largest = i;
                    }
                }
            }
        }
        else {
            System.out.println("the largest prime factor is " + num);
        }

        System.out.println("the largest prime factor is " + largest);
    }

    private boolean isPrime(long num) {
        int counter = 2;
        while (counter <= Math.sqrt(num)) {
            if(num % counter == 0)
                return false;
            counter++;
        }
        return true;
    }
}
