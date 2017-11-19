package com.KhoaVo;

/**
 * Created by dangkhoavo on 11/18/17.
 */
public class Problem2 {
    public void solver() {
        int sum = 2;
        int newTerm = 0;
        int i;
        int j;
        for (i = 1, j = 2; j <= 4000000; i = j, j = newTerm) {
            newTerm = i + j;
            if(newTerm % 2 ==0)
                sum += newTerm;
        }
        System.out.println(sum);
    }
}
