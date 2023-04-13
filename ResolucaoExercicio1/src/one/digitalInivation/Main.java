/*
* Exercício consiste em uma Calculadora, um metodo que retorna uma Mensagem e um 
* metodo que calcula Emprestimo
*/

package one.digitalInivation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("----- Exercício da Calculadora : -----");
        Calculadora.soma(3,6);
        Calculadora.subtracao(3,6);
        Calculadora.multiplicacao(3,6);
        Calculadora.divisao(3,6);

        //Mensagem
        System.out.println("\n----- Exercício da Mensagem : -----");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        //Emprestimo
        System.out.println("\n----- Exercício da Emprestimo : -----");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
