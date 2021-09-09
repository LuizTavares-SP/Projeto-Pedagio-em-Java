package modelo;

import java.util.Set;

public class Concessionaria {
	
	private String nome;
    private Set<Praca> pracas;
    private double totalRecebido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Praca> getPracas() {
        return pracas;
    }

    public void setPracas(Set<Praca> pracas) {
        this.pracas = pracas;
    }

    public double getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

}
