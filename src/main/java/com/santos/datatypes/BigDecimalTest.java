package com.santos.datatypes;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalTest {
    public static void main(String[] args) {
        // Create two new BigDecimals
        BigDecimal bd1 =
                new BigDecimal("124567890.098");
        BigDecimal bd2 =
                new BigDecimal("987654321.123");

        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal1 = " + bd1);
        MathContext m=new MathContext(4);
        System.out.println(bd1.round(m).intValue());
// 		// Multiplication of two BigDecimals
// 		bd1 = bd1.multiply(bd2);
// 		System.out.println("BigDecimal1 = " + bd1);

// 		// Subtraction of two BigDecimals
// 		bd1 = bd1.subtract(bd2);
// 		System.out.println("BigDecimal1 = " + bd1);

// 		// Division of two BigDecimals
// 		bd1 = bd1.divide(bd2);
// 		System.out.println("BigDecimal1 = " + bd1);

// 		// BigDecima1 raised to the power of 2
// 		bd1 = bd1.pow(2);
// 		System.out.println("BigDecimal1 = " + bd1);

// 		// Negate value of BigDecimal1
// 		bd1 = bd1.negate();
// 		System.out.println("BigDecimal1 = " + bd1);
    }
}
