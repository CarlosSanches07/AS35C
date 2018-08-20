/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Pais {
    
    private String paisNome;
    private String paisSigla;

    public Pais(String paisNome, String paisSigla) {
        this.paisNome = paisNome;
        this.paisSigla = paisSigla;
    }

    @Override
    public String toString() {
        return "Pais{" + "paisNome=" + paisNome + ", paisSigla=" + paisSigla + '}';
    }
    

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        this.paisNome = paisNome;
    }

    public String getPaisSigla() {
        return paisSigla;
    }

    public void setPaisSigla(String paisSigla) {
        this.paisSigla = paisSigla;
    }
    
    
}
