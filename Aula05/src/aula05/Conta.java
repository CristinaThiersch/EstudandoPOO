/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author anath
 */
public class Conta {

    public double numConta;
    protected String tipo;
    private String titular;
    private double saldo;
    private boolean status;

    public Conta(double numConta, String tipo, String titular) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = 0;
        this.status = false;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        if (tipo == "cc") {
            this.status = true;
            this.saldo = 50;
        } else if (tipo == "cp") {
            this.status = true;
            this.saldo = 150;
        } else {
            System.out.println("Tipo invalido, nao foi possivel abrir a conta");
        }
    }

    public void fecharConta(double saldo) {
        if (saldo > 0) {
            System.out.println("Impossivel encerrar a conta devido a saldo remasnecente.\nSaque tudo primeiro.");
        } else {
            this.status = false;
        }
    }

    public void pagarMensalidade(String tipo) {
        double mensalidade = 0;
        if (this.status) {
            if(tipo != "cc" && tipo != "cp")
            {
                System.out.println("Tipo invalido, nao foi possivel pagar mensalidade");
            }else{
                if (tipo == "cc") {
                 mensalidade = 12;
            } else if (tipo == "cp") {
                mensalidade = 20;
            }
                this.saldo -= mensalidade;
            } 
        }
    }

    public void sacar(double valor) {
        if (this.status) {
            if (valor > this.saldo) {
                System.out.println("Você nao tem saldo suficiente para essa operacao");
            } else {
                this.saldo -= valor;
            }
        }
    }

    public void depositar(double valor) {
        if(this.status){
            this.saldo += valor;
        }
    }

    public void extrato() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" + "numConta=" + numConta + ", tipo=" + tipo + ", titular=" + titular + ", saldo=" + saldo + ", status=" + status + '}';
    }

}
