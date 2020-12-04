package classes;

import javax.swing.JOptionPane;

public class Cliente {
	
	public int id;
    public String nome, telefone;
    public String endereco, email;
	public Aluno aluno;
    
 public Cliente() {
        
    }
    
   
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public void exibir(){
        String texto = "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEndereço" + this.endereco;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    @SuppressWarnings("unused")
	private void exibeEmail(){
        String texto = "Email: " + this.email ;
        JOptionPane.showMessageDialog(null, texto);
    }

}
