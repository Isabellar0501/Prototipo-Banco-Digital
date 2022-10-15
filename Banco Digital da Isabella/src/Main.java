public class Main {

    public static void main(String[] args ){
        Cliente teste = new Cliente();
                teste.setNome("Teste");

        Conta cc = new ContaCorrente(teste);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(teste);
        cc.transferir(50, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

    }
}
