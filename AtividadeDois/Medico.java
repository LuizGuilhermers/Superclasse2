package AtividadeDois;

public class Medico extends Funcionario{
	
	private int crm;

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public Medico(String nome, String matricula, String telefone, double salario, String endereco,
			String dataNascimento, int crm) {
		super(nome, matricula, telefone, salario, endereco, dataNascimento);
		this.crm = crm;
	}

}
