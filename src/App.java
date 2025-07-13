
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Snack 1

        // Studente studente1 = new Studente("Gianni","Gianlu",20);
        // System.out.println("La concatenazione è "+studente1.catena());

        // Snack 2

        // ContoBancario contobancario1 = new ContoBancario("IT54669845");
        // ContoBancario contobancario3 = new ContoBancario("IT546645");

    //     contobancario1.prelevo5();
    //     contobancario3.prelevo5();
    //     contobancario1.deposito50();
    //     contobancario1.deposito20();
    //     contobancario1.prelevo50();
    //     System.out.println(contobancario1.getSaldo());
    //     System.out.println(contobancario3.getSaldo());


        // Snack 3

        RegistroStudenti registroStudenti1 = new RegistroStudenti();

        registroStudenti1.aggiungiStudente();
        registroStudenti1.aggiungiStudente();
        registroStudenti1.aggiungiStudente();
        registroStudenti1.aggiungiStudente();

       System.out.println(Arrays.toString(registroStudenti1.getStudente()));
    }
}
