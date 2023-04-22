package com.cyk.test2;

import java.util.Random;

/**
 * Class: BinaryOperator2
 * Date: 2023/3/2
 */

public class BinaryOperator2 {
    public static void main(String[] args) {
        short m=0, n=0, ov=0;
        char o='+';
        Random random = new Random();
        for(int i=0;i<50; i++){
            ov = (short) random.nextInt(2);
            m = (short) random.nextInt(101);
            n = (short) random.nextInt(101);
            if( ov == 1) {
                o = '+';
            } else {
                o = '-';
            }
            System.out.println(""+(i+1)+":\t"+m+o+n+'=');
        }
    }
}
