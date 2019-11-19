public class Exercicio1 {
    public static void main(String[] args){
        Integer umNumeroA = 2;
        Double umNumeroB = 2.1;
        String umaCadeiaDeTexto = "Olá, tudo bem?";
       // System.out.println(umNumeroA, umNumeroB, umaCadeiaDeTexto);
        System.out.println(soma(umNumeroA,umNumeroB));


    }

    public static Double soma(Integer umNumeroA, Double umNumeroB){
        return umNumeroA + umNumeroB;
    }

    public static Double diferenca(Integer umNumeroA, Double umNumeroB){
        return umNumeroA - umNumeroB;
    }
}
