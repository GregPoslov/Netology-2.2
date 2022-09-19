import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tp = new Scanner(System.in);
        System.out.println("Сумма пополнения счета:");

        int ticketPrice = tp.nextInt(); //Стоимость биллета

        if (ticketPrice < 1000) {
            System.out.println("Количество бонусов = 0");
        } else {
            System.out.println("Количество бонусов = " + ticketPrice / 100);
        }


    }
}