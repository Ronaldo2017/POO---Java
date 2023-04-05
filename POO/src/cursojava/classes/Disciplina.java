package cursojava.classes;

//essa classe servira para todos os objetos e instancias de notas e materias
public class Disciplina {

	private double n;
	private String disciplina;

	public double getN() {
		return n;
	}

	public void setN(double n) {
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
		long temp;
		temp = Double.doubleToLongBits(n);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(n) != Double.doubleToLongBits(other.n))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [n=" + n + ", disciplina=" + disciplina + "]";
	}

}
