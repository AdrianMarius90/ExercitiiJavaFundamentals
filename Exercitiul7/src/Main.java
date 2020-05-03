public class Main {

    // se da un array de 7 civinte sa se concateneze cuvintele de ppozitiile divizibile cu 3 si mai mari decat 0

    public static void main (String[] args){

        String[] arrayCuvinte = new String[7];
        arrayCuvinte[0] = "unelte";
        arrayCuvinte[1] = "piatra";
        arrayCuvinte[2] = "ciocan";
        arrayCuvinte[3] = "bocanc";
        arrayCuvinte[4] = "cana";
        arrayCuvinte[5] = "pix";
        arrayCuvinte[6] = "telefon";

        concatenare(arrayCuvinte);


    }

    public static void concatenare(String[] arrayCuvinte){

        String cuvinte = "";

        for(int cursor = 1; cursor < arrayCuvinte.length; cursor ++){
            if(cursor % 3 == 0){
                cuvinte = cuvinte.concat(arrayCuvinte[cursor]);

            }
        }
        System.out.println("rezultat :" + cuvinte );
    }

}
