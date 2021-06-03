public class Funcionario extends Pessoa {
    protected String cargo;
    protected double salario;

    public Funcionario(String cpf, String nome, int idade, String cargo, double salario) {
        super(cpf, nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo + ", Salário: R$ " + salario;
    }
}
