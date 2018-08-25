/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author Luan
 */
public class ContaCorrente {
    private static String numerodaConta;
    private static String nomeCorrentista;
    private static String Saldo="0";

    /**
     * @return the numerodaConta
     */
    public static String getNumerodaConta() {
        return numerodaConta;
    }
    /**
     * @param aNumerodaConta the numerodaConta to set
     */
    public static void setNumerodaConta(String aNumerodaConta) {
        numerodaConta = aNumerodaConta;
    }
    /**
     * @return the nomeCorrentista
     */
    public static String getNomeCorrentista() {
        return nomeCorrentista;
    }
    /**
     * @param alterarNome the nomeCorrentista to set
     */
    public static void alterarNome(String alterarNome) {
        nomeCorrentista = alterarNome;
    }
    /**
     * @return the Saldo
     */
    public static String getSaldo() {
        return Saldo;
    }
    /**
     * @param deposito the Saldo to set
     */
    public static void deposito(String deposito) {
        Saldo = deposito;
    }
    
    public static void saque(String saque) {
        Saldo = saque;
    }
    
    public ContaCorrente(String nome,String numeroConta)
    {
        nomeCorrentista=nome;
        numerodaConta=numeroConta;
    }
}
