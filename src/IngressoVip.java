public class IngressoVip extends Ingresso implements Imprimir {

    private double valorAdicional;

    public IngressoVip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip(){
         return super.getValorIngresso() + valorAdicional;
    }

    @Override
    public void imprimirValor() {
        System.out.printf("Valor do ingresso %.2fR$ + adicional %.2fR$ = total %.2fR$\n",
                getValorIngresso(), valorAdicional, getValorVip());
    }
}