/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2_MarcosAntonio;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario {
    //Criando os atributos e especificando o tipo de suas variáveis
    protected Bonificacao bonificacao;
    
    //Construct
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, double salario, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(nome, cpf, rg, salario, setor, genero, estadoCivil, dataNascimento, endereco, logradouro, numero, complemento, cep, cidade, uf);
        this.bonificacao = bonificacao;
    }
    
}
