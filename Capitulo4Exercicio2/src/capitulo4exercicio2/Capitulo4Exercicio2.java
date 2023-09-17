/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4exercicio2;

import java.util.Scanner;

/**
 *
 * @author anath
 */
public class Capitulo4Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tanque t1 = new Tanque();
        t1.setCapacidade(50);
        t1.setDistanciaPorLitro(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos litros voce abastecera seu tanque antes da viagem: ");
        
        t1.setQtd(scanner.nextInt());
        int opc = 1;
        
        while (opc != 0 && !t1.isVazio())
        {
            System.out.println("Ande " + "passos ou 0 para parar");
            opc = scanner.nextInt();
            t1.pedirEmprestado(opc);
        }
        
        System.out.println(t1.toString());
    }
    
}
