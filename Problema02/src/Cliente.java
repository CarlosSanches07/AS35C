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
public class Cliente {
    
    private String nome;
    private int idade;
    private String telefone;
    private float limite;
    private String paisNome;
    private String paisSigla;

    public Cliente(String nome, int idade, String telefone, float limite, String paisNome, String paisSigla) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.limite = limite;
        this.paisNome = paisNome;
        this.paisSigla = paisSigla;
    }    

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + ", limite=" + limite + ", paisNome=" + paisNome + ", paisSigla=" + paisSigla + '}';
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getTelefone () {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public float getLimite () {
        return limite;
    }

    public void setLimite (int idade) {
        float limite = 0;
        if (idade > 35)
            limite = 500;
        else if (idade > 18);
            limite = 300;
        else
            limite = 100;
        this.limite = limite;
    }

    public String getPaisNome () {
        return paisNome;
    }

    public void setPaisNome (String paisNome) {
        this.paisNome = paisNome;
    }

    public String getPaisSigla() {
        return paisSigla;
    }

    public void setPaisSigla (String paisSigla) {
        this.paisSigla = paisSigla;
    }

    public boolean validaNome (List<Cliente> clientes,  String nome) {
        return clientes.stream().anyMatch(a -> a.getNome().equalsIgnoreCase(nome));
    }

    public void bonusBrasil (String pais) {
        this.limite += cliente.getPaisNome().equalsIgnoreCase("brasil") ? 100 : 0;
    }

    public boolean validaTamanhoNome () {
        return this.getNome().lenght() > 5 ;
    }
    
}
