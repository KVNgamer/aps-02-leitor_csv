
public class participante {
	private String nome,email;
	private int numPart=0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "participante n° "+ numPart +", Nome=" + nome + ", Email=" + email;
	}

	public int getNumPart() {
		return numPart;
	}

	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}

}
