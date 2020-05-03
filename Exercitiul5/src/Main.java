public class Main {
    //se da un tex
    // sa se afiseze toate cuvintele care incep cu litera "s" sau cu litera "d"
    //sa se afiseze litera de la pozitia 3 din fiecare cuvant.

    public static void main(String[] args){

        String text = " Whether you are working on a new cutting edge app or simply ramping up on new technology, Java documentation has all the information you need to make your project a smashing success. Use the rich set of code samples, tutorials, developer guides, API documentation, and more to quickly develop your prototype and scale it up to a real world application.";

        afisareCuvinte(text);
        literaPozitie(text);
    }

    public static void afisareCuvinte(String text){
        String[] sirText = text.split( regex: " ");

        for( int cursor = 0; cursor <= sirText.length; cursor ++){
            sirText[cursor] = sirText[cursor].toLowerCase();
            if (sirText[cursor].startsWith("s") || sirText[cursor].startsWith("d")){
                System.out.println(sirText[cursor]);
            }
        }
    }

    public static void literaPozitie(String text){
        String[] sirText = text.split( regex: " ")

        for (int cursor = 0; cursor < sirText.length; cursor++){
            if(sirText[cursor].length() > 3) {
                System.out.println("litera de la pozitia 3 este " + sirText[cursor].charAt(3));
            }
        }
    }

}
