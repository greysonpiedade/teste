/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linha;

import java.util.Scanner;

/**
 *
 * @author greyerg
 */
public class Linha {

    public static void main(String[] args) {
        int x0 = 0;
        int xf = 0;
        int y = 0;
        String c;
        String r = null;

        Scanner in = new Scanner(System.in);
        while (x0 == xf || x0 > xf) {

            System.out.println("Informe o valor de x0");
            x0 = in.nextInt();
            System.out.println("Informe o valor de xf");
            xf = in.nextInt();

            if (x0 == xf) {
                System.out.println("x0  e xf não podem ser iguais para obter uma reta");
            }
            if (x0 > xf) {
                System.out.println("Informe um valor para xf maior que x0");
            }

        }

        System.out.println("Informe o valor de y: ");
        y = in.nextInt();

        
        System.out.println("Informe o caracter para desenhar a linha: ");
        c = in.next();
        c = c + " ";
        r = c;
        for (int i = 0; i < xf - x0; i++) {
            r = r + c;
        }
        System.out.println("");
        System.out.println("----------Plano cartesiano----------");
        System.out.println("");
        System.out.println("");
        for (int j = 0; j < xf + 3; j++) {
            System.out.print(j + " ");
        }

        for (int i = 0; i < xf; i++) {
            System.out.print(i);
            if (y == i) {
                for (int j = 0; j < x0 + (x0 - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print(r);
            }
            System.out.println("");

        }
        System.out.println("");
        
    }

}
