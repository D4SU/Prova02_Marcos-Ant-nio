/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    //Criando as variáveis
    GERENTE(0.15),
    DIRETOR(0.25);
    
    //Especificando o tipo
    double valor;
    
    
    //Construct

    private Bonificacao(double valor) {
        this.valor = valor;
    }
    
    //Getter

    public double getValor() {
        return valor;
    }
    
    
    
}
