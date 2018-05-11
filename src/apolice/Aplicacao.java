package apolice;
public class Aplicacao {
    public static void main(String[] args) {
        Carro carro = new Carro(2000, 100);
        Imovel imovel = new Imovel(100, 100);
        
        carro.calculaApolice();
        imovel.calculaApolice();
        
        System.out.println("Valor do Carro: "+carro.getValor());
        System.out.println("Valor do Imovel: "+imovel.getValor());
    }
}
