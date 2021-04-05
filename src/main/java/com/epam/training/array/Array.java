package com.epam.training.array;

import java.util.Arrays;
import java.util.Random;

public class Array {

    private final int[] items;

    public Array(int[] items) {
        this.items = items;
    }

    public Array(int quantityOfElements, int minValue, int maxValue) {
        this.items = generateRandomArray(quantityOfElements, minValue, maxValue);
    }

    public int[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Array{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(items, array.items);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(items);
    }

    private int[] generateRandomArray(int quantityOfElements, int minValue, int maxValue) {
        Random random = new Random();
        int[] arrayWithRandomValues = new int[quantityOfElements];
        for (int i = 0; i < quantityOfElements; i++) {
            arrayWithRandomValues[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        return arrayWithRandomValues;
    }
}
