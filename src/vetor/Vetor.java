/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

/**
 *
 * @author Eliana Rua
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int V[];
        int M[];
        int men, may, prom, acm = 0;

        V = new int[10];
        for (int i = 0; i < 10; i++) {

            do {
                V[i] = (int) (Math.random() * 10);
            } while (V[i] == 0);
            System.out.print(V[i] + " |");
        }

        men = 0;
        may = 0;

        for (int i = 0; i < 10; i++) {
            acm = acm + V[i];
        }

        prom = acm / 10;
        System.out.println("");
        System.out.println("Promedio = " + prom);

        for (int i = 0; i < 10; i++) {

            if (V[i] < prom) {
                men++;
            }
            if (V[i] >= prom) {
                may++;
            }
        }
        M = new int[men];
        for (int i = 0; i < 10; i++) {
            if (V[i] < prom) {
                for (int j = 0; j < men; j++) {
                    if (M[j] == 0) {
                        M[j]=V[i];
                        break;
                    }
                }
            }
        }
        
       

        System.out.println(
                "el numero de menores es : " + men);
         for (int i = 0; i < men; i++) {
            System.out.print(M[i] + " |");
        }
         System.out.println("");
        System.out.println(
                "el numero de mayores es : " + may);

    }
}
