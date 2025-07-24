public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(20.30);
        ingresso.imprimirValor();
        IngressoVip ingressoVip = new IngressoVip(30.0, 5.0);
        ingressoVip.imprimirValorVip();
    }
}