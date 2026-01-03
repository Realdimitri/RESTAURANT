public class Cliente {

private  String nome;
private String endereco;
private String telefone;


    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        if(telefone.length()<11){
            throw new IllegalArgumentException("Insira o telefone com código da área 2 dígitos e número com 9 dígitos, exemplo: (xx)xxxxxxxx");
        }

    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +"\n" +
                "Telefone: " + telefone +"\n" +
                "Endereço: " + endereco + "\n";

    }
}
