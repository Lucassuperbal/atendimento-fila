public class Pessoa {
private String nome;
private String cpf;
private String telefone;
private String datanascimento;


public Pessoa(String nome, String cpf, String telefone, String datanascimento){
this.nome = nome;
this.cpf = cpf;
this.telefone = telefone;
this.datanascimento = datanascimento;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public String toString(){
        String str = "";

        str += "Nome:"+nome;
        str += " Cpf:"+cpf;
        str += " Telefone:"+telefone;
        str += " Data de nascimento:"+datanascimento;
        

        return str;
    }

}