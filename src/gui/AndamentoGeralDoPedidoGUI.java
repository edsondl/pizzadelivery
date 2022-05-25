/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import utilitarios.VerificadoresECorretores;
import beans.ClienteBeans;
import beans.PedidoBeans;
import controller.ClienteController;
import controller.PedidoController;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import beans.FuncionarioBeans;
import beans.EntregadorBeans;
import controller.FuncionarioController;
import controller.EntregadorController;
/**
 *
 * @author linux
 */
public class AndamentoGeralDoPedidoGUI extends javax.swing.JInternalFrame {

     MaskFormatter FormatoTelefone;
    ClienteBeans ClienteB;
    ClienteController ClienteC; 
    List<String> Lista;
    DefaultTableModel Modelo;
    List<String> ListaDeItens;
    List<String> ListaDeClientes;
    DecimalFormat FormatoDecimal;
    PedidoController PedidoC;
    PedidoBeans PedidoB;
    FuncionarioBeans FuncionarioB;
    EntregadorBeans EntregadorB;
    Date DataAtual;
    SimpleDateFormat FormatoData, FormatoHora;
    
    String CodigoFuncionario;
    String CodigoEntregador;
    
    /**
     * Creates new form AndamentoGeralDoPedidoGUI
     */
    public AndamentoGeralDoPedidoGUI() {
        initComponents();
        
        FormatoDecimal = new DecimalFormat("0.00");
        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();
        Lista = new ArrayList<>();
        Modelo = (DefaultTableModel)TabelaAndamentoGeralDoPedido.getModel();
        PedidoC = new PedidoController();
        PedidoB = new PedidoBeans();
        FormatoDecimal = new DecimalFormat("0.00");
        FormatoData = new SimpleDateFormat("yyyy-MM-dd");
        FormatoHora = new SimpleDateFormat("HH:mm:ss");
        
        ListaDeClientes = new ArrayList<>();
        ListaDeItens = new ArrayList<>();
        
        TabelaAndamentoGeralDoPedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.CodigoFuncionario = CodigoFuncionario;
        this.CodigoEntregador = CodigoEntregador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPesquisarAndamentoGeralDoPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAndamentoGeralDoPedido = new javax.swing.JTable();
        jButtonFecharAndamentoGeralDoPedido = new javax.swing.JButton();
        jButtonLiberarAndamentoGeralDoPedido = new javax.swing.JButton();

        setClosable(true);
        setTitle("Andamento Geral do Pedido");

        jButtonPesquisarAndamentoGeralDoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonPesquisarAndamentoGeralDoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAndamentoGeralDoPedidoActionPerformed(evt);
            }
        });

        TabelaAndamentoGeralDoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Hora", "Status", "Total", "Cliente", "Funcionário", "Entregador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaAndamentoGeralDoPedido.getTableHeader().setReorderingAllowed(false);
        TabelaAndamentoGeralDoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaAndamentoGeralDoPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaAndamentoGeralDoPedido);
        if (TabelaAndamentoGeralDoPedido.getColumnModel().getColumnCount() > 0) {
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(1).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(2).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(3).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(4).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(5).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(6).setResizable(false);
            TabelaAndamentoGeralDoPedido.getColumnModel().getColumn(7).setResizable(false);
        }

        jButtonFecharAndamentoGeralDoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        jButtonFecharAndamentoGeralDoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAndamentoGeralDoPedidoActionPerformed(evt);
            }
        });

        jButtonLiberarAndamentoGeralDoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/liberarParaEditar.png"))); // NOI18N
        jButtonLiberarAndamentoGeralDoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLiberarAndamentoGeralDoPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonLiberarAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFecharAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPesquisarAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonPesquisarAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLiberarAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFecharAndamentoGeralDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaAndamentoGeralDoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaAndamentoGeralDoPedidoMouseClicked
        PedidoB = PedidoC.controlePreenchimento(Integer.parseInt(Modelo.getValueAt(TabelaAndamentoGeralDoPedido.getSelectedRow(), 0).toString()));

    }//GEN-LAST:event_TabelaAndamentoGeralDoPedidoMouseClicked

    private void jButtonFecharAndamentoGeralDoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAndamentoGeralDoPedidoActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharAndamentoGeralDoPedidoActionPerformed

    private void jButtonLiberarAndamentoGeralDoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLiberarAndamentoGeralDoPedidoActionPerformed
        PedidoC.editarDadosPedidosAEntregar(PedidoB);
        Modelo.setNumRows(0);

    }//GEN-LAST:event_jButtonLiberarAndamentoGeralDoPedidoActionPerformed

    private void jButtonPesquisarAndamentoGeralDoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAndamentoGeralDoPedidoActionPerformed
        Modelo.setNumRows(0);
        PedidoC.controlePesquisa(Modelo);
    }//GEN-LAST:event_jButtonPesquisarAndamentoGeralDoPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaAndamentoGeralDoPedido;
    private javax.swing.JButton jButtonFecharAndamentoGeralDoPedido;
    private javax.swing.JButton jButtonLiberarAndamentoGeralDoPedido;
    private javax.swing.JButton jButtonPesquisarAndamentoGeralDoPedido;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}