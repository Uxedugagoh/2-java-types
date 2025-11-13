package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int oneSide = getNumberOfTentSideInAreaSide(n, k);
        int twoSide = getNumberOfTentSideInAreaSide(m, k);

        return oneSide * twoSide;
    }

    private static int getNumberOfTentSideInAreaSide(int n, int k) {
        int count = 0;
        while (n >= k) {
            count += 1;
            n -= k;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(10, 20, 5);
        System.out.println(result);
        */
    }

}
