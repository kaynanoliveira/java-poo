import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kaynan", LocalDate.of(2006,2,26),1.73f );
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade() + " anos");
    }
}
