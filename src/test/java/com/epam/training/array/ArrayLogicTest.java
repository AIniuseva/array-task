package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {
    private static final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testExists() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        boolean isExist = arrayLogic.exists(array, 10);
        Assert.assertTrue(isExist);
    }

    @Test
    public void testFindPrimeNumbers() {
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Array result = new Array(new int[]{2, 3, 5, 7});
        Array primeNumbersArray = arrayLogic.findPrimeNumbers(array);
        Assert.assertEquals(result, primeNumbersArray);
    }

    @Test
    public void testFindMinValue() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        int minValue = arrayLogic.findMinValue(array);
        Assert.assertEquals(2, minValue);
    }

    @Test
    public void testFindMaxValue() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        int minValue = arrayLogic.findMaxValue(array);
        Assert.assertEquals(10, minValue);
    }
}
