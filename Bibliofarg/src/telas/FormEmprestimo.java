package telas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormEmprestimo extends JInternalFrame {
	private JTextField txtNomeE;
	private JTextField txtLivroE;
	private JTextField txtCPFE;
	private JTextField txtMatriculaE;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public FormEmprestimo() {
		setTitle("Empretimo de Livros");
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 596, 499);
		getContentPane().setLayout(null);
		
		JLabel lblNomeE = new JLabel("Nome:");
		lblNomeE.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNomeE.setBounds(41, 56, 46, 14);
		getContentPane().add(lblNomeE);
		
		txtNomeE = new JTextField();
		txtNomeE.setBounds(91, 50, 282, 28);
		getContentPane().add(txtNomeE);
		txtNomeE.setColumns(10);
		
		JLabel lblLivroE = new JLabel("Livro:");
		lblLivroE.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLivroE.setBounds(41, 111, 46, 14);
		getContentPane().add(lblLivroE);
		
		txtLivroE = new JTextField();
		txtLivroE.setBounds(91, 105, 282, 28);
		getContentPane().add(txtLivroE);
		txtLivroE.setColumns(10);
		
		JRadioButton rdbtnProfessorE = new JRadioButton("Professor");
		rdbtnProfessorE.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnProfessorE.setBounds(41, 269, 109, 23);
		getContentPane().add(rdbtnProfessorE);
		
		JRadioButton rdbtnAlunoE = new JRadioButton("Aluno");
		rdbtnAlunoE.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnAlunoE.setBounds(41, 309, 109, 23);
		getContentPane().add(rdbtnAlunoE);
		
		
		buttonGroupTipoCliente = new ButtonGroup();
		buttonGroupTipoCliente.add(rdbtnProfessorE);
		buttonGroupTipoCliente.add(rdbtnAlunoE);
		
		JButton btnSalvarE = new JButton("Salvar");
		btnSalvarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnProfessorE.isSelected() ){
		            
		           System.out.println("10 dias para entregar o livro");
		        }else
		        {
		            
		        	System.out.println("07 dias para entregar o livro");
		        }
			}
		});
		btnSalvarE.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSalvarE.setBounds(233, 389, 89, 23);
		getContentPane().add(btnSalvarE);
		
		JLabel lblCPFE = new JLabel("CPF:");
		lblCPFE.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCPFE.setBounds(41, 171, 32, 14);
		getContentPane().add(lblCPFE);
		
		txtCPFE = new JTextField();
		txtCPFE.setBounds(94, 157, 282, 28);
		getContentPane().add(txtCPFE);
		txtCPFE.setColumns(10);
		
		JLabel lblMatriculaE = new JLabel("Matricula:");
		lblMatriculaE.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMatriculaE.setBounds(41, 215, 67, 22);
		getContentPane().add(lblMatriculaE);
		
		txtMatriculaE = new JTextField();
		txtMatriculaE.setBounds(118, 209, 255, 28);
		getContentPane().add(txtMatriculaE);
		txtMatriculaE.setColumns(10);

	}
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarE;
    private javax.swing.ButtonGroup buttonGroupTipoCliente;
    private javax.swing.JLabel lblMatriculaE;
    private javax.swing.JLabel lblCPFE;
    private javax.swing.JRadioButton rdbtnProfessorE;
    private javax.swing.JRadioButton rdbtnAlunoE;
 
	
	private void verificarTipoPessoaE() {
		 
		 if(rdbtnProfessorE.isSelected() ){
	            
	            lblCPFE.setEnabled( true );
	            txtCPFE.setEnabled( true );
	            lblCPFE.setVisible( true );
	            txtCPFE.setVisible( true );
	            
	            lblMatriculaE.setEnabled( false );
	            txtMatriculaE.setEnabled( false );
	            lblMatriculaE.setVisible( false );
	            txtMatriculaE.setVisible( false );
	            
	        }else if( rdbtnAlunoE.isSelected() ){
	            
	            lblCPFE.setEnabled( false );
	            txtCPFE.setEnabled( false );
	            lblCPFE.setVisible( false );
	            txtCPFE.setVisible( false );
	            
	            lblMatriculaE.setEnabled( true );
	            txtMatriculaE.setEnabled( true );
	            lblMatriculaE.setVisible( true );
	            txtMatriculaE.setVisible( true );
	        }else{
	            
	            lblCPFE.setEnabled( false );
	            txtCPFE.setEnabled( false );
	            lblCPFE.setVisible( false );
	            txtCPFE.setVisible( false );
	            
	            lblMatriculaE.setEnabled( false );
	            txtMatriculaE.setEnabled( false );
	            lblMatriculaE.setVisible( false );
	            txtMatriculaE.setVisible( false );
	        }
		 
		 
	 }
	
	
}

