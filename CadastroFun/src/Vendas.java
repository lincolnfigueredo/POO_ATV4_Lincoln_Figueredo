public class Vendas {
    public double valorVenda;

    public Vendas(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "(R$ " + valorVenda + ")";
    }
}
