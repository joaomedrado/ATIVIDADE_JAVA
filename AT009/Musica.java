package AT009;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    public int curtidas = 0;

    public String getTitulo(){return this.titulo;}
    public String getArtista(){return this.artista;}
    public int getAnoLancamento(){return this.anoLancamento;}


    public Musica(String titulo,String artista,int anoLancamento,int curtidas){
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.curtidas = curtidas;
    }

    public void ExibirFichaTecnica(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Ano Lançamento: " + this.getAnoLancamento());
        System.out.println("Curtidas: " + this.curtidas);
    }

    public void Curtidas(){
        this.curtidas++;
    }
}
