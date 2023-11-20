package Model;

public class Espaco {
    protected String nome, localizacao;
    protected int ano;

    public Espaco(String nome, String localizacao, int ano) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Espaco{" +
                "nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", ano=" + ano +
                '}';
    }
}
