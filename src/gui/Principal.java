/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import controller.UsuarioController;
import dao.UsuarioDAO;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import utilitarios.FundoDeTela;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.batik.xml.LexicalUnits;
import utilitarios.Conexao;

/**
 *
 * @author Edson Dias
 */
public class Principal extends javax.swing.JFrame {
    
    Connection con = null;
    
    FundoDeTela Desktop;
    ClienteGUI ClienteG;
    FuncionarioGUI FuncionarioG;
    EntregadorGUI EntregadorG;
    CardapioGUI CardapioG;
    PedidoGUI PedidoG;
    LoginGUI LoginG;
    UsuarioController UsuarioC;
    UsuarioDAO UsuarioD;
    AndamentoDaCozinhaGUI AndamentoDaCozinhaG;
    AndamentoGeralDoPedidoGUI AndamentoGeralDoPedidoG;
    AndamentoDaEntregaGUI AndamentoDaEntregaG;
    
    /**
     * Creates new form Principal
     */
    public Principal(String usuarioLogado) {
        initComponents();
        
        UsuarioC = new UsuarioController();
        UsuarioD = new UsuarioDAO();
        
        
        //jLabelApresentacaoUsuario.setText(usuario);
              
          con = utilitarios.Conexao.getConnection();
               
          jLabelUsuarioLogado.setText(usuarioLogado);
          
          
        //Fundo de Tela com imagem
        setLayout(new GridLayout()); 
        jMenuItemClientes.setIcon(new ImageIcon("Imagens/cardapio.png"));//imagem no menu cliente
        jMenuItemCardapios.setIcon(new ImageIcon("Imagens/cliente.png"));
        jMenuItemEntregadores.setIcon(new ImageIcon("Imagens/entregador.png"));
        jMenuItemFuncionarios.setIcon(new ImageIcon("Imagens/funcionario.png"));
        jMenuItemUsuarios.setIcon(new ImageIcon("Imagens/usuario.png"));
        jMenuItemPedidos.setIcon(new ImageIcon("Imagens/pedido.png"));
        jMenuItemAndamentoGeralDosPedidos.setIcon(new ImageIcon("Imagens/andamentoGeralPedido.png"));
        jMenuItemAndamentoDaCozinha.setIcon(new ImageIcon("Imagens/andamentoDaCozinha.png"));
        jMenuItemAndamentoDasEntregas.setIcon(new ImageIcon("Imagens/andamentoDaEntrega.png"));
        jMenuItemRelatorioClientes.setIcon(new ImageIcon("Imagens/cliente.png"));
        jMenuItemRelatorioCardapios.setIcon(new ImageIcon("Imagens/cardapio.png"));
        jMenuItemRelatorioEntregadores.setIcon(new ImageIcon("Imagens/entregador.png"));
        jMenuItemRelatorioFuncionarios.setIcon(new ImageIcon("Imagens/funcionario.png"));
        jMenuItemRelatorioPedidos.setIcon(new ImageIcon("Imagens/pedido.png"));
        jMenuItemSair.setIcon(new ImageIcon("Imagens/sair.png"));
        
        jMenuCadastro.setIcon(new ImageIcon("Imagens/cadastro.png"));
        jMenuAtendimento.setIcon(new ImageIcon("Imagens/atendimentoMenu.png"));
        jMenuCozinha.setIcon(new ImageIcon("Imagens/cozinha.png"));
        jMenuEntregador.setIcon(new ImageIcon("Imagens/entregadorMenu.png"));
        jMenuRelatorio.setIcon(new ImageIcon("Imagens/relatorioMenu.png"));
        jMenuSair.setIcon(new ImageIcon("Imagens/sair.png"));
        
        Desktop = new FundoDeTela("Imagens/fundoTelaPrincipal.jpeg");
        getContentPane().add(Desktop);
        Desktop.setVisible(true);
        
        getContentPane().add(jLabelUsuarioLogado);
        jLabelUsuarioLogado.setBounds(0, 0, 0, 0);
        jLabelUsuarioLogado.setVisible(false);
        

    }

