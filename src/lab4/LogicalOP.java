package lab4;

public class LogicalOP {
    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana
    // la 100, pornind de la numarul primit ca si parametru. Atentie la crearea
    // tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);

        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la -100, pornind
// de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
// deoarece metoda afiseaza, nu returneaza.
    public void printToHundred2(int number) {
        if (number >= -100) {
            for (int i = number; i >= -100; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = number; i < -100; i++) {
                System.out.println(i);
            }
        }
    }
    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de
    // tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.

    public void printTheNumbers1(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }


    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi
    // parametrii de tip numar. Metoda trebuie sa verifice care dintre cele
    // doua numere este mai mare, si sa execute o numaratoare crescatoare de
    // la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y
    // este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa
    // fie de la y la x).
    public void printTheNumbers(int x, int y) {
        if (x >= y) {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare
    // de la 1 la 100.
    public void numberPar(int number) {
        for (int i = number; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //6. Creati o metoda in clasa LogicalOp care
    // sa afiseze toate numerele impare de la 1 la 100.
    public void numberImpar(int number) {
        for (int i = number; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //.7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca
// si parametru, iar la final sa returneze rezultatul.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumNumbers(int sum) {
        for (int i = sum; i <= 100; i++)
            sum = sum + i;
        {
            System.out.println(sum);
        }
    }

    //.8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit
    // ca si parametru, si sa calculeze media numerelor. La final, metoda sa
    // returneze media. Apelati metoda in clasa Main, metoda main()
    // pentru a verifica daca functioneaza.
    public void sumAvragenumbers(int sum) {
        for (int i = sum; i <= 100; i++)
            sum = sum + i;
        {
            System.out.println(sum);
            float avrages = sum / 100f;
            System.out.println(avrages);
        }
    }

    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*
    //Cateva mentiuni:
    //- pentru a putea rezolva problema, trebuie folosite doua bucle for.
    // O bucla se va construi in alta bucla.
    //- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
    //- semnul asterisk (*) se poate afisa sub forma de string
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void tiparSteluta() {
        int f = 7;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= f; j++) {
                System.out.printf("*");
            }
            System.out.println();
            f--;
        }
    }


    //WHILE
    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca
    // si parametru. Metoda sa verifice numrul primit, si sa afiseze in
    // consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void numberUntill100(int i) {
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca
// si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola
// o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void numberUntill1002(int i) {
        if (i >= -100) {
            while (i >= -100) {
                System.out.println(i);
                i--;
            }
        } else {
            while (i < -100) {
                System.out.println(i);
                i++;
            }
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste
    // doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre
    // cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y
    // este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    public void numbersCounting(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.println(i);
            i++;
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste
    // doi parametrii de tip numar. Metoda trebuie sa verifice
    // care dintre cele doua numere este mai mare, si sa execute o
    // numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).
    public void numbersCounting2(int x, int y) {
        int i;
        if (x >= y) {
            i = y;
            while (i <= x) {
                System.out.println(i);
                i++;
            }
        } else {
            i = x;
            while (i <= y) {
                System.out.println(i);
                i++;
            }
        }
    }


    //5. Creati o metoda in clasa LogicalOp care sa
// afiseze toate numerele pare de la 1 la 100.
    public void numbersSeems(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;

        }
    }

    //6. Creati o metoda in clasa LogicalOp
// care sa afiseze toate numerele impare de la 1 la 100.
    public void numbersSeems2(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;

        }
    }

    //  7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    //  Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media
    //  numerelor din acel interval. Introduceti o variabila int count
    //  in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumAvragenumbersWhilee() {
        int count = 111;
        int totalnumbers = 0;
        int sum = 0;
        int avrage = 0;
        while (count <= 8899) {
            System.out.println("numarul este : " + count);
            count++;
            totalnumbers++;
            sum = sum + count;

        }
        System.out.println("numarul total de numere " + totalnumbers);
        System.out.println("suma numerelor este: " + sum);
        System.out.println("media numerelor este: " + sum / totalnumbers);
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int numberDivisible(int x, int y){
        int avrage = 0;
        int sum = 0;
        int count = 0;
        for ( int i = x ; i <= y; i++){
            if ( i % 7 == 0){
                sum = sum + i ;
                count ++;

            }
        }

        avrage = sum / count;
        return avrage;
    }
    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void Fibonacci(){
       int sum = 1;
        int i = 1;
        int count = 0;
        int x = 0;
        System.out.printf(sum + " " + i + " ");

        do {
            x = sum + i;
            System.out.printf(x + " ");
            sum = i;
            i = x;
            count++;

        }while (count < 18);
    }




    // 10. Creati o metoda numita CozaLozaWoza.
    //Metoda va afisa:
    //- numerele de la 1 la 110
    //- 11 numere pe linie
    //- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
    //- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
    //- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
    //- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
    //- se va afisa CozaWoza pentru multiplu de 3 SI 7
    //- se va afisa WozaLoza pentru multiplu de 5 SI 7
    //- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
    public void CozaLozaWoza() {
        int cont = 0;
        for (int i = 1; i <= 110; i++) {
            if (cont % 11 == 0) {
                System.out.println();
            }if ( ( i % 3 == 0 ) && (i % 5 == 0) && (i % 7 == 0)){
                System.out.printf("CozaLozaWoza ");
            }else if( ( i % 3 == 0 ) && (i % 7 == 0)){
                System.out.printf("CozaLoza ");
            }else if ( ( i % 5 == 0 ) && (i % 7 == 0)){
                System.out.printf("WozaLoza ");
            }
            else if (i % 3 == 0) {
                System.out.printf("Coza ");
            } else if (i % 5 == 0) {
                System.out.printf(" Loza ");
            } else if (i % 7 == 0) {
                System.out.printf(" Woza ");
            } else
            {
                System.out.printf(i + " ");
            }
            cont++;
        }

    }
}














