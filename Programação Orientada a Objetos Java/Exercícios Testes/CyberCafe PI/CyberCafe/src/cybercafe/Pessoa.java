package cybercafe;

// Projeto Integrador 06/11/2023
// Nomes: André Luis Mesquita Barbosa Júnior, Luís Henrique Medeiros Vanz,
// Milena Fontana Bregalda

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, int idade, String email, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("E-mail: " + getEmail());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
    }
}