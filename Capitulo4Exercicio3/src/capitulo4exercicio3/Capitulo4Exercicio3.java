/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4exercicio3;

/**
 *
 * @author anath
 */
public class Capitulo4Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.setNome("Joao");
        p2.setNome("Maria");
        
        p2.setMensagem("Ola.\n");
        p2.setMensagem("Como voce esta?\n");
        p2.setMensagem("Como andam as coisas?\n");
        p2.setMensagem("Bora viajar pelo mundo\n");
        
        System.out.println(p2.toString());;
    }
    
}
