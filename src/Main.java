public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1. Задание 1");
int deposit=15000;
int total=0;
int i=0;
while(total < 2_459_000){
        total=total+deposit;i++;
    System.out.println("Месяц " +i+", сумма накоплений равна "+total+" рублей");
    }

        System.out.println("ДЗ-1. Задание 2");

    int N=1;
       while (N<=10) {
           System.out.print(N++ +" ");}
           System.out.println();
for (N=10; N>=1;){System.out.print(N-- +" ");}
        System.out.println();

        System.out.println("ДЗ-1. Задание 3");

        int Y= 12000000;
        int born = 17;
        int death = 8;
        int growth = born - death;
        for (int year=1; year<=10;year++) {Y += Y * growth / 1000;
        }
        System.out.println(Y);

    }
}