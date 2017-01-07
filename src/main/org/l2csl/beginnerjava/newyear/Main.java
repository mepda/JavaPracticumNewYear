package org.l2csl.beginnerjava.newyear;

public class Main {

    public static int Add(int x, int y){
        return(x+y);
    }
    public static void explode(String word){
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        int sum;
        sum = Add(3,5);
        explode("Boom");
        FancyPrinter fancy = new FancyPrinter("I CAN CODE");
        fancy.print();

        ClassyPrinter classy = new ClassyPrinter("I'm a pro");
        classy.print();
        classy.print(true);
    }
}

