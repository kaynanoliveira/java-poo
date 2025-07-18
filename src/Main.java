public class Main {
    public static void main(String[] args) {

        // Declarando um objeto do tipo celular => Instanciando um objeto
        Celular iphone = new Celular();
        iphone.nome = "Iphone 12";
        iphone.armazenamento = 256;
        iphone.sistemaOperacional = "iOS";
        iphone.tamanhoTela = 6.2f;

        System.out.printf("Celular %s com tela de %.1f, com %dgb e SO %s", iphone.nome,
                iphone.tamanhoTela, iphone.armazenamento, iphone.sistemaOperacional);
    }
}
