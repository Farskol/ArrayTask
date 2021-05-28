package com.arrays;

import com.arrays.entity.array;
import com.arrays.service.Calculation;
import com.arrays.service.Sorting;
import com.arrays.service.impl.CalculationImpl;
import com.arrays.service.impl.SortingImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Calculation calculation = new CalculationImpl();
    Sorting sorting = new SortingImpl();

	array array = new array(1, 2, 5, 3, 1, 5, 1);

	System.out.print(Arrays.toString(array.getArray()) + "\n");

	System.out.print(sorting.getMinElement(array) + "\n");

	System.out.print(sorting.getMaxElement(array) + "\n");

	System.out.println(calculation.meanOfArray(array));

	sorting.replacementAllMinElementsOnMax(array);

	System.out.println(Arrays.toString(array.getArray()));

	System.out.println(calculation.numberOfPositiveElements(array));
    }
}
