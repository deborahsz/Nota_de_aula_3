public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        cachorro.caminha();
        cachorro.late();

        System.out.println();

        gato.caminha();
        gato.mia();
    }
}
