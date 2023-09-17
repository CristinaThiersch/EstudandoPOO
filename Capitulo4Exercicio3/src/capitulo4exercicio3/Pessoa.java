/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4exercicio3;

/**
 *
 * @author anath
 */
public class Pessoa {
    private String nome;
    private String mensagem = "";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem += mensagem;
    }

    @Override
    public String toString() {
        return "Mensagens{" + "nome=" + nome + ", mensagem=" + mensagem + '}';
    }
    
    
}
