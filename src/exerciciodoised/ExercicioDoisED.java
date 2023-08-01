package exerciciodoised;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDoisED {

    public static void main(String[] args) {
        /*A Mega-Sena � uma loteria realizada pela Caixa Econ�mica Federal, que paga milh�es para o
        acertador dos 6 n�meros sorteados. Os sorteios normalmente ocorrem �s quartas e s�bados. Fa�a um
        programa em Java que gere seis n�meros aleat�rios e distintos entre 01 e 60, inclusive, para serem
        ?jogados? na Mega-Sena.*/
        
        List <Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 61; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        int vect[] = new int[6];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = numeros.get(i);
        }
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i]);
            System.out.print(" ");
        }
        
    }

}
