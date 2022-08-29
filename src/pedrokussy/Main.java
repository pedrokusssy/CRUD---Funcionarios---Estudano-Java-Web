package pedrokussy;

public class Main {
	public static void  main(String[] args) {

		Funcionario funcionario = new Funcionario("Nazlinha  Cuteta", "Gestora");
		funcionario.setId(13);
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionarioDAO.atualizarFuncionario(funcionario);
			
	}
} 
