package HomeWork;

import ClassWork.Generic.OgranichType;

public class Main {
    public static void main(String[] args) {
        Integer[] mass1 = {1,2,3,4,5,6,7,8};
        Task2<Integer> task2One = new Task2<Integer>(mass1, 1 , 2);
        task2One.arraySwap();


    }
}
