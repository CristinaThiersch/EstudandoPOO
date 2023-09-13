/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author anath
 */
public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Um modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Uma ponta " + this.ponta);
        System.out.println("Uma carga "+ this.carga);
        System.out.println("Esta tampada " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true)
            System.out.println("Nao eh possivel rabiscar com ela tampada, destampe primeiro");
        else
            System.out.println("Rabisco");
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
