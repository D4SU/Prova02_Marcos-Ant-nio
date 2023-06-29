/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2_MarcosAntonio;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Endereco implements SalarioFinal {
    //Especificando as variáveis e seus tipos
    protected String nome;
    protected String cpf;
    protected String rg;
    protected double salario;
    protected Setor setor;
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;
    protected Endereco endereco;
    
    //Construct

    public Funcionario(String nome, String cpf, String rg, double salario, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(logradouro, numero, complemento, cep, cidade, uf);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    //method getIdade()
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    //method toString()

    @Override
    public String toString() {
        return "\n nome=" + nome + 
                "\n cpf=" + cpf + 
                "\n rg=" + rg + 
                "\n salario=" + Util.formatarMonetario(salario) + 
                "\n setor=" + setor + 
                "\n genero=" + genero + 
                "\n estadoCivil=" + estadoCivil + 
                "\n dataNascimento=" + Util.formatarData(dataNascimento) + 
                "\n endereco=" + endereco;
    }

    

    
    
    
}
