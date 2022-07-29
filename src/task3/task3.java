package task3;
//Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
//С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
// например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class task3 {
    public void bDay(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate start = LocalDate.parse(time, formatter);
        LocalDate ld = LocalDate.now();
        Period period = Period.between(start, ld);
        System.out.println("Вам исполнилось:   ");
        System.out.println(period.getYears() + "   years");
        System.out.println(period.getMonths() + "   month");
        System.out.println(period.getDays() + "   days");


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task3 t = new task3();

        System.out.println("Введите : dd.mm.yyyy");
        String s = scanner.next();
        t.bDay(s);


    }
}
