package entidade;

public class Aluno {
	private int ra;
	private String nome;
	private String curso;
	private String turno;
	private char sexo;
	
	public Aluno() {
		super();
	}

	/**
	 * @return the ra
	 */
	public int getRa() {
		return ra;
	}

	/**
	 * @param ra the ra to set
	 */
	public void setRa(int ra) {
		this.ra = ra;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public String getDados() {
		String dados = "Aluno: " + this.getNome() + " - RA: " + this.getRa() + "\n" +   
				 "Curso: " + this.getCurso() + "\n" + "Turno: "  + this.getTurno() + "\n" + 
				"Sexo: " + this.getSexo() + "\n" + "_____" + "\n";
		return dados;
	}


}
