package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 3;
        int b = 5;
        System.out.println("Hello Word!" + (a + b));*/

        Gato gato = new Gato();
        System.out.println(gato);
        Livro livro = new Livro("Viagem ao Centro da Terra", 10);
        System.out.println(livro);
        //testando commit pc Online
    }


}

class Livro {
    private String nome;
    private Integer npag;

    public Livro(String nome, int npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(npag, livro.npag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, npag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}
