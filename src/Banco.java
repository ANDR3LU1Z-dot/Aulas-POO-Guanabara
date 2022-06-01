public class Banco {

    public int numC;
    protected String tipoC;
    private String donoC;
    private float saldoC;

    public Banco(float saldo) {
        this.saldoC = saldo;

    }

    public int getNumC() {
        return this.numC;
    }

    public void setNumC(int numero_conta) {
        this.numC = numero_conta;
    }

    public String getTipoC() {
        return this.tipoC;
    }

    public void setTipoC(String tipo) {
        this.tipoC = tipo;
    }

    public String getDonoC() {
        return this.donoC;
    }

    public void setDonoC(String dono) {
        this.donoC = dono;
    }

    public float getSaldoC() {
        return saldoC;
    }

    public void depositar(float saldoC) {
        this.saldoC += saldoC;
    }

    public void sacar(float valor) {
        if(saldoC == 0 || valor > saldoC){
            System.out.println("Saldo Insuficiente!");
        }  else {
            saldoC -= valor;
        }
    }

    public void transferir(float valor, Banco obj){
        if(saldoC == 0 || valor > saldoC){
            System.out.println("Saldo Insuficiente!");
        }  else {
            this.saldoC -= valor;
            obj.saldoC += valor;
        }

    }

}
