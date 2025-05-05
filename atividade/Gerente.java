public class Gerente extends Funcionario {
    private double salarioBase;
    private double BONUS = 1000.0;

    public Gerente(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + BONUS;
    }
}