public class Main {
    // se da un array de caractere
    //sa se afiseze in ordinea inversa

    public static void main(String[] args){

        char[] arrayCharactere = new char[5];
        arrayCharactere[0] = 'a';
        arrayCharactere[1] = 'b';
        arrayCharactere[2] = 'c';
        arrayCharactere[3] = 'd';
        arrayCharactere[4] = 'e';

        arrayCharactere(arrayCharactere);

    }
    public static void arrayCaractere (char[] arrayCaractere){
    for(int cursor = 0; cursor < arrayCaractere.length; cursor++){
        System.out.println(arrayCaractere[cursor]);
    }
    }
}
