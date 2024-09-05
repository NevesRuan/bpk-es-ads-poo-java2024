package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp", "12.345.678/0001-99", 100);

        System.out.println(empresa);

        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
    }
}
