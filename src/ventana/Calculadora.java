
package ventana;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Calculadora extends javax.swing.JFrame {
 private String cadenaNumeros = " ";
 private String sumar,restar,multiplicar,dividir,raiz;
 private double numero1,resultado;
 private String operacion = "nula";
 private boolean activado = true;
 private boolean punto = true;
 
    public Calculadora() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/cal.png")).getImage());
        setSize(431, 600);
        setLocationRelativeTo(null);
    }
  
    
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel1 = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNumeros = new javax.swing.JLabel();
        botonClear = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonmultiplicar = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonMasMenos = new javax.swing.JButton();
        BoronCero = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenu1 = new javax.swing.JMenu();
        menuCalculadora = new javax.swing.JMenuItem();
        menuConversor = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setFont(new java.awt.Font("Adobe Devanagari", 1, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 600));

        panel1.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNumeros.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel1.add(etiquetaNumeros, gridBagConstraints);

        botonClear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonClear.setText("C");
        botonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonClear, gridBagConstraints);

        botonRaiz.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonRaiz, gridBagConstraints);

        botonDividir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonDividir.setText("÷");
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonDividir, gridBagConstraints);

        botonBorrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonBorrar.setText("←");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonBorrar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton9, gridBagConstraints);

        botonmultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonmultiplicar.setText("x");
        botonmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonmultiplicar, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton6, gridBagConstraints);

        botonRestar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonRestar, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(boton3, gridBagConstraints);

        botonSumar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonSumar, gridBagConstraints);

        botonMasMenos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonMasMenos.setText("+-");
        botonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonMasMenos, gridBagConstraints);

        BoronCero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BoronCero.setText("0");
        BoronCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoronCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(BoronCero, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonPunto, gridBagConstraints);

        botonIgual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonIgual, gridBagConstraints);

        barraMenu1.setText("Usos");
        barraMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        menuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora.png"))); // NOI18N
        menuCalculadora.setText("Calculadora Estandar");
        menuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculadoraActionPerformed(evt);
            }
        });
        barraMenu1.add(menuCalculadora);

        menuConversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/convertidor.png"))); // NOI18N
        menuConversor.setText("Conversor de Dinero");
        menuConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConversorActionPerformed(evt);
            }
        });
        barraMenu1.add(menuConversor);
        barraMenu1.add(separador);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X_opt.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        barraMenu1.add(Salir);
        barraMenu1.add(jSeparator2);

        jMenuBar1.add(barraMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConversorActionPerformed
        Divisas conversor = new Divisas();
        conversor.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_menuConversorActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void botonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClearActionPerformed
      etiquetaMuestra.setText("");
      etiquetaNumeros.setText("0");
      cadenaNumeros=" ";
      operacion = "nula";
      punto = true;
        
    }//GEN-LAST:event_botonClearActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
       
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="9";
}
        else{
            cadenaNumeros += "9"; 
        }
       
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed

        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="6";
}
        else{
            cadenaNumeros += "6"; 
        }
      
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton6ActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if (activado ==true){
             numero1= Double.parseDouble(cadenaNumeros);
       
       etiquetaMuestra.setText(cadenaNumeros +" - ");
       cadenaNumeros="";
       operacion ="restar";
       
       punto = true;
       activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="2";
}
        else{
            cadenaNumeros += "2"; 
        }
       
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton2ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
       
        if (activado ==true){
             numero1= Double.parseDouble(cadenaNumeros);
       
       etiquetaMuestra.setText(cadenaNumeros +" + ");
       cadenaNumeros="";
       operacion ="sumar";
        
       punto = true;
       activado = false;
        }
       
      
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
         if (punto==true){
             if (cadenaNumeros==""){
             
             cadenaNumeros="0.";
       
        }
        else {
        cadenaNumeros += ".";
       
        }
              etiquetaNumeros.setText(cadenaNumeros);
        }
   
      punto = false;
      
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="1";
}
        else{
            cadenaNumeros += "1"; 
        }
       
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
     
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="3";
}
        else{
            cadenaNumeros += "3"; 
        }
       
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="4";
}
        else{
            cadenaNumeros += "4"; 
        }
        
        
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="5";
}
        else{
            cadenaNumeros += "5"; 
        }

       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="7";
}
        else{
            cadenaNumeros += "7"; 
        }
        
        
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
         
        if( etiquetaNumeros.getText() == "0"){
    cadenaNumeros="8";
}
        else{
            cadenaNumeros += "8"; 
        }
        
       etiquetaNumeros.setText(cadenaNumeros);
       activado = true;
    }//GEN-LAST:event_boton8ActionPerformed

    private void BoronCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoronCeroActionPerformed
      
        if(cadenaNumeros!= ""){
            cadenaNumeros += "0";
       etiquetaNumeros.setText(cadenaNumeros);  
        }
        
      activado = true;
    }//GEN-LAST:event_BoronCeroActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
      double numero2;
        if(operacion.equals("nula")){
          etiquetaNumeros.setText(cadenaNumeros);
       }
       else if(operacion.equals("sumar")){
               numero2 = Double.parseDouble(cadenaNumeros);
               resultado = numero1+numero2;
               etiquetaNumeros.setText(String.format("%.2f", resultado));
               
               cadenaNumeros= String.valueOf(resultado);
               operacion = "nula";
               }
       else if (operacion.equals("restar")){
           numero2 = Double.parseDouble(cadenaNumeros);
               resultado = numero1-numero2;
               etiquetaNumeros.setText(String.format("%.2f", resultado));
               
               cadenaNumeros= String.valueOf(resultado);
               operacion = "nula";
       }
        
       else if(operacion.equals("multiplicar")){
           numero2 = Double.parseDouble(cadenaNumeros);
               resultado = numero1 *numero2;
               etiquetaNumeros.setText(String.format("%.2f", resultado));
               
               cadenaNumeros= String.valueOf(resultado);
               operacion = "nula";
       }
       else if(operacion.equals("dividir")){
           numero2= Double.parseDouble(cadenaNumeros);
           resultado =numero1/numero2;
           etiquetaNumeros.setText(String.format("%.2f",resultado));
           cadenaNumeros=String.valueOf(resultado);
           operacion ="nula";
       }
       else if( operacion.equals("raiz")){
           resultado=Math.sqrt(numero1);
           etiquetaNumeros.setText(String.format("%.2f",resultado));
           cadenaNumeros=String.valueOf(resultado);
           
          operacion ="nula";
       }
         etiquetaMuestra.setText("");
         activado = true;
         
        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiplicarActionPerformed
       if (activado ==true){
             numero1= Double.parseDouble(cadenaNumeros);
       
       etiquetaMuestra.setText(cadenaNumeros +" x ");
       cadenaNumeros="";
       operacion ="multiplicar";
        etiquetaNumeros.setText(cadenaNumeros);
        punto=true;
       activado = false;
        }
    }//GEN-LAST:event_botonmultiplicarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
       if (activado==true){
           numero1=Double.parseDouble(cadenaNumeros);
           etiquetaMuestra.setText(cadenaNumeros+"÷");
           cadenaNumeros="";
           operacion="dividir";
           activado=false;
           
       }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        if(activado==true){
            numero1=Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros+" √ ");
            cadenaNumeros="";
            operacion="raiz";
            punto=true;
            punto=true;
            activado=false;
        }
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasMenosActionPerformed
       if(cadenaNumeros.charAt(0)!='-'){
           cadenaNumeros = "-"+cadenaNumeros;
       }
       else{
           cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
       }
       etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonMasMenosActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
       int tamano = cadenaNumeros.length();
        if(tamano>0){
            if(tamano == 1 ){
                cadenaNumeros="0";
            }
            else{
                 cadenaNumeros= cadenaNumeros.substring(0,cadenaNumeros.length()-1);
            }
               
            }
            etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void menuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCalculadoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
             try {
         UIManager.setLookAndFeel("com.jtatto.plaf.texture.  MintLookAndFeel");
     } catch (ClassNotFoundException ex) {
         //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
     } catch (UnsupportedLookAndFeelException ex) {
         //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
     }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
        

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoronCero;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu barraMenu1;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonClear;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMasMenos;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton botonmultiplicar;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuCalculadora;
    private javax.swing.JMenuItem menuConversor;
    private javax.swing.JPanel panel1;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
