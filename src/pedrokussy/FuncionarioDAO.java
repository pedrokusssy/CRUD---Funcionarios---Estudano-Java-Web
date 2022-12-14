package pedrokussy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class FuncionarioDAO {
	private  Connection connection;

	public FuncionarioDAO() {
		this.connection = new Connector().getConnection();
	}

	public void novoFuncionario(Funcionario funcionario) {
		final String sql = "INSERT INTO func (nome, funcao) VALUES (?, ?)";

		try {

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, funcionario.getNome());
			statement.setString(2, funcionario.getFuncao());

		 	statement.execute();
			statement.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void atualizarFuncionario(Funcionario func){

		final String sql = "UPDATE func SET nome=?, funcao=? WHERE id=?";

		try{

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1,func.getNome());
			statement.setString(2, func.getFuncao());
			statement.setInt(3, func.getId());
			
			statement.execute();
			statement.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	
}
