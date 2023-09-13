/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author anath
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta(1, "cc", "Jubileu");
        Conta c2 = new Conta(2, "cp", "Creuza");
        
        c1.abrirConta(c1.getTipo());
        c2.abrirConta(c2.getTipo());
        c1.depositar(300);
        c2.depositar(500);
        c2.sacar(100);
        c1.pagarMensalidade(c1.getTipo());
        c2.pagarMensalidade(c2.getTipo());
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c2.sacar(530);
        c1.fecharConta(c1.getSaldo());
        c2.fecharConta(c2.getSaldo());
        
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    
}
