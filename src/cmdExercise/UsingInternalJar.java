package cmdExercise;

import cmdExercise.MathLibrary.MyMathJar;

public class UsingInternalJar {

    public static void main(String [] args){
        int first = 10;
        int second = 2;

        System.out.println(first+" + "+second+" = "+ MyMathJar.sum(first, second) );
        System.out.println(first+" - "+second+" = "+ MyMathJar.sub(first, second) );
        System.out.println(first+" * "+second+" = "+ MyMathJar.mul(first, second) );
        System.out.println(first+" / "+second+" = "+ MyMathJar.div(first, second) );
    }
}
