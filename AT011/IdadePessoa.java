package AT011;

public class IdadePessoa {
    private String nome;
    private int idade;

    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " não é maior de idade.");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa("João", 25);
        IdadePessoa pessoa2 = new IdadePessoa("Maria", 16);

        pessoa1.setIdade(30);
        pessoa2.setNome("Ana");

        pessoa1.verificarIdade();
        pessoa2.verificarIdade();
    }
}
