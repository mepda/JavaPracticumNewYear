package org.l2csl.beginnerjava.newyear;

/**
 * Created by hector on 1/7/17.
 */
public class ClassyPrinter extends FancyPrinter {

    public ClassyPrinter(String word) {
        super(word);
    }

    public void print(){
        for (int i = stringArr.length -1 ; i >= 0; i--) {
            System.out.println(stringArr[i]);
        }
    }
    public void print(boolean answer){
        if(answer == true){
            super.print();
        } else{
            this.print();
        }
    }
}
