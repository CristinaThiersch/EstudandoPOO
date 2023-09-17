/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo4exercicio4;

/**
 *
 * @author anath
 */
public class Fabrica {
    private boolean ligado;
    private String mensagem;

    public Fabrica() {
        this.ligado = false;
        this.mensagem = "";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void guardaMensagem (String mensagem) {
        this.mensagem += "\n" + mensagem;
    }
    
    public void setMensagem (String mensagem) {
        this.mensagem = mensagem;
    }
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar()
    {
        this.setLigado(true);
    }
    
    public void trocar(Fabrica a, Fabrica b)
    {
        String aux = b.getMensagem();
        b.setMensagem(a.getMensagem());
        a.setMensagem(aux);
    }
  
}
