package aula22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String NOMEARQUIVO = "aluno.txt";
	
	public Aluno(Integer id, String nome, String curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
	}

	private Integer id;
	private String nome;
	private String curso;	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void salvar() throws FileNotFoundException, IOException {
		ObjectOutputStream arquivo = 
				new ObjectOutputStream(
						new FileOutputStream(NOMEARQUIVO));
		
		arquivo.writeObject(this);
		arquivo.close();
	}
	
	public Aluno pesquisar(Integer id) throws FileNotFoundException, IOException {
		ObjectInputStream arquivo = 
				new ObjectInputStream(
					new FileInputStream(NOMEARQUIVO));
		
		// NOTE: TERMINAR O PROGRAMA  
		
		return null;
	}
}
