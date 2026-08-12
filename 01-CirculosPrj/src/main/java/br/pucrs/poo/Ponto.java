package br.pucrs.poo;

public class Ponto{
    private double coordx;
    private double coordy;

    public Ponto(double coordx, double coordy){
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public void mover(double coordx, double coordy){
        this.coordx = coordx;
        this.coordy = coordy;
    }

    public String toString(){
        return String.format(
            "(%.2f, %.2f)", coordx, coordy);
    }
}
