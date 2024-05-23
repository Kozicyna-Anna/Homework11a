import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear(2024);
        checkYear(2020);
        checkYear(2019);
        checkYear(2028);
        checkYear(2017);

        printDeviceVersion(1, 2020);
        printDeviceVersion(0, 2024);
        printDeviceVersion(1, 2024);

        int days = calculateDistance(157);
        if (days > 0) {
            System.out.println("количество дней = " + days);
        } else {
            System.out.println("Доставки нет");

        }
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " Год - невисокосный год");

        }
    }

    public static void printDeviceVersion(int osType, int year) {
        if (year < 0) {
            System.out.println("Год не может быть меньше 0!");
        } else {
            int currentYear = LocalDate.now().getYear();
            var type = osType == 1 ? "Android" : "iOS";
            var appType = year < currentYear ? "облегченную" : "";
            System.out.println("Установите " + appType + " версию для системы " + type);

        }
    }

    public static int calculateDistance(int distance) {
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



