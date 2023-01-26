public class Main {
    //задача 1
    public static void checkYear(int year){
        if(year%4!=0 || (year%100==0 && year%400!=0)) System.out.println(year+" год - не високосный год.");
        else System.out.println(year+" год - високосный год.");
    }
    //задача 1

    //задача 2
    public static void checkOS(int clientOS, int clientOS2_manufacture){
        String tip = (clientOS==0)?"IOS": "Android";
        String yearManufacture = (clientOS2_manufacture<2015)?"облегченную":"стандартную.";
        System.out.println("Установите "+yearManufacture+" версию приложения для "+ tip+" по ссылке.");
    }
    //задача 2

    //задача 3
    public static int calculationDelivery(int deliveryDistance){
        int count = 0;
        if(deliveryDistance<=100) {
            if (deliveryDistance >= 0) count++;
            if (deliveryDistance >= 20) count++;
            if (deliveryDistance >= 60) count++;
        }
        return count;
    }
    //задача 3
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        int year = 1600;
        checkYear(year);
        System.out.println();

        System.out.println("Задача 2:");
        int clientOS = 0;
        int clientOS_manufacture = 2014;
        checkOS(clientOS, clientOS_manufacture);
        System.out.println();

        System.out.println("Задача 3:");
        int deliveryDistance = 2;
        System.out.println(calculationDelivery(deliveryDistance));

    }
}