package lista2.Exercicio2;

public class Triangulo extends FormaGeometrica {
    private int[] x;
    private int[] y;
    private double area;

    public Triangulo(int[] pontoX, int[] pontoY)
    {
        super(pontoX, pontoY);
    }

    public void setX(int[] x) {
        this.x = x;
    }
    public int[] getX() {
        return x;
    }
    public void setY(int[] y) {
        this.y = y;
    }
    public int[] getY() {
        return y;
    }
    
    public void calculaArea()
    {
        double a = ((x[0]*y[1] + x[1]*y[2] + x[2]*y[0]) - (x[1]*y[0] + x[2]*y[1] + x[0]*y[2]))/2;
        if(a<0)
            a*=-1;
        this.area = a;
    }
    public double getArea() 
    {
        return area;
    }        
}
