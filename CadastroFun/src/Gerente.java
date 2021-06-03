import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    protected List<Vendedor> vendedores = new ArrayList<>();
    protected List<Vendas> vendas = new ArrayList<>();

    protected String setor;
    protected double comissaoGerente;
    protected double comissaoTotalGerente;

    public Gerente(String cpf, String nome, int idade, String cargo, double salario, String setor, double comissaoGerente, double comissaoTotalGerente) {
        super(cpf, nome, idade, cargo, salario);
        this.setor = setor;
        this.comissaoGerente = comissaoGerente;
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getComissaoGerente() {
        return comissaoGerente;
    }

    public void setComissaoGerente(double comissaoGerente) {
        this.comissaoGerente = comissaoGerente;
    }

    public double getComissaoTotalGerente() {
        for(int i = 0; i < vendedores.size(); i++) {
            //comissaoTotalGerente += vendedores.get(i).getTotalVendas() * comissaoGerente;
            comissaoTotalGerente += vendedores.get(i).totalVendas * comissaoGerente;
        }
        return comissaoTotalGerente;
    }

    public void setComissaoTotalGerente(double comissaoTotalGerente) {
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    @Override
    public double getSalario() {
        salario += comissaoTotalGerente;
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor + "\n║ Comissão do Gerente: " + comissaoGerente + ", Comissao Total do Gerente: R$ " + comissaoTotalGerente +
                                                        "\n║ Responsável pelos Vendedores: " + vendedores + "\n";
    }
}
