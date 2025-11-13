package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        if (centimetre < 100) {
            return 0;
        }
        return centimetre / 100;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = getMetreFromCentimetre(11120);
        System.out.println(result);

    }

}
