package errHandlerHW1;

import java.util.Scanner;

/*
 * 4.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class Hw24 {
    public static void main(String[] args) {
        try {
            emptyLineControl();
        } catch (emptyLineException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void emptyLineControl() throws emptyLineException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        if (scanner.nextLine().equals("")) {
            throw new emptyLineException("Пустые строки вводить не допускается");
        }
    }

}
