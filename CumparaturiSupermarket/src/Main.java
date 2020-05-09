import java.util.Date;
import java.util.Scanner;

public class Main {

    //sa se modeleze cosul de cumparaturi dintr un supermarcket.
    //fiecare produs sa fie reprezentat de un obiect care sa contna nume si pretex: Mere 5 lei
    // cosul de cumparaturi va fi reprezentat de un array de produse
    // sa se calculeze costul total al cosului de cumparaturi
    // sa se afiseze un meniu cu prodele pe care vrem sa le cumparam
    //in functie de ce introduce utilizatoruld e la tastatura adaugam in cosul de cumparaturi
    //platim pentru cosul de cumparaturi


    public static void main(String[] args) {

        produs[] cosDeCumparaturi = new produs[10];
        System.out.println("meniu cumparaturi");
        System.out.println("1.lapte");
        System.out.println("2.cafea");
        System.out.println("3.mouse");
        System.out.println("4.casti");
        System.out.println("5. carne");
        System.out.println("6.bere");
        System.out.println("7.suc");
        System.out.println("Va rugam alegeti o optiune");
        Scanner scanner = new Scanner(System.in);
        int optiune = scanner.nextInt();

        while (optiune != 0) {

            if (optiune == 1) {
                System.out.println("ati ales optiunea lapte");
                produs lapte = new produs("lapte", 5);
                cosDeCumparaturi[0] = lapte;
            } else if (optiune == 2) {
                System.out.println("ati ales optiunea cafea");
                produs cafea = new produs("cafea", 7);
                cosDeCumparaturi[1] = cafea;
            } else if (optiune == 3) {
                System.out.println("ati ales optiunea mouse");
                produs mouse = new produs("mouse", 8);
                cosDeCumparaturi[2] = mouse;
            } else if (optiune == 4) {
                System.out.println("ati ales optiunea casti");
                produs casti = new produs("casti", 6);
                cosDeCumparaturi[3] = casti;
            } else if (optiune == 5) {
                System.out.println("ati ales optiunea carne");
                produs carne = new produs("carne", 4);
                cosDeCumparaturi[4] = carne;
            } else if (optiune == 6) {
                System.out.println("ati ales optiunea bere");
                produs bere = new produs("bere", 7);
                cosDeCumparaturi[5] = bere;
            } else if (optiune == 7) {
                System.out.println("ati ales optiunea suc");
                produs suc = new produs("suc", 6);
                cosDeCumparaturi[6] = suc;
            } else {
                System.out.println("optiunea nu exista");
            }

            optiune = scanner.nextInt();
        }
        System.out.println("ati apasat tasta 0 se inchide");
        System.out.println("cosul contine " + cosDeCumparaturi.length);
        System.out.println("Ati cuparat: ");

        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {
                System.out.println("produsul este:" + cosDeCumparaturi[cursor].getNume() + "la pretul de: " + cosDeCumparaturi[cursor].getPret());
            }
        }

        int pretTotal = 0; // declaram pretul total inainte de adunare pt stocare inaintea buclei for, pentru a nu se reseta mereu in bucla

        for (int cursor = 0; cursor < cosDeCumparaturi.length; cursor++) {
            if (cosDeCumparaturi[cursor] != null) {

                //in acest for adunam pretul produselor
                pretTotal += cosDeCumparaturi[cursor].getPret();
            }

        }

        System.out.println("pretul total este " + pretTotal);

        System.out.println("s-a platit suma totala ");
        pretTotal = 0;


        // sa se reprezinte si produse produse perisabile
        //acestea vor avea in plus data expirarii
        // sa se simileze iar cosul de cumparaturi
        //daca utilizatorul selecteaza un produs perisabil si data de expirare este depasita
        //afisam mesajul produs expirat si nu il adaugam in cos
        // cand afisal cosul de cumparaturi sa afisam si alergenii
        // un cos de cumparaturi pentru produsele non alimentare
        //un cos de cumparaturi pentru produsele alimentare la care afisam daca e expirat sau nu si alergenii.

        Date dataAstazi = new Date(2020, 5, 9);

        ProduseAlimentare cosAlimntare[] = new ProduseAlimentare[10];
        produs cosNonAlimentare[] = new produs[10];
        System.out.println("meniu cumparaturi");
        System.out.println("1.prune");
        System.out.println("2.gem");
        System.out.println("3.paine");
        System.out.println("4.bec");
        System.out.println("5.pronto");
        System.out.println("6.mop");

        optiune = scanner.nextInt();
        while (optiune != 0) {
            if (optiune == 1) {
                System.out.println("Ati ales prune");
                ProduseAlimentare prune = new ProduseAlimentare("mere", 6, "zaharoza, fructoza", null);
                cosAlimntare[0] = prune;
            } else if (optiune == 2) {
                System.out.println("Ati ales gem");
                ProduseAlimentare gem = new ProduseAlimentare("gem", 8, "samburi", new Date(2020, 2, 1));
                cosAlimntare[1] = gem;
            } else if (optiune == 3) {
                System.out.println("Ati ales paine");
                ProduseAlimentare paine = new ProduseAlimentare("paine", 3, "glucoza", new Date(2020, 6, 1));
                cosAlimntare[2] = paine;
            } else if (optiune == 4) {
                System.out.println("bec");
                produs bec = new produs("bec", 9);
                cosAlimntare[3] = bec;
            } else if (optiune == 5) {
                System.out.println("pronto");
                produs pronto = new produs("pronto", 11);
                cosAlimntare[4] = pronto;
            } else if (optiune == 6) {
                System.out.println("mop");
                produs mop = new produs("mop", 7);
                cosAlimntare[4] = mop;
            } else {
                System.out.println("optiune invalida");
            }


            optiune = scanner.nextInt();
        }
        System.out.println("Acestea sunt produsele non alimentare din cos");
        for (int cursor = 0; cursor < cosNonAlimentare.length; cursor++) {
            if (cosNonAlimentare[cursor] != null) {
                System.out.println("produsul este: " + cosNonAlimentare[cursor].getNume() + "iar pretul este" + cosNonAlimentare[cursor].getPret());
            }


            System.out.println("acestea sunt produsele alimentare din cos: ");
            for (int cursor = 0; cursor < cosAlimntare.length; cursor++) {
                if (cosAlimntare[cursor] != null) {
                    System.out.println("produsul este: " + cosAlimntare[cursor].getNume() + "iar pretul este" + cosAlimntare[cursor].getPret() + "alergenii sunt: " + cosAlimntare[cursor].getalergeni() + "data de expirare este: " + cosAlimntare[cursor].getDataExpirare());
                    if (cosAlimntare[cursor].getDataExpirare().before(dataAstazi)) {
                        System.out.println("produsl este expirat si nu este adaugat in cos");
                        cosAlimntare[cursor] = null;
                    }

                }
            }


        }
    }