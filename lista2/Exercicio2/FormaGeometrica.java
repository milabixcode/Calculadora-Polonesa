package lista2.Exercicio2;

public abstract class FormaGeometrica
{
    private int[] x;
    private int[] y;
    private double area;

    public FormaGeometrica(int[] pontoX, int[] pontoY)
    {
        x = pontoX;
        y = pontoY;
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
    public abstract void calculaArea();
    public double getArea() 
    {
        return area;
    }
}
