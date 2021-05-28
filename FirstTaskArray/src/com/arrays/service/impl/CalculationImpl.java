package com.arrays.service.impl;

import com.arrays.entity.array;
import com.arrays.service.Calculation;

public class CalculationImpl implements Calculation {

    public int sumOfElementsArray(array array){
        int sum = 0;
        for (int i = 0; i < array.getLengthArray(); i++){
            sum += array.getElementOfArray(i);
        }
        return sum;
    }

    public int meanOfArray(array array){
        return sumOfElementsArray(array)/array.getLengthArray();
    }

    public int numberOfPositiveElements(array array){
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) > 0){
                x++;
            }
        }
        return x;
    }

    public int numberOfNegativeElements(array array){
        int x = 0;
        for(int i = 0; i < array.getLengthArray(); i++){
            if(array.getElementOfArray(i) < 0){
                x++;
            }
        }
        return x;
    }
}
