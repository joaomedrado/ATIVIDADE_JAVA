package AT007;

public class ConversaoMoeda {
    
    private double conversorMoeda;
    private double valorReal = 5.99;

    public double getConversor(){return this.conversorMoeda;}
    public double getConversorReal(){return this.valorReal;} 

    public void ConversaoMoedaMetodo(double valorDollars){
        this.conversorMoeda = valorDollars * this.valorReal;
    }
}
