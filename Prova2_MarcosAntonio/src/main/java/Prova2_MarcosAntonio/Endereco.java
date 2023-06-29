/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public class Endereco {
    //Especificando as variaveis e seus tipos
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;
    
    //Construct

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    //method toString()

    @Override
    public String toString() {
        return "\n Logradouro: " + logradouro + 
                "\n Número: " + numero + 
                "\n Complemento: " + complemento + 
                "\n CEP: " + cep + 
                "\n Cidade: " + cidade + 
                "\n UF: " + uf;
    }
    
    
}
