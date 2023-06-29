/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Prova2_MarcosAntonio;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        //Criando o objeto Diretor
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Júlia", "874.322.785-82", "72-969.656.12", 5450.70, Setor.RECURSOS_HUMANOS, Genero.FEMININO, EstadoCivil.VIUVO, LocalDate.of(1983, Month.AUGUST, 12), new Endereco("Rua das Rosas", "234", "Apto 202", "763-584-406", "Salvador", UnidadeFederativa.BAHIA));
        //Criando o objeto motoboy
        Motoboy motoboy = new Motoboy("37373234", "Leandro", "462-132-324.211", "74.938-432", 1976, Setor.OPERACOES, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1992, Month.FEBRUARY, 15), new Endereco("Rua Dois de Julho", "463", "Ao lado da Sorveteri da Amaralina", "41-854-963", "Niterói", UnidadeFederativa.RIO_DE_JANEIRO));
        //Criando o objeto Gerente
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Marcela", "876.654.212.01", "87.653.232.11", 3560, Setor.JURIDICO, Genero.FEMININO, EstadoCivil.SEPARADO, LocalDate.of(2001, Month.DECEMBER, 25), new Endereco("Alameda Catanea", "562", "Próximo ao Hotel Fiesta", "68.672-708", "Mocca", UnidadeFederativa.SAO_PAULO));

//Exibindo o resultado
System.out.println("As informações do Diretor são: ");
        System.out.println("");
        System.out.println(diretor.toString());
        
        
        //Exibindo resultado de motoboy
        System.out.println("As informações de Motoboy são: ");
        System.out.println("");
        System.out.println(motoboy.toString());
        
        //Exibindo o resultado de Gerente
        System.out.println("As informações de Gerente são: ");
        System.out.println("");
        System.out.println(gerente.toString());
        
    }
}