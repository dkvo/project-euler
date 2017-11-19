package com.KhoaVo;

/**
 * Created by dangkhoavo on 11/18/17.
 */
public class Problem1 {

    public void solver() {
        int i;
        int sum = 0;
        for(i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
            }

            else if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
