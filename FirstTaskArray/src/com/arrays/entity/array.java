package com.arrays.entity;

public class array {
    private int array [];

    public array(){
        this.array = new int[0];
    }

    public array(int ...array) {
        this.array = array;
    }

    public void setArray(int [] array){
        this.array = array;
    }

    public int [] getArray(){
        return this.array;
    }

    public int getLengthArray(){
        return this.array.length;
    }
    public int getElementOfArray(int index){
        //validation
        return this.array[index];
    }

    //setElementOfArray

    //toString

    //hashCode

    //equals
}
