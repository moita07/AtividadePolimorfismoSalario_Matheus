public class Empresa {    
    public static void main(String[] args) {
        Funcionario v = new Vendedor(2000, 500); // Vendedor
        Funcionario f = new FreeLancer(20, 150); // Freelancer
        Funcionario g = new Gerente(3000);       // Gerente

        System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(v));
        System.out.println("Salário do Freelancer: " + obterSalarioDoFuncionario(f));
        System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(g)); // Novo exemplo de polimorfismo
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal(); // Polimorfismo em ação
    }
}