public class Main {

    // se da un text
    // sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caracterul "i" si caracterul "i" se afla pe o pozitie para
    // exemplu Matei

    public static void main(String[] argns){
        String text = " hfdsbkj fhsdbfk hferqw ufcb uqhoib wr";

        int numarCuvinte = numarCuvinte(text);
        System.out.println("numarul de cuvinte este" + numarCuvinte);

    }

    public static int numaraCuvinte(String text){

        int numarCuvinte = 0;
        String[] cuvinte = text.split( regex: "");

        for(int cursor = 0; cursor < cuvinte.length; cursor ){
            if(cuvinte[cursor].length() > 2 && cuvinte[cursor].contains("i") && cuvinte[cursor].indexOf("i") % 2 == 0){
                numarCuvinte++;
            }
        }
        return numarCuvinte;
    }


}
