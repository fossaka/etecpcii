package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			
			alunos.setNome("Tatiane5");
			alunos.setEndereco("Av. Águia de Haia");
			alunos.setBairro("Jd. cotinha");
			alunos.setCep(18111111);
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.deletar(3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
