public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenarPessoa("Kaynan", "26/02/2006", 1.73f);
        agenda.armazenarPessoa("Lucas", "23/05/2002", 1.70f);
        agenda.armazenarPessoa("Henrique", "01/02/2000", 1.93f);

        agenda.removerPessoa("Kaynan");
        agenda.imprimirAgenda();
    }
}