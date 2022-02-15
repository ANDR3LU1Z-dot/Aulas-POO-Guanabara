package aula05;

public class OutContaBanco {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        conta.abrirConta("cp");
        conta.status();
    }
}
