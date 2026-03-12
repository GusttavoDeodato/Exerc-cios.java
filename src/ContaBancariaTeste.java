public class ContaBancariaTeste{

    public static void main (String[] args){

        ContaBancaria conta1 = new ContaBancaria("Gustavo Deodato", 500.00);
        ContaBancaria conta2 =  new ContaBancaria("Gabrielle Andrade", 100.00);
        ContaBancaria conta3 = new ContaBancaria(" ", -50.00);

        System.out.printf("Titular: %s | Saldo: %.2f\n", conta1.getTitular(), conta1.getSaldo());
        System.out.printf("Titular: %s | Saldo: %.2f\n", conta2.getTitular(), conta2.getSaldo());
        System.out.printf("Titular: %s | Saldo: %.2f\n", conta3.getTitular(), conta3.getSaldo());
    }
}
