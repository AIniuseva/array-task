package com.epam.training.array;

import com.epam.training.array.impl.ArrayLogic;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class ArrayLogicTest {
    private static final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testExists() {
        //given
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        //when
        boolean isExist = arrayLogic.exists(array, 10);
        //then
        Assert.assertTrue(isExist);
    }

    @Test
    public void testNotExists() {
        //given
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        //when
        boolean isExist = arrayLogic.exists(array, 88);
        //then
        Assert.assertFalse(isExist);
    }

    @Test
    public void testFindPrimeNumbers() {
        //given
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Array expectedArray = new Array(new int[]{2, 3, 5, 7});
        //when
        Array actualArray = arrayLogic.findPrimeNumbers(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testFindMinValue() {
        //given
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        //when
        int actualValue = arrayLogic.findMinValue(array);
        //then
        Assert.assertEquals(2, actualValue);
    }

    @Test
    public void testFindMaxValue() {
        //given
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        //when
        int actualValue = arrayLogic.findMaxValue(array);
        //then
        Assert.assertEquals(10, actualValue);
    }

    @Test
    public void testGetAllNoIdenticalThreeDigitNumbers() {
        //given
        Array array = new Array(new int[]{222, 45, 123, 67, 894, 232, 548});
        Array expectedArray = new Array(new int[]{123, 894, 548});
        //when
        Array actualArray = arrayLogic.getAllNoIdenticalThreeDigitNumbers(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testReadArrayFromFile() {
        //given
        File file = new File("src/test/resources/testdata.txt");
        Array expectedArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7});
        //when
        Array actualArray = new Array(file);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testGetAllFibonacciNumbersFromArray() {
        //given
        Array array = new Array(new int[]{21, 13, 55, 144, 34, 89, 233});
        Array expectedArray = new Array(new int[]{13, 21, 34, 55, 89, 144, 233});
        //when
        Array actualArray = arrayLogic.getAllFibonacciNumbersFromArray(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }
}
