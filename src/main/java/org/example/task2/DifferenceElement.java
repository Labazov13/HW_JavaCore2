package org.example.task2;

//Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
public class DifferenceElement {
    int[] array;

    public DifferenceElement(int[] array) {
        this.array = array;
    }

    public void differenceElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int difference = array[array.length - 1] - array[0];
        System.out.println("Разница между максимальным и минимальным элементом равна " + difference);
    }
}
