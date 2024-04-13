package AT003;

public class CalculoMedia {
    
    private double calculoMedia;

    public double getMedia(){return this.calculoMedia;}

    public void CalculoMediaMetodo(double notaONe, double notaTwo, double notaThree){
        this.calculoMedia = (notaONe + notaTwo + notaThree ) / 3;
    }
}
