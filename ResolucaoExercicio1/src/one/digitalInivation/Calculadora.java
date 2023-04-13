package one.digitalInivation;

public class Calculadora{
    public static void soma(double primeiroValor, double segundoValor){
        double resultado = primeiroValor + segundoValor;
        System.out.println("--> Soma de " +primeiroValor+" + "+segundoValor+" = "+ resultado);
    }
    public static void subtracao(double primeiroValor, double segundoValor){
        double resultado = primeiroValor - segundoValor;
        System.out.println("--> Subtracao de " +primeiroValor+" - "+segundoValor+" = "+ resultado);
    }
    public static void multiplicacao(double primeiroValor, double segundoValor){
        double resultado = primeiroValor * segundoValor;
        System.out.println("--> Multiplicacao de " +primeiroValor+" * "+segundoValor+" = "+ resultado);
    }
    public static void divisao(double primeiroValor, double segundoValor){
        double resultado = primeiroValor / segundoValor;
        System.out.println("--> Divisao de " +primeiroValor+" / "+segundoValor+" = "+ resultado);
    }
}
