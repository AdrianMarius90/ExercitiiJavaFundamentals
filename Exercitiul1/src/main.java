public class main {

    //cerinte
    // o functie care perminte 2 stringuri ca parametrii si verifica daca al 2lea string  exista in primul string.

    public static void main(String[] args) {

        String string1 = "ana are pere de aceasta data.";
        String string2 = "ana are pere";
    }

    public static void verificaincludere(String string1, String string2){

        if(string1.contains(string2)){
            System.out.println("adevarat");
    }
        else{
            System.out.println("fals");
        }

}
