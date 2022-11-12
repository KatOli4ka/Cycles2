public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("ДЗ-1. Задание 2");

        int N = 1;
        while (N <= 10) {
            System.out.print(N++ + " ");
        }
        System.out.println();
        for (N = 10; N >= 1; ) {
            System.out.print(N-- + " ");
        }
        System.out.println();

        System.out.println("ДЗ-1. Задание 3");

        int Y = 12000000;
        int born = 17;
        int death = 8;
        int growth = born - death;
        for (int year = 1; year <= 10; year++) {
            Y += Y * growth / 1000;
        }
        System.out.println(Y);


        System.out.println("ДЗ-2. Задание 1");
        int dep = 15000;
        double percent = 0.07;
        float sum = 0;
        int month = 1;
        while (sum <= 12_000_000) {
            sum = (float) ((sum + dep) * (1 + percent));
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + sum + " рублей");
        }


        System.out.println("ДЗ-2. Задание 2");
        int dep1 = 15000;
        double percent1 = 0.07;
        float sum1 = 0;
        int month1 = 1;
        while (sum1 <= 12_000_000) {
            sum1 = (float) ((sum1 + dep1) * (1 + percent1));
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + sum1 + " рублей");
            }
            month1++;
        }


        System.out.println("ДЗ-2. Задание 3");
        int dep2 = 15000;
        double percent2 = 0.07;
        float sum2 = 0;
        for (int month2 = 1; month2 <= 108; ) {
            sum2 = (float) ((sum2 + dep2) * (1 + percent2));
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + sum2 + " рублей");
            }
            month2++;
        }

        System.out.println("ДЗ-2. Задание 4");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("ДЗ-3. Задание 1");
        int passingComet = 79;
        int now = 2022;
        int past = now - 200;
        int future = now + 100;
        int data = 0;
        while (data <= now) {
            data = data + passingComet;
            if (data >= past && data <= future) {
                System.out.println(data);
            }

        }

        System.out.println("ДЗ-3. Задание 2");
        int number = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(number + " * " + count + " = " + number * count);
        }


    }
}



