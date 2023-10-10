package AtividadeDois;

import AtividadeUm.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		 Funcionario funcionario = new Funcionario ("Luiz", "458", "99863258", 5000, "rua das flores", "06/09/06");
		 System.out.println(funcionario.getNome());
		 System.out.println(funcionario.getMatricula());
		 System.out.println(funcionario.getTelefone());
		 System.out.println(funcionario.getSalario());
		 System.out.println(funcionario.getTelefone());
		 System.out.println(funcionario.getDataNascimento());

		 Engenheiro engenheiro = new Engenheiro ("Luiz", "458", "99863258", 5000, "rua das flores", "06/09/06", 5689);
		 System.out.println("\n" + engenheiro.getNome());
		 System.out.println(engenheiro.getMatricula());
		 System.out.println(engenheiro.getTelefone());
		 System.out.println(engenheiro.getSalario());
		 System.out.println(engenheiro.getTelefone());
		 System.out.println(engenheiro.getDataNascimento());
		 System.out.println(engenheiro.getNumCrea());

		 Medico medico = new Medico ("Luiz", "458", "99863258", 5000, "rua das flores", "06/09/06", 5689);
		 System.out.println("\n"+medico.getNome());
		 System.out.println(medico.getMatricula());
		 System.out.println(medico.getTelefone());
		 System.out.println(medico.getSalario());
		 System.out.println(medico.getTelefone());
		 System.out.println(medico.getDataNascimento());
		 System.out.println(medico.getCrm());
		 
		 Administrador administrador  = new Administrador ("Luiz", "458", "99863258", 5000, "rua das flores", "06/09/06", 5689);
		 System.out.println("\n"+ administrador.getNome());
		 System.out.println(administrador.getMatricula());
		 System.out.println(administrador.getTelefone());
		 System.out.println(administrador.getSalario());
		 System.out.println(administrador.getTelefone());
		 System.out.println(administrador.getDataNascimento());
		 System.out.println(administrador.getCra());
	}

}
