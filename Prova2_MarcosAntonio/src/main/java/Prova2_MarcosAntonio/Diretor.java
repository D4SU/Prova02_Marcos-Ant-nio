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
public class Diretor extends CargoDeConfianca implements Contratacao{
   //Criando os atributos e especificando o tipo de suas variáveis
    private final double PREMIO = 0.3;
    
    //Construct

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, double salario, Setor setor, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, Endereco endereco, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(bonificacao, nome, cpf, rg, salario, setor, genero, estadoCivil, dataNascimento, endereco, logradouro, numero, complemento, cep, cidade, uf);
    }
    
    //method toString()

    @Override
    public String toString() {
        return "Prêmio: " + PREMIO;
    }

   
    
    
    //method getSalarioFinal
    @Override
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal += super.salario * this.PREMIO;
        SalarioFinal += super.salario * bonificacao.valor;
        SalarioFinal += super.salario;
        return SalarioFinal;
                
    }

    //Method admitir
    @Override
    public void admitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //method demitir
    @Override
    public void demitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
