package com.epam.training.array;

import com.epam.training.array.impl.BubbleArraySorter;
import com.epam.training.array.impl.NegativeNumbersArraySorter;
import com.epam.training.array.impl.PositiveNumbersArraySorter;
import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {
    private ArraySorter arraySorter;

    @Test
    public void testSortShouldSortWhenPositiveNumbers() {
        //given
        Array array = new Array(new int[]{-3, -5, 34, 67, 22, 5, -20, 84, 44});
        Array expectedArray = new Array(new int[]{5, 22, 34, 44, 67, 84});
        arraySorter = new PositiveNumbersArraySorter();
        //when
        Array actualArray = arraySorter.sort(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testSortShouldSortWhenNegativeNumbers() {
        //given
        Array array = new Array(new int[]{-4, -8, 10, -1, 0, 20, -50, -39, 30, -7, -20});
        Array expectedArray = new Array(new int[]{-50, -39, -20, -8, -7, -4, -1});
        arraySorter = new NegativeNumbersArraySorter();
        //when
        Array actualArray = arraySorter.sort(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSort() {
        //given
        Array array = new Array(new int[]{3, 6, 7, 8, 9, 2, 3, 5, 79});
        Array expectedArray = new Array(new int[]{2, 3, 3, 5, 6, 7, 8, 9, 79});
        arraySorter = new BubbleArraySorter();
        //then
        Array actualArray = arraySorter.sort(array);
        //then
        Assert.assertEquals(expectedArray, actualArray);
    }
}
