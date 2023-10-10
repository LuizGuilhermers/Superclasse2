package AtividadeDois;

public class Funcionario {
	private String nome;
	private String matricula;
	private String telefone;
	private double salario;
	private String endereco;
	private String dataNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Funcionario(String nome, String matricula, String telefone, double salario, String endereco,
			String dataNascimento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.telefone = telefone;
		this.salario = salario;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

}
