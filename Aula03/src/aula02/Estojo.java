/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author anath
 */
public class Estojo {
    String estampa;
    String cor;
    boolean fechada;
    boolean vazia;
    
    void status(){
        System.out.println("Estampa " + this.estampa);
        System.out.println("Cor " + this.cor);
        System.out.println("Fechada: " + this.fechada);
        System.out.println("Vazia " + this.vazia);
    }
    void pegarAlgoNela(){
        if(this.vazia == false && this.fechada == false)
            System.out.println("Conseguiu");
        else
            System.out.println("Nao conseguiu");
    }
    void fechar(){
        this.fechada = true;
    }
}
