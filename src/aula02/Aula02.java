package aula02;

import aula02.Caneta;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 90;
//        c1.tampada = false;
        c1.status();
        /**
         * Apesar do atributo "tampada" ser privado, podemos alterar o valor desse atributo através dos
         * metodos "tampada" e "destampada" por eles serem publicos
         */
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();

    }

}
