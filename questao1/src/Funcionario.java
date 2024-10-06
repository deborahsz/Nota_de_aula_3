public class Funcionario {
    protected String nome;
    protected String nasc;
    protected double salario;

    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: " + salario);
    }

    public int calcularIdade() {
        String[] data = nasc.split("/");
        int anoNascimento = Integer.parseInt(data[2]);
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public void informarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + calcularIdade());
    }
}

