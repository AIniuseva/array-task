package com.epam.training.array;

import com.epam.training.array.impl.ArrayLogic;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class ArrayLogicTest {
    private static final ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testExists() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        boolean isExist = arrayLogic.exists(array, 10);
        Assert.assertTrue(isExist);
    }

    @Test
    public void testNotExists() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        boolean isExist = arrayLogic.exists(array, 88);
        Assert.assertFalse(isExist);
    }

    @Test
    public void testFindPrimeNumbers() {
        Array array = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Array expectedArray = new Array(new int[]{2, 3, 5, 7});
        Array actualArray = arrayLogic.findPrimeNumbers(array);
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testFindMinValue() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        int actualValue = arrayLogic.findMinValue(array);
        Assert.assertEquals(2, actualValue);
    }

    @Test
    public void testFindMaxValue() {
        Array array = new Array(new int[]{5, 7, 2, 9, 8, 10, 4});
        int actualValue = arrayLogic.findMaxValue(array);
        Assert.assertEquals(10, actualValue);
    }

    @Test
    public void testGetAllNoIdenticalThreeDigitNumbers() {
        Array array = new Array(new int[]{222, 45, 123, 67, 894, 232, 548});
        Array expectedArray = new Array(new int[]{123, 894, 548});
        Array actualArray = arrayLogic.getAllNoIdenticalThreeDigitNumbers(array);
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testReadArrayFromFile() {
        File file = new File("src/test/resources/testdata.txt");
        Array actualArray = new Array(file);

        Array expectedArray = new Array(new int[]{1, 2, 3, 4, 5, 6, 7});
        Assert.assertEquals(expectedArray, actualArray);
    }
}
