import javax.swing.*;

public class main {
    public static void main(String[] args){

        int[] array = new int[4];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        int valoare = CelMaiMareNumar(array);

        System.out.println("cel mai mare din sir" + valoare);

    }
    public static int CelMaiMareNumar(int[] array){

        int CelMaiMareNumar = array[0];

        for(int cursor = 0; cursor < array.length; cursor++){
           if (array[cursor] > CelMaiMareNumar )
               CelMaiMareNumar = array[cursor];
        }
         return CelMaiMareNumar;

    }

}
