public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Homem de ferro";
        heroi.nivel = 1;
        heroi.forca = 20;

        heroi.mostrarStatus();
        heroi.atacar("Thanos", "Espada");
    }
}