public class Conversor {

    private double temperaturaFahrenheit;
    
    public double getConversor(){return this.temperaturaFahrenheit;}

    public void ConversorMetodo(double temperaturaCelsius){
        this.temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
    }
     
}