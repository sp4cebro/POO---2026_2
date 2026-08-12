package br.pucrs.poo;

public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo() {
        this(0, 0, 1);
    }

    public Circulo(double umX, double umY, double umRaio) {
        centro = new Ponto(umX, umY);
        this.raio = umRaio;
    }

    public void mover(double novoX, double novoY) {
        centro.mover(novoX, novoY);
    }

    public void zoom(double fator) {
        this.raio = this.raio * fator;
    }

    public double area() {
        double area = Math.PI * Math.pow(raio, 2);

        return area;
    }

    @Override
    public String toString() {
        return "centro: " + centro.toString() +
                " raio: " + this.raio +
                " area: " + this.area();
    }

}
