package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {
    private static final ArraySorter arraySorter = new ArraySorter();

    @Test
    public void testSortShouldSortWhenPositiveNumbers() {
        Array array = new Array(new int[]{-3, -5, 34, 67, 22, 5, -20, 84, 44});
        Array sortedArrayResult = new Array(new int[]{5, 22, 34, 44, 67, 84});
        Array sortedPositiveArray = arraySorter.sort(array);
        Assert.assertEquals(sortedArrayResult, sortedPositiveArray);
    }

    @Test
    public void testSortShouldSortWhenNegativeNumbers() {
        Array array = new Array(new int[]{-4, -8, 10, -1, 0, 20, -50, -39, 30, -7, -20});
        Array sortedArrayResult = new Array(new int[]{-50, -39, -20, -8, -7, -4, -1});
        Array sortedNegativeArray = arraySorter.sortNegative(array);
        Assert.assertEquals(sortedArrayResult, sortedNegativeArray);
    }

    @Test
    public void testBubbleSort() {
        Array array = new Array(new int[]{3, 6, 7, 8, 9, 2, 3, 5, 79});
        Array sortedArrayResult = new Array(new int[]{2, 3, 3, 5, 6, 7, 8, 9, 79});
        Array bubbleSortedArray = arraySorter.bubbleSort(array);
        Assert.assertEquals(sortedArrayResult, bubbleSortedArray);
    }
}
