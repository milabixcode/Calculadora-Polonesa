package lista2.Exercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double calculaArea(int formaGeometrica, Scanner teclado) throws InputMismatchException
    {
        int[] x,y;
        FormaGeometrica figura;
        switch (formaGeometrica) {
            case 1:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe duas coordenadas opostas do quadrado:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Quadrado(x, y);
                figura.calculaArea();
                break;
            case 2:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe duas coordenadas opostas do retangulo:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Retangulo(x, y);
                figura.calculaArea();
                break;
            case 3:
                x = new int[3];
                y = new int[3];
                System.out.println("Informe as coordenadas do triangulo:");
                for (int i=0;i<3;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Triangulo(x, y);
                figura.calculaArea();
                break;
            case 4:
                x = new int[2];
                y = new int[2];
                System.out.println("Informe as coordenadas do centro do circulo e de um ponto qualquer:");
                for (int i=0;i<2;i++)
                {
                    System.out.print("x" + i + ": ");
                    x[i] = teclado.nextInt();
                    System.out.print("y" + i + ": ");
                    y[i] = teclado.nextInt();
                }
                figura = new Circulo(x, y);
                figura.calculaArea();
                break;
            default:
                return -1;
        }
        return figura.getArea();
    }
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a forma geometrica que deseje calcular a area:");
        System.out.println("(1) - Quadrado\n (2) - Retângulo\n (3) - Triângulo\n (4) - Círculo\n");
        double area;
        try {
            int formaGeometrica = teclado.nextInt();
            area = calculaArea(formaGeometrica, teclado);
        } catch (InputMismatchException e) {
            System.out.println("\nHouve um erro na hora de processar as entradas. Verifique as informacoes e tente novamente!");
            return;
        }
        if (area>=0)
        System.out.println("Area: " + area);
        else
        System.out.println("Figura geometrica invalida");
        
        teclado.close();
    }
}

