package HomeWork;

import java.util.Arrays;

public class Task2 <T> {
    private T[] numbers;
    private int i1;
    private int i2;

    public Task2( T[] numbers, int i1, int i2) {
        this.numbers = numbers;
        this.i1 = i1;
        this.i2 = i2;

    }

    public void arraySwap() {
        T baga = numbers[i1];
        numbers[i1] = numbers[i2];
        numbers[i2] = baga;

        System.out.println(Arrays.toString(numbers));
    }
}