    private Principal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuarioLogado = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCardapios = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemEntregadores = new javax.swing.JMenuItem();
        jMenuItemFuncionarios = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenu();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenuItemAndamentoGeralDosPedidos = new javax.swing.JMenuItem();
        jMenuCozinha = new javax.swing.JMenu();
        jMenuItemAndamentoDaCozinha = new javax.swing.JMenuItem();
        jMenuEntregador = new javax.swing.JMenu();
        jMenuItemAndamentoDasEntregas = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioClientes = new javax.swing.JMenuItem();
        jMenuItemRelatorioFuncionarios = new javax.swing.JMenuItem();
        jMenuItemRelatorioEntregadores = new javax.swing.JMenuItem();
        jMenuItemRelatorioCardapios = new javax.swing.JMenuItem();
        jMenuItemRelatorioPedidos = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Delivery");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelUsuarioLogado.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        jLabelUsuarioLogado.setForeground(new java.awt.Color(2, 2, 2));
        jLabelUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUsuarioLogado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelUsuarioLogado.setEnabled(false);
        jLabelUsuarioLogado.setFocusable(false);
        jLabelUsuarioLogado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelUsuarioLogado.setIconTextGap(-5);
        jLabelUsuarioLogado.setInheritsPopupMenu(false);
        jLabelUsuarioLogado.setRequestFocusEnabled(false);
        jLabelUsuarioLogado.setVerifyInputWhenFocusTarget(false);
        jLabelUsuarioLogado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabelUsuarioLogado);
        jLabelUsuarioLogado.setBounds(2, 2, 2, 2);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCardapios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCardapios.setText("Cardápios");
        jMenuItemCardapios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCardapiosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCardapios);

        jMenuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemClientes);

        jMenuItemEntregadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemEntregadores.setText("Entregadores");
        jMenuItemEntregadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntregadoresActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemEntregadores);

        jMenuItemFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemFuncionarios.setText("Funcionários");
        jMenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionarios);

        jMenuItemUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuAtendimento.setText("Atendimento");

        jMenuItemPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemPedidos.setText("Pedidos");
        jMenuItemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPedidosActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemPedidos);

        jMenuItemAndamentoGeralDosPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAndamentoGeralDosPedidos.setText("Andamento geral dos pedidos");
        jMenuItemAndamentoGeralDosPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAndamentoGeralDosPedidosActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAndamentoGeralDosPedidos);

        jMenuBarTelaPrincipal.add(jMenuAtendimento);

        jMenuCozinha.setText("Cozinha");

        jMenuItemAndamentoDaCozinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAndamentoDaCozinha.setText("Andamento da Cozinha");
        jMenuItemAndamentoDaCozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAndamentoDaCozinhaActionPerformed(evt);
            }
        });
        jMenuCozinha.add(jMenuItemAndamentoDaCozinha);

        jMenuBarTelaPrincipal.add(jMenuCozinha);

        jMenuEntregador.setText("Entregador");

        jMenuItemAndamentoDasEntregas.setText("Andamento das entregas");
        jMenuItemAndamentoDasEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAndamentoDasEntregasActionPerformed(evt);
            }
        });
        jMenuEntregador.add(jMenuItemAndamentoDasEntregas);

        jMenuBarTelaPrincipal.add(jMenuEntregador);

        jMenuRelatorio.setText("Relatório");

        jMenuItemRelatorioClientes.setText("Clientes");
        jMenuItemRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioClientesActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioClientes);

        jMenuItemRelatorioFuncionarios.setText("Funcionários");
        jMenuItemRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioFuncionariosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioFuncionarios);

        jMenuItemRelatorioEntregadores.setText("Entregadores");
        jMenuItemRelatorioEntregadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioEntregadoresActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioEntregadores);

        jMenuItemRelatorioCardapios.setText("Cardápios");
        jMenuItemRelatorioCardapios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioCardapiosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioCardapios);

        jMenuItemRelatorioPedidos.setText("Pedidos");
        jMenuItemRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioPedidosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioPedidos);

        jMenuBarTelaPrincipal.add(jMenuRelatorio);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        setBounds(0, 0, 462, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Maximiza a Tela
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
          
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        // Tornar tela interna visível
        ClienteG = new ClienteGUI();
        Desktop.add(ClienteG);
        ClienteG.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemCardapiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCardapiosActionPerformed
        // TODO add your handling code here:
        CardapioG = new CardapioGUI();
        Desktop.add(CardapioG);
        CardapioG.setVisible(true);
    }//GEN-LAST:event_jMenuItemCardapiosActionPerformed

    private void jMenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionariosActionPerformed
        // TODO add your handling code here:
        FuncionarioG = new FuncionarioGUI();
        Desktop.add(FuncionarioG);
        FuncionarioG.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionariosActionPerformed

    private void jMenuItemEntregadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntregadoresActionPerformed
        // TODO add your handling code here:
        EntregadorG = new EntregadorGUI();
        Desktop.add(EntregadorG);
        EntregadorG.setVisible(true);
    }//GEN-LAST:event_jMenuItemEntregadoresActionPerformed

    private void jMenuItemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPedidosActionPerformed
        // TODO add your handling code here:
        PedidoG = new PedidoGUI();
        Desktop.add(PedidoG);
        PedidoG.setVisible(true);
    }//GEN-LAST:event_jMenuItemPedidosActionPerformed

    private void jMenuItemRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioClientesActionPerformed
        try {
JasperDesign jd = JRXmlLoader.load("/home/linux/NetBeansProjects/Clientes.jrxml");
String sql = "SELECT * FROM cliente";
JRDesignQuery novaQuery = new JRDesignQuery();
novaQuery.setText(sql);
jd.setQuery(novaQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
JasperViewer.viewReport(jp);
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jMenuItemRelatorioClientesActionPerformed

    private void jMenuItemRelatorioCardapiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioCardapiosActionPerformed
        try {
JasperDesign jd = JRXmlLoader.load("/home/linux/NetBeansProjects/Cardapios.jrxml");
String sql = "SELECT * FROM cardapio";
JRDesignQuery novaQuery = new JRDesignQuery();
novaQuery.setText(sql);
jd.setQuery(novaQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
JasperViewer.viewReport(jp);
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jMenuItemRelatorioCardapiosActionPerformed

    private void jMenuItemRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioPedidosActionPerformed
        try {
JasperDesign jd = JRXmlLoader.load("/home/linux/NetBeansProjects/Pedidos.jrxml");
String sql = "SELECT * FROM pedido";
JRDesignQuery novaQuery = new JRDesignQuery();
novaQuery.setText(sql);
jd.setQuery(novaQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
JasperViewer.viewReport(jp);
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jMenuItemRelatorioPedidosActionPerformed

    private void jMenuItemRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioFuncionariosActionPerformed
        try {
JasperDesign jd = JRXmlLoader.load("/home/linux/NetBeansProjects/Funcionarios.jrxml");
String sql = "SELECT * FROM funcionario";
JRDesignQuery novaQuery = new JRDesignQuery();
novaQuery.setText(sql);
jd.setQuery(novaQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
JasperViewer.viewReport(jp);
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jMenuItemRelatorioFuncionariosActionPerformed

    private void jMenuItemRelatorioEntregadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioEntregadoresActionPerformed
        try {
JasperDesign jd = JRXmlLoader.load("/home/linux/NetBeansProjects/Entregadores.jrxml");
String sql = "SELECT * FROM entregador";
JRDesignQuery novaQuery = new JRDesignQuery();
novaQuery.setText(sql);
jd.setQuery(novaQuery);
JasperReport jr = JasperCompileManager.compileReport(jd);
JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
JasperViewer.viewReport(jp);
//jp.setVisible(true);
//jp.toFront();
}
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_jMenuItemRelatorioEntregadoresActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        
        try {
             if (UsuarioC.validarUsuarioLogado(jLabelUsuarioLogado.getText()))
             {
             
            LoginG = new LoginGUI();
            Desktop.add(LoginG);
            LoginG.setVisible(true);

        } else {
                 
            JOptionPane.showMessageDialog(null, "Acesso negado!!!");
             
             } 
        } catch (SQLException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
             
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemAndamentoDaCozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAndamentoDaCozinhaActionPerformed
            AndamentoDaCozinhaG = new AndamentoDaCozinhaGUI();
            Desktop.add(AndamentoDaCozinhaG);
            AndamentoDaCozinhaG.setVisible(true);
    }//GEN-LAST:event_jMenuItemAndamentoDaCozinhaActionPerformed

    private void jMenuItemAndamentoGeralDosPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAndamentoGeralDosPedidosActionPerformed
        try {
             if (UsuarioC.validarUsuarioLogado(jLabelUsuarioLogado.getText()))
             {
             
            AndamentoGeralDoPedidoG = new AndamentoGeralDoPedidoGUI();
            Desktop.add(AndamentoGeralDoPedidoG);
            AndamentoGeralDoPedidoG.setVisible(true);

        } else {
                 
            JOptionPane.showMessageDialog(null, "Acesso negado!!!");
             
             } 
        } catch (SQLException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, e);
        }    
        
        
           
    }//GEN-LAST:event_jMenuItemAndamentoGeralDosPedidosActionPerformed

    private void jMenuItemAndamentoDasEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAndamentoDasEntregasActionPerformed
            AndamentoDaEntregaG = new AndamentoDaEntregaGUI();
            Desktop.add(AndamentoDaEntregaG);
            AndamentoDaEntregaG.setVisible(true);
    }//GEN-LAST:event_jMenuItemAndamentoDasEntregasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelUsuarioLogado;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCozinha;
    private javax.swing.JMenu jMenuEntregador;
    private javax.swing.JMenuItem jMenuItemAndamentoDaCozinha;
    private javax.swing.JMenuItem jMenuItemAndamentoDasEntregas;
    private javax.swing.JMenuItem jMenuItemAndamentoGeralDosPedidos;
    private javax.swing.JMenuItem jMenuItemCardapios;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEntregadores;
    private javax.swing.JMenuItem jMenuItemFuncionarios;
    private javax.swing.JMenuItem jMenuItemPedidos;
    private javax.swing.JMenuItem jMenuItemRelatorioCardapios;
    private javax.swing.JMenuItem jMenuItemRelatorioClientes;
    private javax.swing.JMenuItem jMenuItemRelatorioEntregadores;
    private javax.swing.JMenuItem jMenuItemRelatorioFuncionarios;
    private javax.swing.JMenuItem jMenuItemRelatorioPedidos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}