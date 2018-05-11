package apolice;
public class Imovel {
    double area, valor;

    public Imovel(double area, double valor) {
        this.area = area;
        this.valor = valor;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void calculaApolice(){
        this.setValor(this.getValor()*0.03 + this.getArea()*0.05);
    }
}
