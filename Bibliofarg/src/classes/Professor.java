package classes;

import javax.swing.JOptionPane;

public class Professor extends Cliente {

public String cpf;
	
	public Professor() {
		super();
	}
	
	  public Professor(int id) {
	        this.id= id;
	    }

	    public Professor(String nome) {
	        super(nome);
	    }
	
	@Override
    public void exibir() {
        String texto = "Nome: " + this.nome + "\nTelefone: " + this.telefone + 
                "\nCPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto);
      
        
    }
}
