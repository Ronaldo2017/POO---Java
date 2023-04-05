package cursojava.classes;

public class Disciplina {

	private double n1;
	private String disciplina1;
	private double n2;
	private String disciplina2;
	private double n3;
	private String disciplina3;
	private double n4;
	private String disciplina4;

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		result = prime * result + ((disciplina2 == null) ? 0 : disciplina2.hashCode());
		result = prime * result + ((disciplina3 == null) ? 0 : disciplina3.hashCode());
		result = prime * result + ((disciplina4 == null) ? 0 : disciplina4.hashCode());
		long temp;
		temp = Double.doubleToLongBits(n1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(n2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(n3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(n4);
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
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (disciplina2 == null) {
			if (other.disciplina2 != null)
				return false;
		} else if (!disciplina2.equals(other.disciplina2))
			return false;
		if (disciplina3 == null) {
			if (other.disciplina3 != null)
				return false;
		} else if (!disciplina3.equals(other.disciplina3))
			return false;
		if (disciplina4 == null) {
			if (other.disciplina4 != null)
				return false;
		} else if (!disciplina4.equals(other.disciplina4))
			return false;
		if (Double.doubleToLongBits(n1) != Double.doubleToLongBits(other.n1))
			return false;
		if (Double.doubleToLongBits(n2) != Double.doubleToLongBits(other.n2))
			return false;
		if (Double.doubleToLongBits(n3) != Double.doubleToLongBits(other.n3))
			return false;
		if (Double.doubleToLongBits(n4) != Double.doubleToLongBits(other.n4))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [n1=" + n1 + ", disciplina1=" + disciplina1 + ", n2=" + n2 + ", disciplina2=" + disciplina2
				+ ", n3=" + n3 + ", disciplina3=" + disciplina3 + ", n4=" + n4 + ", disciplina4=" + disciplina4 + "]";
	}
	
	

}
