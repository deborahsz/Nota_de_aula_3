public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", "15/05/1980", 8000.0, "Desenvolvimento de Software");
        Programador programador = new Programador("João", "22/11/1995", 5000.0, "Java");

        gerente.informarFuncionario();
        gerente.informarSalario();
        gerente.informarProjeto();

        System.out.println();

        programador.informarFuncionario();
        programador.informarSalario();
        programador.informarLinguagem();
    }
}
