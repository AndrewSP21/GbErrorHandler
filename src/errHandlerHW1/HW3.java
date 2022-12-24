package errHandlerHW1;

import java.util.Scanner;

public class HW3 {
//Иванов Иван Иванович 01.02.2000 9031234567 m
//f Петрова Юлия Сергеевна 10.02.2002 9261234567
//9850000007 Петрова Галина Карловна 10.02.2002 f
//9850000007 Сидоров Сергей Петрович 10.02.2002 m

    public static void main(String[] args) throws emptyLineException {
        System.out.println("==========");
        System.out.println("Введите через пробел данные: Фамилия Имя Отчество, Дата рождения(dd.mm.yyyy), " +
                "Номер телефона(только цифры), Пол(f или m)");
        System.out.println("Образец: Иванов Иван Иванович 14.04.2002 9031234567 m");
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        String[] arr = scanner.nextLine().split(" ");
        Note entry = ParserNote.parsing(arr, new Note());
        entry.checkNote();
        WriteFile.write(entry);

        System.out.println(entry.getInfo());
    }


}
