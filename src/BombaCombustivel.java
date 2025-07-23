public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, int quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    // Altera tipo do combustivel
    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    // Altera valor do combustivel
    public void alterarValor(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    // Altera a quantidade de Combustivel
    public void alterarQuantidadeCombustivel(int quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor){
        double litrosAbastecidos = valor / this.valorPorLitro;
        this.quantidadeCombustivel += litrosAbastecidos;
        System.out.printf("%.2f reais colocados!\n", valor);
        System.out.printf("Total de litros abastecidos: %.0fL\n", litrosAbastecidos);
    }

    public void abastecerPorLitro(double litro){
        double valorPago = litro * this.valorPorLitro;
        this.quantidadeCombustivel += litro;
        System.out.printf("%.1f litros colocados \n", litro);
        System.out.printf("Valor a pagar: R$: %.2f\n", valorPago);
    }
}
