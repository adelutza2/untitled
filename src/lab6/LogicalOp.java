package lab6;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp {

    //Scrieti o metoda Java, care sa primeasca parametru o
    // Lista, si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou.
public void showList(List<String> k){
    System.out.println(k);


}

    //Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista
    public void addValueToList(List<String> h, String Value){
        h.add(Value);
          }


//Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru de tip Lista, iar celalalt un numar intreg.
// Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
// fiecare pe rand nou,
// pornind de la numarul intreg primit ca si parametru.
    public void printValueFromList(List<String> myList,int number ){
    for(int i = number; i < myList.size();i++ ){
        System.out.println(myList.get(i));
    }}

    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand,
        // toate valorile din lista, dar invers(de la capat la inceput).

public void printValueFromTheEnd(List<String> myList){
    for(int i = myList.size() - 1; i >= 0 ; i--){
        System.out.println(myList.get(i));
    }

}
//Scrieti o metoda Java, care sa primeasca trei parametrii:
// unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
// Metoda sa adauge parametrul de tip String in lista primita,
// iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void printThree(List<String> a, int b, String h){
    a.add(b,h);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al
    // doilea parametru si sa il adauge pe prima pozitie din lista.

    public void firstPozition(List<String> myList,int l){
        myList.add(0,"surpiza");

    }

    //Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista,
    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”
    public void showListplus(List<String> number){
        for(int i = 0; i < number.size();i++ ){
            System.out.println(" Pe pozitia "  + i +  " se afla " + number.get(i));
        }
}

 //   Scrieti o metoda Java care sa primeasca o Lista si sa
    //   returneze cel mai mare numar din ea.
 public Integer getHighest (List<Integer> highest) {
     int max = highest.get(0);
     for (int i = 0; i < highest.size() ; i++) {
         if(highest.get(1) > max){
             max = highest.get(1);
         }

     }
     return max;
 }}













