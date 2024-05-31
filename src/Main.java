import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear(2024);
        checkYear(2020);
        checkYear(2019);
        checkYear(2028);
        checkYear(2017);


        currentYear(1, 2020);
        currentYear(0, 2024);
        currentYear(1, 2024);

        int days = calculateDistance(157);
        if (days > 0) {
            System.out.println("количество дней = " + days);
        } else {
            System.out.println("Доставки нет");

        }
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");

        }
    }
        public static void currentYear ( int osType, int year) {

            int currentYear = LocalDate.now().getYear();
            if (osType != 0 && osType != 1) {
                System.out.println("Ошибка: неккоректный тип операционной системы.");
                return;
             if (osType == 0) {
                    if (year < currentYear) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                } else if (osType == 1) {
                    if (year < currentYear) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для iOS по ссылке");

                    }
                }
            }
        }        public static int calculateDistance ( int distance){
                    if (distance > 100) {
                        return -1;
                    }
                    int days = 1;
                    if (distance > 20) {
                        days++;
                    }
                    if (distance > 60) {
                        days++;
                    }
                        return days;
                    }
    }












