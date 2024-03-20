import java.time.LocalDate;

public class Main {
    public static void printClientOSAndYear(int clientOS, int year) {
        int clientDeviceYear = year;
        if (clientOS==0 && clientDeviceYear <2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==0 && clientDeviceYear > 2015) {
            System.out.println("Скачайте приложение для iOS");
        }
        if (clientOS==1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==1) {
            System.out.println("Скачайте приложение для Android");
        }
    }
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        printClientOSAndYear(1,currentYear);
    }
}