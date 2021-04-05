package com.epam.training.array;

import com.epam.training.array.impl.ArrayLogic;

import java.io.File;
import java.util.Arrays;

public class Array {

    private final int[] items;

    public Array(int[] items) {
        this.items = items;
    }

    public Array(int quantityOfElements, int minValue, int maxValue) {
        ArrayLogic arrayLogic = new ArrayLogic();
        this.items = arrayLogic.generateRandomArray(quantityOfElements, minValue, maxValue);
    }

    public Array(File file) {
        ArrayLogic arrayLogic = new ArrayLogic();
        this.items = arrayLogic.readArrayFromFile(file);
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
}
