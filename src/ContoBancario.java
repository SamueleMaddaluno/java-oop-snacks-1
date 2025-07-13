public class ContoBancario {
    private String numeroDiConto;
    private int saldo;
    
    public ContoBancario(String numeroDiConto){
        this.numeroDiConto=numeroDiConto;
        if (numeroDiConto.length() != 10){
            numeroDiConto=null;
            System.out.println("Il numero di conto inserito non è valido");
        }
        else{
        saldo=0;
        this.numeroDiConto=numeroDiConto;
        }
    }

    public int prelevo20(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo -= 20;
        }
    }
    public int prelevo50(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo -= 50;
        }
    }
    public int deposito5(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo += 5;
        }
    }
    public int deposito10(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo += 10;
        }
    }
    public int deposito20(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo += 20;
        }
    }
    public int deposito50(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo += 50;
        }
    }
    public int prelevo5(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo -= 5;
        }
    }
    public int prelevo10(){
        if(numeroDiConto.length() != 10){
           return saldo = saldo;
        }
        else{
        return saldo -= 10;
        }
    }
   
     public int getSaldo() {
        return saldo;
    }
}
