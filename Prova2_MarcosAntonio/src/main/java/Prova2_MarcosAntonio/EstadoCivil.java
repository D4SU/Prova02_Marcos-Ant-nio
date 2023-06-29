/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Prova2_MarcosAntonio;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    //Criando as constantes
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viúvo");
    
    
    //Especificando o tipo da variável
    protected String texto;
    
    //Construct

    private EstadoCivil(String texto) {
        this.texto = texto;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }
    
    
    
   
}
