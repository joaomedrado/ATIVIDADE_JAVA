package AT008;


public class CalculadoraDesconto {

    private double calculoDesconto;
    private double precoComDesconto;
    private double valorDesconto = 10.00;

    public double getValorDesconto(){return this.valorDesconto;}
    
    public double getCalculoDesconto(){return this.calculoDesconto;}

    public double getPrecoComDesconto(){return this.precoComDesconto;}

    public void CalculadoraDescontoMetodo(double precoCompra){
        this.calculoDesconto = (precoCompra * this.valorDesconto) / 100;
    }

    public void AplicarDescontoMetodo(double precoCompra){

        this.precoComDesconto = precoCompra - this.getCalculoDesconto();
    }
}