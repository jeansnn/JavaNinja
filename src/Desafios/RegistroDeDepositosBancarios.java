package Desafios;

public class RegistroDeDepositosBancarios {
    public static void main(String[] args) {
        double ultimosDepositos[] = new double[5];
        ultimosDepositos[0] = 100.50;
        ultimosDepositos[1] = 154.45;
        ultimosDepositos[2] = 54.25;
        ultimosDepositos[3] = 765.34;
        ultimosDepositos[4] = 95.34;

        double saldoTotal = 0.0;
        for (int i=0; i<ultimosDepositos.length; i++){
            saldoTotal += ultimosDepositos[i];
        }
        System.out.printf("O total depositado os ultimos 5 registros foi de: R$%.2f", saldoTotal);
    }
}
