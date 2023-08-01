package exerciciodoised;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDoisED {

    public static void main(String[] args) {
        /*A Mega-Sena é uma loteria realizada pela Caixa Econômica Federal, que paga milhões para o
        acertador dos 6 números sorteados. Os sorteios normalmente ocorrem às quartas e sábados. Faça um
        programa em Java que gere seis números aleatórios e distintos entre 01 e 60, inclusive, para serem
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
