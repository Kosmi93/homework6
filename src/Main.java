import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkYear(2000));
        System.out.println(checkingOsVersion(0, LocalDate.now().getYear()));
        System.out.printf("Для доставки потребуется %d дней",calculationTimeDelivery(150) );


    }

    public static String checkYear(int year){
        String result;
        if(year < 1584){
            result = "Понятие високосный год введено в 1584 году";
        } else if ((year % 4 ==0) && (year % 100 !=0 || year % 400 ==0)) {
            result =String.format("%d год является високосным.",year);
        } else {
            result =String.format("%d год не является високосным.",year);
        }
        return result;
    }

    public static String checkingOsVersion(int clientOS,int clientDeviceYear){

        String versionOS = clientDeviceYear < 2015 ?
                "Установите облегченную версию приложения для ":
                "Установите версию приложения для ";
        if (clientOS ==0){
           return (versionOS + "iOS по ссылке");
        } else {
            return (versionOS + "Android по ссылке");
        }
    }

    public static int calculationTimeDelivery(int deliveryDistance){

        if( deliveryDistance < 20) {
            return 1;
        } else if(deliveryDistance < 60) {
            return 2;
        } else if(deliveryDistance <= 100) {
           return 3;
        } else {
            throw new RuntimeException("Доставка всыше 100км не производится!");
        }
    }
}