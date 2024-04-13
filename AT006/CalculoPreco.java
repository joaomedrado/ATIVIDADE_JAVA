 package AT006;

 public class CalculoPreco {

    private double calculoPreco;

    public double getCalculoPreco(){return this.calculoPreco;}

    public void CalculoPrecoMetodo(double precoProduto, int quantidade){
        this.calculoPreco = precoProduto * quantidade;
    }
    
}