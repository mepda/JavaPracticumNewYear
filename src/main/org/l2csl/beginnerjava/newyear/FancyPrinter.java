package org.l2csl.beginnerjava.newyear;

/**
 * Created by hector on 1/7/17.
 */
public class FancyPrinter {

    String[] stringArr;


    public FancyPrinter(String word) {
        stringArr = word.split(" ");
    }

    public void print(){
        for (String word: stringArr) {
            System.out.println(word);
        }
    }

}
