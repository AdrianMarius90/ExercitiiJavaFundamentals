import java.util.Scanner;

public class Main {

    //sa se modeleze comportamentul unui calculator simplu
    // calculatorul sa fie reprezentat folosind OOP

    public static void main (String[] args){

        Calculator calculator = new Calculator();

        System.out.println("rezultatul adunarii este" + calculator.Adunare(a:7, b:15));

        System.out.println("rezultatul scadere este" + calculator.Scadere(a: 5, b: 8));

        System.out.println("rezultatul inmultire este" + calculator.Inmultirea(a: 5, b: 8));

        System.out.println("rezultatul impartire este" + calculator.Impartirea(a: 5, b: 8));


        // de aici citim valorile de la tastatura
        // folosim obiectul scaner
    }

        Scanner scanner = new Scanner(System.in);
        //citeste primul numar de la tastatura
        System.out.println("va rugam sa introduceti primul numar: ");
        int primulNumar = scanner.nextInt();

        //citeste al dolea numar
        System.out.println("va rugam introduceti al 2lea numar: ");
        int alDoileaNumar = scanner.nextInt();

        System.out.println(" numerel sunt: " + primulNumar + alDoileaNumar)

        int.Adunare



}
