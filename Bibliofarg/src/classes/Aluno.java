package classes;

import javax.swing.JOptionPane;

public class Aluno  extends Cliente {
	
	//public int id;
		public String matricula;
		
		
		 public Aluno(){
		        super();
		    }
		    public Aluno(int id) {
		        this.id= id;
		    }

		    public Aluno(String nome) {
		        super(nome);
		    }
		    

		    @Override
		    public void exibir() {
		        String texto = "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereço:" + this.endereco + "\nEmail:" + this.email +
		                "\nMatricula: " + this.matricula;
		        JOptionPane.showMessageDialog(null, texto);
		      
		        
		    }

}
