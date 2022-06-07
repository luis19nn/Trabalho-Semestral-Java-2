package tpoo2.view;

public class VincularContaView extends javax.swing.JFrame {
    private final ModeloTabelaCliente modelo = new ModeloTabelaCliente();
    
    /*
    *** CONSTRUTOR
    */
    public VincularContaView() {
        initComponents();
        tabelaVincularConta.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabVincularConta = new javax.swing.JPanel();
        selecioneCliente = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        tabelaVincularConta = new javax.swing.JTable();
        selecioneTipoConta = new javax.swing.JLabel();
        cbContas = new javax.swing.JComboBox<>();
        label1VincularConta = new javax.swing.JLabel();
        tLabel1VincularConta = new javax.swing.JTextField();
        label2VincularConta = new javax.swing.JLabel();
        tLabel2VincularConta = new javax.swing.JTextField();
        label3VincularConta = new javax.swing.JLabel();
        tLabel3VincularConta = new javax.swing.JTextField();
        incluirConta = new java.awt.Button();
        bVincularConta = new javax.swing.JButton();
        bManipularConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selecioneCliente.setText("Selecione um cliente:");

        tabelaVincularConta.setModel(modelo);
        scroll1.setViewportView(tabelaVincularConta);

        selecioneTipoConta.setText("Escolha qual será o tipo de conta do cliente selecionado na tabela:");

        cbContas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Conta Corrente", "Conta Investimento" }));

        incluirConta.setBackground(new java.awt.Color(33, 136, 56));
        incluirConta.setForeground(new java.awt.Color(240, 240, 240));
        incluirConta.setLabel("Incluir");

        bVincularConta.setBackground(new java.awt.Color(33, 136, 56));
        bVincularConta.setForeground(new java.awt.Color(240, 240, 240));
        bVincularConta.setText("Cadastrar Cliente");
        bVincularConta.setAutoscrolls(true);
        bVincularConta.setBorder(null);
        bVincularConta.setMaximumSize(new java.awt.Dimension(92, 20));
        bVincularConta.setMinimumSize(new java.awt.Dimension(92, 20));

        bManipularConta.setBackground(new java.awt.Color(224, 168, 0));
        bManipularConta.setForeground(new java.awt.Color(0, 0, 0));
        bManipularConta.setText("Manipular Conta");
        bManipularConta.setBorder(null);

        javax.swing.GroupLayout tabVincularContaLayout = new javax.swing.GroupLayout(tabVincularConta);
        tabVincularConta.setLayout(tabVincularContaLayout);
        tabVincularContaLayout.setHorizontalGroup(
            tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
            .addGroup(tabVincularContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabVincularContaLayout.createSequentialGroup()
                        .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selecioneTipoConta)
                            .addComponent(cbContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabVincularContaLayout.createSequentialGroup()
                                .addComponent(label1VincularConta)
                                .addGap(18, 18, 18)
                                .addComponent(tLabel1VincularConta))
                            .addGroup(tabVincularContaLayout.createSequentialGroup()
                                .addComponent(label2VincularConta)
                                .addGap(18, 18, 18)
                                .addComponent(tLabel2VincularConta))
                            .addGroup(tabVincularContaLayout.createSequentialGroup()
                                .addComponent(label3VincularConta)
                                .addGap(18, 18, 18)
                                .addComponent(tLabel3VincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bManipularConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVincularConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabVincularContaLayout.createSequentialGroup()
                        .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecioneCliente)
                            .addComponent(incluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabVincularContaLayout.setVerticalGroup(
            tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVincularContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecioneCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabVincularContaLayout.createSequentialGroup()
                        .addComponent(selecioneTipoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1VincularConta)
                            .addComponent(tLabel1VincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabVincularContaLayout.createSequentialGroup()
                        .addComponent(bVincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bManipularConta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2VincularConta)
                    .addComponent(tLabel2VincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabVincularContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3VincularConta)
                    .addComponent(tLabel3VincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(incluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabVincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tabVincularConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VincularContaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VincularContaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VincularContaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VincularContaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VincularContaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bManipularConta;
    private javax.swing.JButton bVincularConta;
    private javax.swing.JComboBox<String> cbContas;
    private java.awt.Button incluirConta;
    private javax.swing.JLabel label1VincularConta;
    private javax.swing.JLabel label2VincularConta;
    private javax.swing.JLabel label3VincularConta;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JLabel selecioneCliente;
    private javax.swing.JLabel selecioneTipoConta;
    private javax.swing.JTextField tLabel1VincularConta;
    private javax.swing.JTextField tLabel2VincularConta;
    private javax.swing.JTextField tLabel3VincularConta;
    private javax.swing.JPanel tabVincularConta;
    private javax.swing.JTable tabelaVincularConta;
    // End of variables declaration//GEN-END:variables
}
