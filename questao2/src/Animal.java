public class Animal {
    protected String nome;
    protected String raca;

    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecido";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecido";
    }

    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
