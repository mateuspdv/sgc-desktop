package interfaceGrafica;

import dominio.Colaborador;
import gerenciaTarefas.GerenciadorInterfaceGrafica;
import gerenciaTarefas.Util;
import java.awt.Cursor;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DialogPesquisarColaborador extends javax.swing.JDialog {

    private GerenciadorInterfaceGrafica gerenciadorInterfaceGrafica;

    private Colaborador colaboradorSelecionado;

    public DialogPesquisarColaborador(java.awt.Frame parent, boolean modal, GerenciadorInterfaceGrafica gerenciador) {
        initComponents();
        gerenciadorInterfaceGrafica = gerenciador;
        this.colaboradorSelecionado = null;
    }

    public Colaborador getColaboradorSelecionado() {
        return colaboradorSelecionado;
    }

    public void setColaboradorSelecionado(Colaborador colaboradorSelecionado) {
        this.colaboradorSelecionado = colaboradorSelecionado;
    }

    public void excluirLinhasTabela() {
        ((DefaultTableModel) this.jTableTabelaPesquisa.getModel()).setRowCount(0);
    }

    public void converterFormatoData() throws ParseException {
        int quantidadeLinhas = this.jTableTabelaPesquisa.getRowCount();

        for (int i = 0; i < quantidadeLinhas; i++) {
            String dataConvertida;
            dataConvertida = Util.dateToStr((Date) this.jTableTabelaPesquisa.getValueAt(i, 2));
            this.jTableTabelaPesquisa.setValueAt(dataConvertida, i, 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuOpcoesTabela = new javax.swing.JPopupMenu();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jLabelTitulo = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox<>();
        jTextFieldTextoPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPaneTabelaPesquisa = new javax.swing.JScrollPane();
        jTableTabelaPesquisa = new javax.swing.JTable();

        jMenuItemEditar.setText("Editar");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        jPopupMenuOpcoesTabela.add(jMenuItemEditar);

        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jPopupMenuOpcoesTabela.add(jMenuItemExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Colaborador");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Pesquisar Colaborador");

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Senioridade" }));

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonPesquisarFocusGained(evt);
            }
        });
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableTabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Data de Nascimento", "Senioridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaPesquisa.setComponentPopupMenu(jPopupMenuOpcoesTabela);
        jScrollPaneTabelaPesquisa.setViewportView(jTableTabelaPesquisa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jScrollPaneTabelaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPaneTabelaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        List<Colaborador> colaboradores;
        try {
            if (this.jTextFieldTextoPesquisa.getText().equals("")) {
                colaboradores = this.gerenciadorInterfaceGrafica.getGerenciadorDominio().listarColaboradores();
            } else {
                colaboradores = this.gerenciadorInterfaceGrafica.getGerenciadorDominio()
                        .pesquisarColaborador(this.jTextFieldTextoPesquisa.getText(),
                                this.jComboBoxTipoPesquisa.getSelectedIndex());
            }

            this.excluirLinhasTabela();

            for (Colaborador colaborador : colaboradores) {
                ((DefaultTableModel) this.jTableTabelaPesquisa.getModel()).addRow(colaborador.toArray());
            }

            this.converterFormatoData();
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar competência. Erro: " + ex,
                    "Erro ao realizar consulta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonPesquisarFocusGained
        this.jButtonPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonPesquisarFocusGained

    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed
        int linha;
        linha = this.jTableTabelaPesquisa.getSelectedRow();
        if (linha >= 0) {
            this.colaboradorSelecionado = (Colaborador) this.jTableTabelaPesquisa.getValueAt(linha, 0);
            this.gerenciadorInterfaceGrafica.abrirCadastroColaborador();
            this.setVisible(false);
            return;
        }

        JOptionPane.showMessageDialog(this, "Selecione um colaborador !");
    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.excluirLinhasTabela();
        this.jTextFieldTextoPesquisa.setText("");
        this.colaboradorSelecionado = null;
    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        this.setColaboradorSelecionado(null);
    }//GEN-LAST:event_formComponentHidden

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        int linha;
        linha = this.jTableTabelaPesquisa.getSelectedRow();

        if (linha >= 0) {
            Colaborador colaborador = (Colaborador) this.jTableTabelaPesquisa.getValueAt(linha, 0);
            try {
                this.gerenciadorInterfaceGrafica.getGerenciadorDominio().excluirColaborador(colaborador);
                ((DefaultTableModel) this.jTableTabelaPesquisa.getModel()).removeRow(linha);
            } catch (ClassNotFoundException | SQLException | PersistenceException ex) {
                JOptionPane.showMessageDialog(this, "Verifique se o colaborador possui competências"
                        + "vinculadas. Erro: " + ex, "Erro no processo de exclusão", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(this, "Colaborador removido com sucesso !");
            return;
        }

        JOptionPane.showMessageDialog(this, "Selecione um colaborador");
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JPopupMenu jPopupMenuOpcoesTabela;
    private javax.swing.JScrollPane jScrollPaneTabelaPesquisa;
    private javax.swing.JTable jTableTabelaPesquisa;
    private javax.swing.JTextField jTextFieldTextoPesquisa;
    // End of variables declaration//GEN-END:variables
}
