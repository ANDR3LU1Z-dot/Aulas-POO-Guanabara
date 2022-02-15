package aula04;

public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Dundler", "rosa", 0.7f);
//        c1.setModelo("BIC");
//        c1.setPonta(0.6f);
        c1.destampar();
        c1.status();
        System.out.println("");
        c1.rabiscar();

    }
}
