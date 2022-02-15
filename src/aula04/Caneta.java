package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //Metodo construtor principal
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){return this.cor;}

    public void setCor(String c){this.cor = c;}


    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou Rabiscando...");
        }
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}
