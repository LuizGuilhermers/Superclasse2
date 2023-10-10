package AtividadeDois;

public class Engenheiro extends Funcionario {
	
	private int numCrea;

	public Engenheiro(String nome, String matricula, String telefone, double salario, String endereco,
			String dataNascimento, int numCrea) {
		super(nome, matricula, telefone, salario, endereco, dataNascimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	

}
