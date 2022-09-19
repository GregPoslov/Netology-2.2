import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tp = new Scanner(System.in);
        System.out.println("Сумма пополнения счета:");

        int ticket_price = tp.nextInt(); //Стоимость биллета

        if (ticket_price < 1000) {
            System.out.println("Количество бонусов = 0");
        } else {
            System.out.println("Количество бонусов = " + ticket_price / 100);
        }


    }
}