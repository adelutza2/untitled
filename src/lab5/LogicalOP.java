package lab5;

public class LogicalOP {
    // 2.  In clasa LogicalOp, creati o metoda
    // care sa scrie pe un array de 100 de pozitii,
    // valorile de la 1 la 100. Sa se afiseze progresul in consola pe
    // tot parcursul. Apelati metoda in main() pentru a verifica daca
    // functioneaza.

    public void printArray(int[] primArray) {
        for (int i = 0; i < primArray.length; i++) {
            System.out.println(primArray[i]);
        }
    }

    public void setArray(int[] primArray, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            primArray[i] = i + 1;
        }
    }

    public int[] setMinMaxArray(int min, int maxValue) {

        int[] myArray = new int[maxValue - min + 1];
        int counter = 0;
        for (int i = min; i <= maxValue; i++) {
            myArray[counter] = i;
            counter++;
        }
        return myArray;
    }


    //3. Creati o metoda care primeasca un parametru de tip array de
    // numere intregi gol, si sa il returneze populat cu toate valorile
    // pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca
    // functioneaza. Atentie, metoda returneaza un array,
    // deci acesta va trebui surprins si afisat folosind o bucla.

    public void numberPar(int[] primArray) {
        for (int i = 1; i < 100; i = i + 2) {
            System.out.println(primArray[i]);
        }
    }

    //4. Creati o metoda care sa primeasca un parametru de tip array de numere,
// si sa fie populat cu valori. Metoda sa calculeze si sa returneze
// media numerelor din array. Apelati metoda in main() pentru a verifica
// daca functioneaza.
    public float sumAvrage(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;

        }
        float avrage = sum / (float) array.length;
        return avrage;
    }

    //5. Creati o metoda care sa primeasca un parametru de
// tip array de string-uri, populat cu valori, si un parametru de
// tip String. Metoda sa verifice daca valoarea string-ului primit se
// regaseste in array-ul primit, iar daca da sa returneze true iar daca nu,
// sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isInArray(String[] array, String text) {
        for (int i = 0; i < array.length; i++) ;
        {
            int i = 0;
            if (array[i].equals(text)) {
                return true;

            }
            return false;
        }
    }

    //6. Creati o metoda care sa primeasca un parametru de tip
// array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul primit se afla in array-ul primit,
// si daca da, atunci sa returneze pozitia pe care se afla numarul.
// Apelati metoda in main() pentru a verifica daca functioneaza
    public Integer NumberPrezent(int[] array, int number) {
        Integer poz = 0;
        boolean found = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                poz = j;
                found = true;
            }
        }
        if (found == true) {
            return poz;
        } else {
            return null;
        }
    }


    // 7.Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public void printArray2(char[] array) {
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere,
// populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul exista in array, si daca da,
// sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] NumberPrezent2(int[] array, int number) {
        int[] array3 = array;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[j] != number) {
                    array3[i] = array[j];

                } else {
                    j++;
                }

            }
        }
        return array3;
    }

//9. Creati o metoda care sa primeasca un array, si sa returneze
// al doilea cel mai mic numar din array.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public int getSecondSmallest(int[] g, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (g[i] > g[j])
                {
                    temp = g[i];
                    g[i] = g[j];
                    g[j] = temp;
                }
            }
        }
        return g[1];
    }
//10. Creati o metoda care sa primeasca doi parametrii:
// un array populat cu valori, si un array gol. Metoda sa copieze
// toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
// Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] allTheValue(int [] r, int[] h){
        int[] array4 = r;
        for (int j = 0; j < r.length; j++){
    }
        return h;
    }

}

















