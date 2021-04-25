package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Mama");
        myList.add("Tata");
        myList.add("Daysi");
        myList.add("Ella");
        myList.add("Casa");
        myList.add("Scaun ");
        myList.add("Masa");
        myList.add("CUrte");
        myList.add("Canapea");
        myList.add("Televizor");





      LogicalOp logicalOp = new LogicalOp();
        logicalOp.showList(myList);

        logicalOp.addValueToList(myList, "Sora");
        System.out.println(myList);

        logicalOp.printValueFromTheEnd(myList);
        System.out.println(myList);

       logicalOp.printValueFromList(myList,4);


        System.out.println("exercitiu");

       logicalOp.printThree(myList,10,"pozitia heloo");
        System.out.println(myList);

     logicalOp.firstPozition(myList,0);
        System.out.println(myList);

        logicalOp.showListplus(myList);

        List<Integer> list = List.of(1,2,3,4,5,6,7,10,12,56,87,16);
        logicalOp.getHighest(list);
        System.out.println(list);














    }
}
