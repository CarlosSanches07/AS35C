package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.function.Predicate;
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
    
    public boolean validaNome(List<Pais> paises,  String nome) {
        return paises.stream().anyMatch(a -> a.paisNome.equals(nome));
    }
}
