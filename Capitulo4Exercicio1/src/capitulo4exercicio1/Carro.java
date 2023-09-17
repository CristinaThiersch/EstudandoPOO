/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4exercicio1;

/**
 *
 * @author anath
 */
public class Carro {
    
    private String marca;
    private int velocidade;
    private int velMax;
    private int potencia;
    private boolean motorFucionando;

    public Carro() {
        this.setMotorFucionando(true);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(this.isMotorFucionando())
        {
            this.velocidade = velocidade;
            this.fundirMotor(this.getVelocidade());
        }
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
        this.setVelMax(this.getPotencia());
    }

    public boolean isMotorFucionando() {
        return motorFucionando;
    }

    private void setMotorFucionando(boolean motorFucionando) {
        this.motorFucionando = motorFucionando;
    }

    public void fundirMotor(int vel) {
        double comparativo = this.getVelMax() * 1.2;
        if (this.getVelocidade() > comparativo) {
            this.setMotorFucionando(false);
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", velocidade=" + velocidade + ", velMax=" + velMax + ", potencia=" + potencia + ", motorFucionando=" + motorFucionando + '}';
    }

    
}
