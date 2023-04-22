package com.cyk.test2;

import java.util.Random;

/**
 * Class: BinaryOperator2
 * Date: 2023/3/2
 * 随机产生50道100以内的加减算式
 */
public class BinaryOperator1 {
    public static void main(String[] args) {
        int oper1, oper2;     // 定义左右两边操作数和操作符
        char[] oper = {'+', '-'};   // 定义操作符
        Random random = new Random();   // 产生随机数

        for (int i = 1; i <= 50; i++) {
            oper1 = random.nextInt(101);    //  产生100以内的随机数
            oper2 = random.nextInt(101);
            int r = random.nextInt(2);  // 产生操作符

            System.out.printf("%2d: %3d %c %3d = \t\t", i, oper1, oper[r], oper2);   // 格式化输出
            if(i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
