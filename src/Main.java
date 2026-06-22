//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("задача №1");
        int age = 8;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }


        //Задача №2
        System.out.println("Задача №2");
        int temp = 6;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println(" На улице " + temp + " градусов, можно идти без шапки");
        }


        //Задача №3
        System.out.println("Задача №3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        if (speed <= 60) {
            System.out.println("Можно ездить спокойно");
        }

        //Задача №4
        System.out.println("Задача №4");
        int age4 = 16;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека " + age4 + " то ему нужно ходить в садик");
        }
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека " + age4 + " то ему нужно ходить в школу");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека " + age4 + " то ему нужно ходить в инстут");
        }
        if (age4 >= 25) {
            System.out.println(" Если возраст человека " + age4 + " то ему нуужно ходить на работу");
        }


        //Задача №5
        System.out.println("Задача №5");
        int ageBaby = 15;
        if (ageBaby<5){
            System.out.println("Если возраст ребенка равен " + ageBaby + " , то ему нельзя кататься на атракционе");}
        if (ageBaby >= 5 && ageBaby <14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " , то ему можно кататься на атракционе в сопровождении взрослых");}
        if ( ageBaby >= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " , то ему можно кататься на атракционе без сопровождения");}


        //Задача №6
        System.out.println("Задача №6");
        int seat = 102;
        if (seat < 102) {
            System.out.println(" В вагоне есть свободные места ");}
        else {
            System.out.println("В вагоне нет свободных мест");}
        if (seat>=0 && seat <=59) {
            System.out.println("В вагоне есть свободное сидячее место");}
        if (seat >=60 && seat <=101){{
            System.out.println("В вагоне нет свободных сидячих мест, но есть свободные стоячие места");}}


        //Задача№7
        System.out.println("Задача №7");
        int one = 20;
        int two = 30;
        int three = 10;
        int max;

        if (two > one && two > three) {
            max = two;
        } else if (three > one && three > two) {
            max = three;
        } else {
            max = one;
        }

        System.out.println("Самое большое число: " + max);








    }









}