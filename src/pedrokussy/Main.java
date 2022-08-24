package pedrokussy;

public class Main {
	public static void  main(String[] args) {

		Funcionario funcionario = new Funcionario("Bobongu Cecile", "Venda");
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionarioDAO.novoFuncionario(funcionario);
			
	}
} 
