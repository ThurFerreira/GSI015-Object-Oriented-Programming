public class ContaEspecial extends ContaCorrente{

    private float limite;
    public ContaEspecial(float val, int num, int pwd, int limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    public boolean debitaValor ( float val , int pwd ) {
        if ( isSenha(pwd) )
            return ( false ); // senha deve ser válida
        if ( getEstado(pwd) != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > getSaldo(pwd) )
            return ( false );

       debitaValor(val);

        if ( getSaldo(pwd) == 0 && !(limite > 0) ) //conta especial com limite maior que zero pode ter seu saldo = 0
            setEstado( pwd,2); // torna conta inativa
        return ( true ) ;
    }
}
