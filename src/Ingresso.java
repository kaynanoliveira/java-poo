public class Ingresso implements Imprimir{
    private double valorIngresso;

    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public double getValorIngresso(){
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void imprimirValor(){
        System.out.printf("Valor do ingresso R$ %.2f\n", getValorIngresso());
    }
}
