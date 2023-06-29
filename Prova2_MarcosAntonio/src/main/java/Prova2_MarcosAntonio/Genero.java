/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public enum Genero {
    //Criando as constantes
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    
    //Especificando o tipo da variável
    protected String texto;
    protected char caractere;
    
    //Construct

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
}
