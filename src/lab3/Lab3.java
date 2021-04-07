package lab3;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;

public class Lab3 {
    public static void main(String[] args) {
        Calculator met = new Calculator();
        System.out.println(met.adunare(2, 5));
        System.out.println(met.div());
        System.out.println(met.celsius(12.2));
        System.out.println(met.impartire(3, 5));
        System.out.println(met.inmultire(5, 6));
        System.out.println(met.meters(2));
        System.out.println(met.scadere(74, 69));
        System.out.println(met.sum2());

        {
            LogicalOP op = new LogicalOP();
            int biggest = op.checkBiggerNumber(6, 8);
            System.out.println("the bigger numer is:" + biggest);


            System.out.println(op.checkTextAndText("Heloo", "FastTrackIT"));
            System.out.println(op.checkTextAndNumber("me", 7));
            System.out.println(op.checkNumberAndText("baby", 88));
            System.out.println(op.checkNumberNumber(65));
            op.verifyNumberSwich(5);
            op.verifyNumberSwich(9);
            System.out.println(op.isNumberEven(7));
            System.out.println(op.isNumberEven(4));
            System.out.println(op.isNumberEven(0));
            System.out.println(op.isEligibleToVote(20));
            System.out.println(op.isEligibleToVote(12));
            System.out.println(op.isMaxNumber(15,23,78));
            System.out.println(op.isMaxNumber(12,18,88));
        }



    }
}







