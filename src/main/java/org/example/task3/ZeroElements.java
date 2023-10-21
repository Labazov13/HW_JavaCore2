package org.example.task3;

//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class ZeroElements {
    int[] array;

    public ZeroElements(int[] array) {
        this.array = array;
    }

    public void zeroElements(int[] array) {
        int counter = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                counter++;
                if(counter == 2){
                    check = true;
                    break;
                }
            }
            else {
                counter = 0;
            }
        }
        System.out.println(check);
    }
}
