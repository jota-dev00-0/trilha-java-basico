public class BancoTerminal {
    
    
    public static void main( String args[]){
        
        double Saldo = 25; // 15
        double ValorSolicitado = 18; //22
    if( Saldo >  ValorSolicitado){
        Saldo = Saldo -= ValorSolicitado;
        System.out.println(Saldo);
    }
    else if (ValorSolicitado > Saldo ){
        System.err.println("Saldo Indisponivel");
    }
    }
}
