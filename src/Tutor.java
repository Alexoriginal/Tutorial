import java.util.Arrays;

public class Tutor {
    public static void main(String[] args) {

//        String e=" rast";
//        System.out.println(e);
//
//        String greeting = "Hello";
//        String s = greeting.substring(0, 3);
//        System.out.println(s);
//
//        String str1= "fuck";
//        String str2="  sheet";
//        String str3=str1+str2;
//        System.out.println(str3);
//
//        int age = 13;
//        String rating = "PG" + age;
//        System.out.println(rating);
//
//       greeting = greeting.substring(0, 3) + "p!";
//        System.out.println(greeting);// = help
//
//        int n = greeting.length();
//        System.out.println(n);
//
//        String  mass[]={"One","Lola,"};
//        for(String i:mass){
//            System.out.print(i);
//        }

        //=================================================
//        int[]a=new int[100];
//
//        for(int i=0;i<a.length;i++){
//            a[i]=i;
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//
//        for(int element:a){
//            System.out.print(element);
//        }
//

        //========================================================





//
//        String line = "Как использовать метод split";
//        String[] words = line.split(" ");
//        for(String element:words){
//            System.out.println(element);
//        }


//        String line = "Как использовать метод split";
//        String[] words = line.split(" ");
//
//        System.out.println("Используем разделитель: " + Arrays.toString(words));

//          String str="abcdefg";
//        //System.out.println(str);
//          String[]strMass=str.split(",");
//         // System.out.println(strMass.length);
//          for(String mass:strMass){
//              System.out.print(mass+"  ");
//              }
//        }
        //===============================================================
        String str="Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                "В альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...";
        char[] chArray=str.toCharArray();

        System.out.println(chArray);

        String[] mass=str.split("альбом");
        System.out.println(mass.length-1);

        String mass2=str.replace('В',')');
        System.out.println(mass2);


        String[] words = str.split("");
        for(String element:words){
            if(element.contains("альбом")){
                System.out.println(words.length-1);
            }

            //System.out.println(element);
        }






        //=======Просто берешь весь текст делаешь ему stick.split("альбом") и выводишь длину этого массива -1






    }
}