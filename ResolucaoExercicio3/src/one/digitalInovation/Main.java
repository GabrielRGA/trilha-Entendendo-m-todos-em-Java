/*
* Exercício consiste em adicionar ao exercício anterior o retorno dos  métodos
*/

package one.digitalInovation;

public class Main {
    public static void main(String[] args) {
        //----- Polígono ----
        double areaQuadrado = Poligono.area(3);
        System.out.println("Area do Quadrado: " + areaQuadrado);
        double areaRetangulo = Poligono.area(5,5);
        System.out.println("Area do Retangulo: " + areaRetangulo);
        double areaTriangulo = Poligono.area(7,8,9);
        System.out.println("Area do Triangulo: " + areaTriangulo);
    }
}
