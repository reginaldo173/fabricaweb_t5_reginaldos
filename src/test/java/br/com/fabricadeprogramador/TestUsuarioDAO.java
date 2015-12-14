package br.com.fabricadeprogramador;

import org.postgresql.jdbc2.optional.SimpleDataSource;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		testExcluir();

	}

	public static void testCadastrar() {

		// criando o usuario
		Usuario usu = new Usuario();
		usu.setNome("Reginaldo");
		usu.setLogin("regi");
		usu.setSenha("123");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		System.out.println("Cadastrado com sucesso");
	}

	public static void testAlterar() {

		// criando o usuario
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("Reginaldo Sousa Barbosa ");
		usu.setLogin("Reginaldo172");
		usu.setSenha("Regi99");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		System.out.println("Alterado com sucesso");
	}

	public static void testExcluir() {

		// criando o usuario
		Usuario usu = new Usuario();
		usu.setId(1);

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		System.out.println("Excluido com sucesso");
	}

}
