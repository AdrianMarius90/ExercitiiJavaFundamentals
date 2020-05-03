public class main {
    // se da un text
    // sa se numere cuvintele care au lungimea impara si se termina cu litera e

    public void main (String[] args) {

        String text = " dfhasbdkjshb dhsajkldhak hdfjhsdab hcfsfh hfdsabkfh gtfde rewt trewf";

        int variabila = numarCuvinte(text);
        System.out.println("numar de cuvinte este" + variabila);
    }
     public static int numarCuvinte(String text){

        int numarCuvinte = 0;

        String[] rezultatSplit = text.split( regex: "");
        for(int cursor = 0; cursor < rezultatSplit.length; cursor++){
            if(rezultatSplit)[cursor].length() % 2 != 0 && rezultatSplit[cursor].endsWith("e")){
            numarCuvinte++;
            }
        }
        return numarCuvinte;
    }

}
