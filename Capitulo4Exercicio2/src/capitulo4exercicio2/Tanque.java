/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4exercicio2;

/**
 *
 * @author anath
 */
public class Tanque {
    private int capacidade;
    private int distanciaPorLitro;
    private int qtd;
    private boolean vazio;

    public Tanque() {
        this.vazio = false;
    }
    
    

    public boolean isVazio() {
        return vazio;
    }

    public void setVazio(boolean vazio) {
        this.vazio = vazio;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getDistanciaPorLitro() {
        return distanciaPorLitro;
    }

    public void setDistanciaPorLitro(int distanciaPorLitro) {
        this.distanciaPorLitro = distanciaPorLitro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd >= 0)
            this.qtd = qtd;
        else
            System.out.println("Nao da pra andar tudo isso com so isso de combustivel, ande menos");
    }
    
    public void pedirEmprestado(int dist)
    {
        if(this.getQtd() > 0)
        {
            this.setQtd(this.getQtd() - (dist / 10));
            System.out.println("Agora tem " + this.getQtd());
        }else
        {
            this.setVazio(true);
            System.out.println("Você conseguiu 10 litros emprestado de alguém que passava, corra para abastecer...");
        }
    }

    @Override
    public String toString() {
        return "Tanque{" + "capacidade=" + capacidade + ", distanciaPorLitro=" + distanciaPorLitro + ", qtd=" + qtd + '}';
    }
    
    
}
