public class IngressoVip extends Ingresso {

    private double valorAdicional;

    public IngressoVip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip(){
         return super.getValorIngresso() + valorAdicional;
    }


    public void imprimirValorVip(){
        System.out.printf("Valor do ingresso R$ %.2f + adicional R$ %.2f = total R$ %.2f\n", getValorIngresso(), valorAdicional, getValorVip());
    }
}
