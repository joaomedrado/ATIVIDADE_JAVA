 package AT002;

 public class IMC {

   private double calculoIMC;

     
   public double getIMC(){return this.calculoIMC;}

   public void CalculoIMCMetodo(double peso, double altura){

        this.calculoIMC = peso / (altura * altura);

        if (this.calculoIMC < 18.5) {
            
            System.out.printf("Seu IMC é %.2f ABAIXO DO PESO", this.calculoIMC);
        }else if (this.calculoIMC > 18.5 && this.calculoIMC < 24.9) {
            
            System.out.printf("Seu IMC é %.2f PESO NORMAL", this.calculoIMC);
        }else if (this.calculoIMC > 25 && this.calculoIMC < 29.9) {
            
            System.out.printf("Seu IMC é %.2f SOBREPESO", this.calculoIMC);
        }else if (this.calculoIMC > 30 && this.calculoIMC < 34.9) {
            
            System.out.printf("Seu IMC é %.2f OBESIDADE 1", this.calculoIMC);
        }
        else if (this.calculoIMC > 35 && this.calculoIMC < 39) {
            
            System.out.printf("Seu IMC é %.2f OBESIDADE 2", this.calculoIMC);
        }else if (this.calculoIMC > 40) {
            
            System.out.printf("Seu IMC é %.2f OBESIDADE 3", this.calculoIMC);
        }


   }
}