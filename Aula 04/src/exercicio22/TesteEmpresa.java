package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp", "12.345.678/0001-99", 100);
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());

        empresa.contratarFuncionario();
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());

        empresa.demitirFuncionario();
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());
    }
}
