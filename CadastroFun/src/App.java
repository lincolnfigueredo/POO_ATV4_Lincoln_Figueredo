import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //Criando Gerente: (cpf, nome, idade, cargo, salario, setor, comissaoGerente, comissaoTotalGerente)
        Gerente gerente01 = new Gerente("111.111.111-11", "Maria José Souza", 48, "Gerente Nível 2", 5500.00, "Veículos Novos", 0.1, 1.00);
        Gerente gerente02 = new Gerente("222.222.222-22", "João Pinheiro Silva", 50, "Gerente Nível 1", 6000.00, "Veículos Usados", 0.1, 1.00);
        //Criando Vendedor: (cpf, nome, idade, cargo, salario, gerente, totalVendas, comissaoVendedor, totalComissao)
        Vendedor vendedor01 = new Vendedor("333.333.333-33", "Marcos Antônio Santos", 38, "Vendedor Novos", 2750.00, gerente01, 0.00, 0.005, 0.010);
        Vendedor vendedor02 = new Vendedor("444.444.444-44", "Joana Paula Rodrigues", 27, "Vendedor Usados", 2750.00, gerente02, 0.00, 0.005, 0.010);
        
        List<Vendas> vendas01 = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();

        //List<Vendedor> vendedores01 = new ArrayList<>();//
        //List<Vendedor> vendedores02 = new ArrayList<>();//
        //vendedores01.add(vendedor01);//
        //vendedores02.add(vendedor02);//
        //gerente01.setVendedores(vendedores01);//
        //gerente02.setVendedores(vendedores02);//

        Vendas produto1 = new Vendas(80000);
        Vendas produto2 = new Vendas(70000);
        Vendas produto3 = new Vendas(50000);
        Vendas produto4 = new Vendas(20000);
        Vendas produto5 = new Vendas(30000);
        Vendas produto6 = new Vendas(50000);

        vendas01.add(produto1);
        vendas01.add(produto2);
        vendas01.add(produto3);
        vendas02.add(produto4);
        vendas02.add(produto5);
        vendas02.add(produto6);
        vendedor01.setVendas(vendas01);
        vendedor02.setVendas(vendas02);
        vendedor01.getTotalVendas();
        vendedor01.getTotalComissao();
        vendedor02.getTotalVendas();
        vendedor02.getTotalComissao();

        gerente01.getComissaoTotalGerente();
        gerente02.getComissaoTotalGerente();

        System.out.println("\n********** Resumo de produção **********\n" + vendedor01.toString() + vendedor02.toString());
    }
}
