package apolice;
public class Carro implements Apolice{
    int ano;
    double valor;

    public Carro(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void calculaApolice() {
        if(ano < 2000)
            this.setValor(this.getValor()*0.09);
        else
            this.setValor(this.getValor()*0.04);
    }
}