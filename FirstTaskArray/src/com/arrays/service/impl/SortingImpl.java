package com.arrays.service.impl;

import com.arrays.entity.array;
import com.arrays.service.Sorting;

public class SortingImpl implements Sorting {

    public int getMinElement(array array){
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) < x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public int getMaxElement(array array){
        int x = array.getElementOfArray(0);
        for (int i = 0; i < array.getLengthArray(); i++){
            if (array.getElementOfArray(i) > x){
                x = array.getElementOfArray(i);
            }
        }
        return x;
    }

    public void replacementAllMinElementsOnMax(array array){
        int x [] = array.getArray();
        for (int i = 0; i < x.length; i++){
            if (x[i] == getMinElement(array)){
                x[i] = getMaxElement(array);
            }
            array.setArray(x);
        }
    }
}
