// declarando classe
public class ContaBancaria{

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        setTitular(titular);
        setSaldo(saldo);
    }

    public void setTitular(String titular){
        if (titular.isBlank()){
            this.titular = "Titular inválido";
        } else {
            this.titular = titular;
        }
    }

    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
}