package com.bobocode;


import java.util.stream.IntStream;

import com.bobocode.exception.InvalidRangeException;


/**
 * This class allow to calculate a sum of squares of integer number in a certain range. It was implemented using
 * OO approach. Your job is to refactor it using functional approach. E.g. avoid using mutable variables
 */
public class SumOfSquares {
    public static void main(String[] args) {
        System.out.println("Sum of squares from -4 to -2 is " + calculateSumOfSquaresInRange(-4, -2));
    }

    /**
     * This method calculates the sum of squares of integer in the range
     *
     * @param startInclusive first element in range
     * @param endInclusive last element in range
     * @return the sum of squares of each element in the range
     */
    static int calculateSumOfSquaresInRange(int startInclusive, int endInclusive) {
        if (endInclusive < startInclusive) {
            throw new InvalidRangeException();
        }

        IntStream streamNumeros=IntStream.rangeClosed(startInclusive, endInclusive);
        
        
        return streamNumeros
        		.reduce(0,(acumulador,numero)->acumulador+(int)Math.pow(numero, 2));       
    }
}
