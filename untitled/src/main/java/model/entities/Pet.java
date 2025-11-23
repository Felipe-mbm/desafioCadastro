package model.entities;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pet {

    private String nome;
    private String tipoPet;
    private String sexo;
    private String endereco;
    private Integer idade;
    private Double peso;
    private String raca;

    public Pet(String nome, String tipoPet, String sexo, String endereco, Integer idade, Double peso, String raca) {
        this.nome = nome;
        this.tipoPet = tipoPet;
        this.sexo = sexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoPet() {
        return tipoPet;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }


}
