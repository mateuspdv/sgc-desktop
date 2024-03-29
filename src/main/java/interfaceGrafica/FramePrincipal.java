/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica;

import gerenciaTarefas.GerenciadorInterfaceGrafica;

public class FramePrincipal extends javax.swing.JFrame {

    private GerenciadorInterfaceGrafica gerenciadorInterfaceGrafica;

    public FramePrincipal(GerenciadorInterfaceGrafica novoGerenciadorInterfaceGrafica) {
        gerenciadorInterfaceGrafica = novoGerenciadorInterfaceGrafica;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCompetencia = new javax.swing.JMenuItem();
        jMenuItemColaborador = new javax.swing.JMenuItem();
        jMenuItemTurma = new javax.swing.JMenuItem();
        jMenuPesquisas = new javax.swing.JMenu();
        jMenuItemPesquisarCompetencia = new javax.swing.JMenuItem();
        jMenuItemPesquisarColaborador = new javax.swing.JMenuItem();
        jMenuItemPesquisarTurma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gerenciador de Competências");

        jMenuCadastros.setText("Cadastros");

        jMenuItemCompetencia.setText("Competência");
        jMenuItemCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCompetenciaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCompetencia);

        jMenuItemColaborador.setText("Colaborador");
        jMenuItemColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColaboradorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemColaborador);

        jMenuItemTurma.setText("Turma");
        jMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTurmaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemTurma);

        jMenuBar1.add(jMenuCadastros);

        jMenuPesquisas.setText("Pesquisas");

        jMenuItemPesquisarCompetencia.setText("Competências");
        jMenuItemPesquisarCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarCompetenciaActionPerformed(evt);
            }
        });
        jMenuPesquisas.add(jMenuItemPesquisarCompetencia);

        jMenuItemPesquisarColaborador.setText("Colaboradores");
        jMenuItemPesquisarColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarColaboradorActionPerformed(evt);
            }
        });
        jMenuPesquisas.add(jMenuItemPesquisarColaborador);

        jMenuItemPesquisarTurma.setText("Turmas");
        jMenuItemPesquisarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarTurmaActionPerformed(evt);
            }
        });
        jMenuPesquisas.add(jMenuItemPesquisarTurma);

        jMenuBar1.add(jMenuPesquisas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCompetenciaActionPerformed
        gerenciadorInterfaceGrafica.abrirCadastroCompetencia();
    }//GEN-LAST:event_jMenuItemCompetenciaActionPerformed

    private void jMenuItemColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColaboradorActionPerformed
        gerenciadorInterfaceGrafica.abrirCadastroColaborador();
    }//GEN-LAST:event_jMenuItemColaboradorActionPerformed

    private void jMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTurmaActionPerformed
        gerenciadorInterfaceGrafica.abrirCadastroTurma();
    }//GEN-LAST:event_jMenuItemTurmaActionPerformed

    private void jMenuItemPesquisarCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarCompetenciaActionPerformed
        gerenciadorInterfaceGrafica.abrirPesquisaCompetencia();
    }//GEN-LAST:event_jMenuItemPesquisarCompetenciaActionPerformed

    private void jMenuItemPesquisarColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarColaboradorActionPerformed
        gerenciadorInterfaceGrafica.abrirPesquisaColaborador();
    }//GEN-LAST:event_jMenuItemPesquisarColaboradorActionPerformed

    private void jMenuItemPesquisarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarTurmaActionPerformed
        gerenciadorInterfaceGrafica.abrirPesquisaTurma();
    }//GEN-LAST:event_jMenuItemPesquisarTurmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemColaborador;
    private javax.swing.JMenuItem jMenuItemCompetencia;
    private javax.swing.JMenuItem jMenuItemPesquisarColaborador;
    private javax.swing.JMenuItem jMenuItemPesquisarCompetencia;
    private javax.swing.JMenuItem jMenuItemPesquisarTurma;
    private javax.swing.JMenuItem jMenuItemTurma;
    private javax.swing.JMenu jMenuPesquisas;
    // End of variables declaration//GEN-END:variables
}
