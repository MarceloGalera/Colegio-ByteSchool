package classes;

public class Aluno {
	
	private String nome;
	private int numeroDeSala;
	private double frequencia;
	private double nota1;
	private double nota2;
	private double notaTrabalho;
	
	public Aluno(String nome, int numeroDeSala, double frequencia, double nota1, double nota2, double notaTrabalho) {
		//super();
		this.nome = nome;
		this.numeroDeSala = numeroDeSala;
		this.frequencia = frequencia;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrabalho = notaTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeSala() {
		return numeroDeSala;
	}

	public void setNumeroDeSala(int numeroDeSala) {
		this.numeroDeSala = numeroDeSala;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
}
