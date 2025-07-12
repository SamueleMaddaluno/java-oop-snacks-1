public class Studente {
    private String nome;
    private String cognome;
    private int età;
   
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

   public String catena(){
    return nome +" "+ cognome +","+ età+" anni";
   }
}
