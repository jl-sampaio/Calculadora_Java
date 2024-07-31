/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

/**
 *
 * @author João Lucas
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    double valor1, valor2;
    String operacao;
    public TelaCalculadora() {
        initComponents();
        lblMemoriaCalculo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNum = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAc = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnApaga = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        lblMemoriaCalculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        lblNum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblNum.setText("0,00");

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btnAc.setText("AC");
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });
        jPanel1.add(btnAc);

        btnPotencia.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        btnPotencia.setText("<html>x<sup>2<sup><html>");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotencia);

        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentagem);

        btnApaga.setText("<<<");
        btnApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaActionPerformed(evt);
            }
        });
        jPanel1.add(btnApaga);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiv);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btnMulti.setText("x");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMulti);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSoma);

        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVirgula);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);

        btnResultado.setBackground(new java.awt.Color(51, 204, 255));
        btnResultado.setForeground(new java.awt.Color(102, 102, 102));
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado);

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSub);

        lblMemoriaCalculo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblMemoriaCalculo.setForeground(new java.awt.Color(153, 153, 153));
        lblMemoriaCalculo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(lblNum)
                    .addComponent(lblMemoriaCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblMemoriaCalculo)
                .addGap(18, 18, 18)
                .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        digitacao("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        digitacao("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        digitacao("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        digitacao("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        digitacao("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        digitacao("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        digitacao("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        digitacao("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        digitacao("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        digitacao("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        digitacao(",");
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        
        lblNum.setText("0,00");
        lblMemoriaCalculo.setVisible(false);
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaActionPerformed
        
        if (lblNum.getText().equals("0,00")){
                   
        }else{
            lblNum.setText(lblNum.getText().substring(0, lblNum.getText().length() - 1));
            if(lblNum.getText().length() == 0){
                lblNum.setText("0,00");
            }    
        }
    }//GEN-LAST:event_btnApagaActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
       
       valor1 = Double.parseDouble(lblNum.getText().replace(",", "."));
       lblMemoriaCalculo.setText(Double.toString(valor1).concat("+"));
       lblMemoriaCalculo.setVisible(true);
       lblNum.setText("0,00");
       operacao = "soma";
       
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        
        valor2 = Double.parseDouble(lblNum.getText().replace(",", "."));
        if(operacao.equals("soma")){
           lblMemoriaCalculo.setText(Double.toString(valor1).concat("+").concat(Double.toString(valor2)));
           double total = valor1 + valor2;
           lblNum.setText(Double.toString(total).replace(".", ",")); 
        }else if(operacao.equals("subtracao")){
           lblMemoriaCalculo.setText(Double.toString(valor1).concat("-").concat(Double.toString(valor2)));
           double total = valor1 - valor2;
           lblNum.setText(Double.toString(total).replace(".", ","));
        }else if(operacao.equals("multiplicacao")){
            lblMemoriaCalculo.setText(Double.toString(valor1).concat("*").concat(Double.toString(valor2)));
           double total = valor1 * valor2;
           lblNum.setText(Double.toString(total).replace(".", ","));
        }else if (operacao.equals("divisao")){
            lblMemoriaCalculo.setText(Double.toString(valor1).concat("/").concat(Double.toString(valor2)));
            double total = valor1 / valor2;
           lblNum.setText(Double.toString(total).replace(".", ","));
        } 
        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
       
       valor1 = Double.parseDouble(lblNum.getText().replace(",", "."));
       lblMemoriaCalculo.setText(Double.toString(valor1).concat("-"));
       lblMemoriaCalculo.setVisible(true);
       lblNum.setText("0,00");
       operacao = "subtracao";
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
       
       valor1 = Double.parseDouble(lblNum.getText().replace(",", "."));
       lblMemoriaCalculo.setText(Double.toString(valor1).concat("*"));
       lblMemoriaCalculo.setVisible(true);
       lblNum.setText("0,00");
       operacao = "multiplicacao";
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
       
       valor1 = Double.parseDouble(lblNum.getText().replace(",", "."));
       lblMemoriaCalculo.setText(Double.toString(valor1).concat("/"));
       lblMemoriaCalculo.setVisible(true);
       lblNum.setText("0,00");
       operacao = "divisao";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        
        double porcentagem = Double.parseDouble(lblNum.getText().replace(",", ".")) * 0.01;
        lblNum.setText(Double.toString(porcentagem));
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        
        valor1 = Double.parseDouble(lblNum.getText().replace(",", "."));
        double total = valor1 * valor1;
        lblNum.setText(Double.toString(total).replace(".", ","));
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void digitacao (String numero){
        
        if(numero.equals(",") && lblNum.getText().contains(",")){
                  
        }else if(lblNum.getText().equals("0,00") && !numero.contains(",")){
                lblNum.setText(numero);
            
        }else{
            lblNum.setText(lblNum.getText().concat(numero));
        }      
    }
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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnApaga;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMemoriaCalculo;
    private javax.swing.JTextField lblNum;
    // End of variables declaration//GEN-END:variables
}
