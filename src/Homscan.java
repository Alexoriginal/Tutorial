import java.util.Scanner;
import javax.swing.*;

public class Homscan {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Привет, введи цифру города в котором ты находишься:Днепре - 1, Киеве - 2 или Житомере - 3?");
        int firstQ=in.nextInt();
        switch (firstQ){
            case 1:
                System.out.println("Тебе повезло,это наш город!");
                break;
            case 2:
                System.out.println("Тебе повезло, это наша столица");
                break;
            case 3:
                System.out.println("Здесь шьют носки");
                break;
            default:
                System.out.println("Ты потерялся,садись на поезд и уезжай назад домой");
                break;
        }

        System.out.println("Тебе нужно найти гостинницу!!!Сколько денег у тебя есть?100,500 или 1000 грн");
        int twoQ=in.nextInt();
        if(twoQ<100){
            System.out.println("Ты можешь поселиться в хестеле");

        }
        else if(twoQ<500){
            System.out.println("Ты можешь снять квартиру посуточно");
        }
        else if(twoQ<10000){
            System.out.println("Заселяйся в гостинницу и живи как король");
        }
        else{
            System.out.println("Зря прибыл");
        }
        System.out.println("Ты прогодался?.Если ДА - 1 НЕТ - 2");
        int threeQ=in.nextInt();

        if(threeQ==1){
            System.out.println("Укажи на какую сумму ты готовь поесть!");
            int fourQ=in.nextInt();
            if(fourQ<=50){
                System.out.println("Купи чебурек и запей пивом");
            }
            else if(fourQ<=200){
                System.out.println("Можно зайти в Mcdonalds");
            }
            else if(fourQ<=500){
                System.out.println("Зайди паб и ни в чем себе не отказывай");
            }
            else if(fourQ>500){
                System.out.println("Тянешь на ресторан");
            }

        }
        else{
            System.out.println("Смотри телевизор и спи!!!");
        }





        //System.out.println("Поскольку ты уже поселился, пора поесть,что предпочитаешь?");
       // System.out.println("");






    }
}
