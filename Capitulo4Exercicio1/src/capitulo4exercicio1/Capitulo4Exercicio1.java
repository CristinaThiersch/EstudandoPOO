/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4exercicio1;

import java.util.Scanner;

/**
 *
 * @author anath
 */
public class Capitulo4Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c1 = new Carro();
        c1.setMarca("Ford");
        c1.setPotencia(100);
        Scanner scanner = new Scanner(System.in);
        int opc = 1;
        while (opc != 0 && c1.isMotorFucionando()) {
            System.out.println("Aumentar a velocidade em: ou 0 para parar o carro\n");
            opc = scanner.nextInt();
            c1.setVelocidade(opc);
        }
        if (!c1.isMotorFucionando()) {

            System.out.println("Motor fundido devido ao excesso de velocidade...");
        }
        System.out.println(c1.toString());
    }

}
