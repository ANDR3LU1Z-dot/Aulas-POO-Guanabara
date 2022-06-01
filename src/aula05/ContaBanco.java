package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados

    //Método Construtor
    public ContaBanco() {
        saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public int setNumConta(int nc){
        return  this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String setTipo(String t){
        return this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public String setDono(String d){
        return this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public float setSaldo(float s){
        return this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean setStatus(boolean status) {
        return  this.status = true;
    }

    //Função abrirConta
    public float abrirConta(String tipoConta){
        setTipo(tipoConta);
        setStatus(status);
        if(tipo == "cp"){
            return this.saldo = saldo + 150.00f;
        } else {
            return this.saldo = saldo + 50.00f;
        }
//        this.status = true;
    }

    //Função fecharConta
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro.");
        } else if(saldo < 0){
            System.out.println("Conta com débito.");
        } else {
            setStatus(false);
        }

    }

    public void depositar(float v){
        if(status = true){
             this.setSaldo(getSaldo() + v);
        } else{
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float sc){

        if(status = true){
            if(saldo > sc){
                saldo = saldo =sc;
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        int v = 0;
       if (tipo == "cc"){
           v = 12;
       } else if(tipo == "cp"){
           v = 20;
        }
       if(status == true){
           if(saldo > v){
               saldo = saldo - v;
           } else {
               System.out.println("Saldo Insuficiente");
           }
       } else{
           System.out.println("Impossível pagar");
       }
    }

    public void status(){
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status da conta: " + getStatus());
    }
}
