/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica_04;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;


public class interfaz_mixta extends javax.swing.JFrame {
    public interfaz_mixta() {
        initComponents();
        check.setVisible(false);
        check1.setVisible(false);
        confirmacion.setVisible(false);
        confirmacion1.setVisible(false);
        buttonGroup1.add(this.opcion1);
        buttonGroup1.add(this.opcion2);
        buttonGroup1.add(this.opcion3);
        buttonGroup1.add(this.opcion4);
        buttonGroup1.add(this.opcion5);
        buttonGroup1.add(this.opcion6);

        buttonGroup2.add(this.opcion1e);
        buttonGroup2.add(this.opcion2e);
        buttonGroup2.add(this.opcion3e);
        buttonGroup2.add(this.opcion4e);
        buttonGroup2.add(this.opcion5e);
        buttonGroup2.add(this.opcion6e);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JCheckBox();
        opcion5 = new javax.swing.JCheckBox();
        opcion6 = new javax.swing.JCheckBox();
        correo = new javax.swing.JLabel();
        campo_abajo = new javax.swing.JTextField();
        campo_arriba = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        spinner = new javax.swing.JSpinner();
        boton = new javax.swing.JToggleButton();
        slider = new javax.swing.JSlider();
        opcion6e = new javax.swing.JCheckBox();
        correo1 = new javax.swing.JLabel();
        campo_abajo1 = new javax.swing.JTextField();
        campo_arriba1 = new javax.swing.JTextField();
        combobox1 = new javax.swing.JComboBox<>();
        spinner1 = new javax.swing.JSpinner();
        slider1 = new javax.swing.JSlider();
        opcion1e = new javax.swing.JRadioButton();
        opcion2e = new javax.swing.JRadioButton();
        opcion3e = new javax.swing.JRadioButton();
        opcion4e = new javax.swing.JCheckBox();
        opcion5e = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        boton1 = new javax.swing.JToggleButton();
        check = new javax.swing.JLabel();
        confirmacion = new javax.swing.JLabel();
        check1 = new javax.swing.JLabel();
        confirmacion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcion1.setText("Opcion 1");
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setText("Opcion 2 ");
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setText("Opcion 3");
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        opcion4.setText("Opcion 4");
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        opcion5.setText("Opcion 5");
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });

        opcion6.setText("Opcion 6");
        opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ActionPerformed(evt);
            }
        });

        correo.setText("correo");

        campo_abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_abajoActionPerformed(evt);
            }
        });
        campo_abajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_abajoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_abajoKeyReleased(evt);
            }
        });

        campo_arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_arribaActionPerformed(evt);
            }
        });
        campo_arriba.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_arribaKeyPressed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

        boton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gg\\OneDrive\\Documentos\\GitHub\\pr-ctica-2-4-elementos-interfaz-mixta-lordyhg12\\SOL\\PRACTICA_04\\img\\b_off.png")); // NOI18N
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        opcion6e.setText("Opcion 6");
        opcion6e.setEnabled(false);

        correo1.setText("correo");
        correo1.setEnabled(false);

        campo_abajo1.setEnabled(false);
        campo_abajo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_abajo1KeyPressed(evt);
            }
        });

        campo_arriba1.setEnabled(false);
        campo_arriba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_arriba1ActionPerformed(evt);
            }
        });

        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox1.setEnabled(false);

        spinner1.setEnabled(false);

        slider1.setEnabled(false);

        opcion1e.setText("Opcion 1");
        opcion1e.setEnabled(false);
        opcion1e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1eActionPerformed(evt);
            }
        });

        opcion2e.setText("Opcion 2 ");
        opcion2e.setEnabled(false);

        opcion3e.setText("Opcion 3");
        opcion3e.setEnabled(false);

        opcion4e.setText("Opcion 4");
        opcion4e.setEnabled(false);

        opcion5e.setText("Opcion 5");
        opcion5e.setEnabled(false);

        boton1.setEnabled(false);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        confirmacion.setText("mensaje en timepo real ");

        check1.setEnabled(false);

        confirmacion1.setText("mensaje en timepo real ");
        confirmacion1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcion1e)
                                    .addComponent(opcion2e)
                                    .addComponent(opcion3e))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcion6e)
                                    .addComponent(opcion4e)
                                    .addComponent(opcion5e))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campo_arriba1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combobox1, 0, 77, Short.MAX_VALUE)
                                            .addComponent(spinner1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcion1)
                                    .addComponent(opcion2)
                                    .addComponent(opcion3))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcion5)
                                    .addComponent(opcion6)
                                    .addComponent(opcion4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spinner)
                                            .addComponent(combobox, 0, 77, Short.MAX_VALUE))
                                        .addGap(149, 149, 149)
                                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campo_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(correo1)
                                        .addGap(28, 28, 28)
                                        .addComponent(campo_abajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(check1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(correo)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(confirmacion)
                                            .addComponent(confirmacion1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campo_abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(opcion4)
                    .addComponent(campo_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion2)
                            .addComponent(opcion5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion6)
                            .addComponent(opcion3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_abajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1e)
                    .addComponent(opcion4e)
                    .addComponent(campo_arriba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion2e)
                            .addComponent(opcion5e))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion6e)
                            .addComponent(opcion3e)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correo1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_abajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(check1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmacion1)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
    this.boton1.setSelected(boton.isSelected());
          ImageIcon imagen_a =new ImageIcon ("./img/b_on.png");
          ImageIcon imagen_d =new ImageIcon ("./img/b_off.png");
          
          if (boton.isSelected()){
              boton.setIcon(imagen_a);
              boton1.setIcon(imagen_a);
          }else{
              boton.setIcon(imagen_d);
              boton1.setIcon(imagen_d);
          }
       
        
    }//GEN-LAST:event_botonActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
   this.opcion1e.setSelected(this.opcion1.isSelected());    
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion1eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1eActionPerformed
            
    }//GEN-LAST:event_opcion1eActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        this.opcion2e.setSelected(this.opcion2.isSelected());
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        this.opcion3e.setSelected(this.opcion3.isSelected());
    }//GEN-LAST:event_opcion3ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
       this.opcion4e.setSelected(this.opcion4.isSelected());
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
        this.opcion5e.setSelected(this.opcion5.isSelected());
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
       this.opcion6e.setSelected(this.opcion6.isSelected());
    }//GEN-LAST:event_opcion6ActionPerformed

    private void campo_arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_arribaActionPerformed
     
    }//GEN-LAST:event_campo_arribaActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        this.combobox1.setSelectedIndex(this.combobox.getSelectedIndex());
    }//GEN-LAST:event_comboboxActionPerformed

    private void campo_arriba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_arriba1ActionPerformed
      
    }//GEN-LAST:event_campo_arriba1ActionPerformed

    private void campo_arribaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_arribaKeyPressed
      
        String alreves ="";
        
        for (int i = campo_arriba.getText().length()-1 ; i >=0 ; i--) {
            
            alreves= alreves +campo_arriba.getText().charAt(i);
            
        }
        this.campo_arriba1.setText(alreves);
    }//GEN-LAST:event_campo_arribaKeyPressed

    private void campo_abajo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_abajo1KeyPressed
        
    }//GEN-LAST:event_campo_abajo1KeyPressed

    private void campo_abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_abajoActionPerformed
            
    }//GEN-LAST:event_campo_abajoActionPerformed

    private void campo_abajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_abajoKeyPressed
         this.campo_abajo1.setText(this.campo_abajo.getText());
    }//GEN-LAST:event_campo_abajoKeyPressed

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        this.spinner1.setValue((Integer)this.spinner.getValue());
    }//GEN-LAST:event_spinnerStateChanged

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
      this.slider1.setValue(this.slider.getValue());
    }//GEN-LAST:event_sliderStateChanged

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
       
    }//GEN-LAST:event_boton1ActionPerformed

    private void campo_abajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_abajoKeyReleased
       
        this.campo_abajo1.setText(campo_abajo.getText());

       
        ImageIcon cruzcd = new ImageIcon("./img/error.jpg");
        ImageIcon checkcd = new ImageIcon("./img/check.png");

      
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{3,4}$";
      
        Border check_verde = BorderFactory.createLineBorder(Color.green, 1);
        Border cruz_rojo = BorderFactory.createLineBorder(Color.ORANGE, 1);

      
        if (!campo_abajo.getText().matches(regex)) {
            campo_abajo.setBorder(cruz_rojo);
            Imagen_visible();
            check.setIcon(cruzcd);
            check1.setIcon(check.getIcon());

            Texto_visible();
            confirmacion.setText("*direccion de correo invalida");
            confirmacion1.setText(confirmacion.getText());

        } else {
            campo_abajo.setBorder(check_verde);
            Imagen_visible();
            check.setIcon(checkcd);
            check1.setIcon(check.getIcon());

            Texto_visible();
            confirmacion.setText("Correo valido");
            confirmacion1.setText(confirmacion.getText());
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_campo_abajoKeyReleased
 private void Texto_visible() {
    confirmacion.setVisible(true);
    confirmacion1.setVisible(true);
}

    private void Imagen_visible() {
    check.setVisible(true);
    check1.setVisible(true);
}
    
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_mixta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton boton;
    private javax.swing.JToggleButton boton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campo_abajo;
    private javax.swing.JTextField campo_abajo1;
    private javax.swing.JTextField campo_arriba;
    private javax.swing.JTextField campo_arriba1;
    private javax.swing.JLabel check;
    private javax.swing.JLabel check1;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JLabel confirmacion;
    private javax.swing.JLabel confirmacion1;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion1e;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion2e;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion3e;
    private javax.swing.JCheckBox opcion4;
    private javax.swing.JCheckBox opcion4e;
    private javax.swing.JCheckBox opcion5;
    private javax.swing.JCheckBox opcion5e;
    private javax.swing.JCheckBox opcion6;
    private javax.swing.JCheckBox opcion6e;
    private javax.swing.JSlider slider;
    private javax.swing.JSlider slider1;
    private javax.swing.JSpinner spinner;
    private javax.swing.JSpinner spinner1;
    // End of variables declaration//GEN-END:variables
}
