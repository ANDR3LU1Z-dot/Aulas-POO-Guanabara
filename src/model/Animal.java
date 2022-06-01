package model;

public class Animal {
    private  int tamanho;
    private String cor;
    private double peso;

    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.println("Correr como um animal");
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
