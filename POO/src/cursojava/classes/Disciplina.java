package cursojava.classes;

import java.util.Arrays;

//essa classe servira para todos os objetos e instancias de notas e materias
public class Disciplina {

	private double[] n = new double[4];
	private String disciplina;

	

	public double[] getN() {
		return n;
	}

	public void setN(double[] n) {
		this.n = n;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(n);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(n, other.n))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [n=" + n + ", disciplina=" + disciplina + "]";
	}
	
	public double getMediaNotas() {
		double soma = 0;
		for(int pos = 0; pos < n.length; pos++) {
			soma += n[pos];
		}
		return soma / 4;
	}

}
