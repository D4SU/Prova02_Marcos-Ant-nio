/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    //Criando as constantes
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São-Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    //Especificando o tipo
    protected String nome;
    protected String sigla;
    
    
    //Construct

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    //Getter

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
           
    
 
    
}
