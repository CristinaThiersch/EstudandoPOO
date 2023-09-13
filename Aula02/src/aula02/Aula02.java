/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author anath
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostinet";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        
        System.out.println("\n\n\nTarefa ");
        Estojo e1 = new Estojo();
        e1.estampa = "Flamingo";
        e1.cor = "rosa";
        e1.fechada = false;
        e1.vazia = false;
        e1.status();
        e1.pegarAlgoNela();
        e1.fechar();
        e1.pegarAlgoNela();
                
        
    }
    
}
