package AtividadeDois;

public class Administrador extends Funcionario{
	
	private int cra;

	public Administrador(String nome, String matricula, String telefone, double salario, String endereco,
			String dataNascimento, int cra) {
		super(nome, matricula, telefone, salario, endereco, dataNascimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}



}
