import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    public int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    public void atacar(String inimigo, String arma) {
        int danoCausado = calcularDano();
        if (arma.isEmpty()) {
            System.out.printf("%s atacou %s e causou %d de dano",
                    nome, inimigo, danoCausado);
        } else {
            System.out.printf("%s usou '%s' para atacar %s e causou %d de dano",
                    nome, arma, inimigo, danoCausado);
        }
    }

    public void mostrarStatus() {
        System.out.printf("Personagem: %s no nivel (lvl: %d) com %d de força \n", nome, nivel, forca);
    }
}