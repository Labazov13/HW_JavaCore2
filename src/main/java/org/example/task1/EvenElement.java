package org.example.task1;

//Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
public class EvenElement {
    int [] array;

    public EvenElement(int[] array) {
        this.array = array;
    }

    public void evenCount(int [] array){
        int countElement = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                countElement++;
            }
        }
        System.out.println(countElement);
    }
}
