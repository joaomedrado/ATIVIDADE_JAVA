package AT005;

import javax.print.DocFlavor.STRING;

public class Concatenacao {
    
    private String conc;

    public String getConcatenacao(){return this.conc;}

    public void ConcatenacaoMetodo(char letra, String palavra){
        this.conc = letra + "" + palavra;
    }
}
