package lab5;

import lab3.Calculator;

import java.util.Scanner;

public class Lab5<myArray> {
    public static void main(String[] args) {


        // 1. In proiectul de Calculator, in clasa Calculator,
        // supraincarcati toate metodele conform principiului polimorfismului.
        // Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o
        // aveti in clasa.Spre exemplu, pentru metoda de adunare,
        // faceti ca aceasta sa lucreze o data cu 2 int-uri, o data cu
        // 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!
        // Apelati metodele in Main pentru a testa daca functioneaza.

        Calculator op = new Calculator();
        op.adunare(2, 7);
        op.adunare(9, 6, 7, 10);
        op.adunare(2.3f, 5.7f);
        op.adunare(1.7f, 7.2f, 5.3f);


        LogicalOP Op = new LogicalOP();
        int[] primArray = new int[100];
        Op.setArray(primArray, 100);
        Op.printArray(primArray);


        Op.numberPar(primArray);

        int[] secondArray = Op.setMinMaxArray(1, 100);
        Op.printArray(secondArray);


        System.out.println(Op.sumAvrage(secondArray));

        String[] meArray = new String[5];

        meArray[0] = "Heloo";
        meArray[1] = "I am Adela";
        meArray[2] = "Nice to meet you";
        meArray[3] = "See you";
        meArray[4] = "Next time";
        System.out.println(Op.isInArray(meArray, "Heloo "));
        System.out.println(Op.isInArray(meArray,"See you "));


        int [] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Op.NumberPrezent(array,7));

       char array2[] = new char[]{'-','-','-','-','-','-','-','-','-','-'};
       Op.printArray2(array2);


        int g[] = new int[]{1,2,3,4,5,6,7,8,9,10};
       System.out.println(Op.NumberPrezent(array,2));


        int a[]= new int[]{1,2,5,6,3,2};
        int b[] = new int[]{44,66,99,77,33,22,55};
        System.out.println(Op.getSecondSmallest(a,6));
        System.out.println(Op.getSecondSmallest(b,7));




}
}



