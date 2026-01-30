package entities;

public class ClasseEx10{
	public String aluno;
	public double notaUm;
	public double notaDois;
	
	public ClasseEx10(String aluno, double notaUm, double notaDois) {
		this.aluno = aluno;
		this.notaUm = notaUm;
		this.notaDois = notaDois;
	}

	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public double getNotaUm() {
		return notaUm;
	}
	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}

	public double getNotaDois() {
		return notaDois;
	}
	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}
}
