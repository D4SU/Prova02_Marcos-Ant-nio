/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public enum Setor {
    //Criando as constantes
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos-Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    //Especificando o tipo
    protected String nome;
    
    //Construct
    private Setor(String nome) {
        this.nome = nome;
    }
    
    //Getter

    public String getNome() {
        return nome;
    }
    
    
    
}
