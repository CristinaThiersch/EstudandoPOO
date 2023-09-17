/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo4exercicio4;

/**
 *
 * @author anath
 */
public class Capitulo4Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica comp1 = new Fabrica();
        Fabrica comp2 = new Fabrica();
        comp1.ligar();
        comp2.ligar();
        comp1.guardaMensagem("Opa, tudo bom?");
        comp2.guardaMensagem("Cara, cansado. E você?");
        comp1.guardaMensagem("Domingao poh, tem que descansar.");
        comp2.guardaMensagem("Muita coisa amigo, rola nao");
        
        System.out.println("Mandadas do 1: " + comp1.getMensagem());
        System.out.println("Mandadas do 2: " + comp2.getMensagem());
        
        comp1.trocar(comp1, comp2);
        
        System.out.println("\n\n\n\nMandadas do 1: " + comp1.getMensagem());
        System.out.println("Mandadas do 2: " + comp2.getMensagem());
    }
    
}
