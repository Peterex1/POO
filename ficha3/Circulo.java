public class Circulo {

    private double x;
    private double y;
    private double raio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    public Circulo(double nx, double ny, double nraio) {
        this.x = nx;
        this.y = ny;
        this.raio = nraio;
    }

    public Circulo(Circulo Circle) {
        this.x = Circle.getX();
        this.y = Circle.getY();
        this.raio = Circle.getRaio();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculaArea() {
        return (Math.PI * Math.pow(this.raio, 2));
    }

    public double calculaPerimetro() {
        return (2 * Math.PI * this.raio);
    }
}
