import java.util.Scanner;

public class RegistroStudenti {
   private String[]studente=new String[20];

     public RegistroStudenti() {
    }

    public void  aggiungiStudente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci Nome-Cognome del nuovo studente");
        String nuovoStudente = scan.nextLine();
        for(int i = 0; i<=studente.length-1;i++){
            if (studente[i] == null){
                studente[i] = nuovoStudente;
                break;
            }
        }
    }
    public String[] getStudente() {
        return studente;
    }

    
}
       