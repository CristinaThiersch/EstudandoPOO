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

    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Um modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Uma ponta " + this.ponta);
        System.out.println("Uma carga "+ this.carga);
        System.out.println("Esta tampada " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada == true)
            System.out.println("Nao eh possivel rabiscar com ela tampada, destampe primeiro");
        else
            System.out.println("Rabisco");
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
