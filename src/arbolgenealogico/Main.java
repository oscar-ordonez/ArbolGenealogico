
package arbolgenealogico;

import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {
   
    public Main() {
        initComponents();
        this.pack();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Opciones_Agregar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        nodos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nombre_hijo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel1.setText("Padre del hijo");

        jLabel2.setText("Nombre del hijo");

        jButton2.setText("Aplicar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Agregar Hijo");

        javax.swing.GroupLayout Opciones_AgregarLayout = new javax.swing.GroupLayout(Opciones_Agregar.getContentPane());
        Opciones_Agregar.getContentPane().setLayout(Opciones_AgregarLayout);
        Opciones_AgregarLayout.setHorizontalGroup(
            Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones_AgregarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Opciones_AgregarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombre_hijo))
                    .addGroup(Opciones_AgregarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nodos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opciones_AgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opciones_AgregarLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Opciones_AgregarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91))))
        );
        Opciones_AgregarLayout.setVerticalGroup(
            Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opciones_AgregarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Opciones_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre_hijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.add(Panel);
        Panel.setBounds(0, 0, 1360, 620);

        jMenu4.setText("File");

        jMenuItem7.setText("Imprimir");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Exit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(691, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(620, 620, 620))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Print imprimir = new Print (Panel);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(contador ==1){
            try {
                String dato = JOptionPane.showInputDialog("Nombre del padre: ");
                familia.insert(dato, "0");
                nodos.addItem(dato);
                contador++;
                Opciones_Agregar.setLocationRelativeTo(this);
                Opciones_Agregar.pack();
                Opciones_Agregar.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);
            }
        } else{
            Opciones_Agregar.setLocationRelativeTo(this);
            Opciones_Agregar.pack();
            Opciones_Agregar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        familia.insert(nombre_hijo.getText(), nodos.getSelectedItem().toString());
        nodos.addItem(nombre_hijo.getText());
        Opciones_Agregar.setVisible(false);
        nombre_hijo.setText("");
        nodos.setSelectedIndex(0);
        familia.PintarArbol(familia);
        concatenar = familia.getCabeza()+" }";
        CrearTexto();
        PintarArbol();
    }//GEN-LAST:event_jButton2MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int response = JOptionPane.showConfirmDialog(null, "Desea guardar?", "Confirmacion",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                JFileChooser jfc = new JFileChooser();
                FileFilter filtro = new FileNameExtensionFilter("Imagen (png)", "png");
                FileFilter filtro4 = new FileNameExtensionFilter("Imagen (jpg)", "jpg");
                FileFilter filtro5 = new FileNameExtensionFilter("Imagen (jpeg)", "jpeg");
                FileFilter filtro6 = new FileNameExtensionFilter("Imagen (gif)", "gif");
                jfc.addChoosableFileFilter(filtro);
                jfc.addChoosableFileFilter(filtro6);
                jfc.addChoosableFileFilter(filtro4);
                jfc.addChoosableFileFilter(filtro5);
                int seleccion = jfc.showSaveDialog(this);
                if (jfc.getFileFilter().getDescription().equalsIgnoreCase("Imagen (jpg)")) {
                    if (jfc.getSelectedFile().exists()) {
                        try {
                            int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro que desea reemplazar la imagen?");
                            if (respuesta == JOptionPane.OK_OPTION) {
                                jfc.getSelectedFile().delete();
                                BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                                Graphics2D g = bi.createGraphics();
                                Panel.paint(g);
                                File t = new File(jfc.getSelectedFile().getPath() + ".jpg");
                                ImageIO.write(bi, "jpg", t);//
                            }
                        } catch (Exception ex) {
                        }
                    } else {
                        try {
                            BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D g = bi.createGraphics();
                            Panel.paint(g);
                            File t = new File(jfc.getSelectedFile().getPath() + ".jpg");
                            ImageIO.write(bi, "jpg", t);//
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                } else if (jfc.getFileFilter().getDescription().equalsIgnoreCase("Imagen (jpeg)")) {
                    if (jfc.getSelectedFile().exists()) {
                        try {
                            int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro que desea reemplazar la imagen?");
                            if (respuesta == JOptionPane.OK_OPTION) {
                                jfc.getSelectedFile().delete();
                                BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                                Graphics2D g = bi.createGraphics();
                                Panel.paint(g);
                                File t = new File(jfc.getSelectedFile().getPath() + ".jpeg");
                                ImageIO.write(bi, "jpeg", t);//
                            }
                        } catch (Exception ex) {
                        }
                    } else {
                        try {
                            BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D g = bi.createGraphics();
                            Panel.paint(g);
                            File t = new File(jfc.getSelectedFile().getPath() + ".jpeg");
                            ImageIO.write(bi, "jpeg", t);//
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                } else if (jfc.getFileFilter().getDescription().equalsIgnoreCase("Imagen (gif)")) {
                    if (jfc.getSelectedFile().exists()) {
                        try {
                            int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro que desea reemplazar la imagen?");
                            if (respuesta == JOptionPane.OK_OPTION) {
                                jfc.getSelectedFile().delete();
                                BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                                Graphics2D g = bi.createGraphics();
                                Panel.paint(g);
                                File t = new File(jfc.getSelectedFile().getPath() + ".gif");
                                ImageIO.write(bi, "gif", t);//
                            }
                        } catch (Exception ex) {
                        }
                    } else {
                        try {
                            BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D g = bi.createGraphics();
                            Panel.paint(g);
                            File t = new File(jfc.getSelectedFile().getPath() + ".gif");
                            ImageIO.write(bi, "gif", t);//
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                } else if (jfc.getFileFilter().getDescription().equalsIgnoreCase("Imagen (png)")) {
                    if (jfc.getSelectedFile().exists()) {
                        try {
                            int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro que desea reemplazar la imagen?");
                            if (respuesta == JOptionPane.OK_OPTION) {
                                jfc.getSelectedFile().delete();
                                BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                                Graphics2D g = bi.createGraphics();
                                Panel.paint(g);
                                File t = new File(jfc.getSelectedFile().getPath() + ".png");
                                ImageIO.write(bi, "png", t);//
                            }
                        } catch (Exception ex) {
                        }
                    } else {
                        try {
                            BufferedImage bi = new BufferedImage(Panel.getWidth(), Panel.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D g = bi.createGraphics();
                            Panel.paint(g);
                            File t = new File(jfc.getSelectedFile().getPath() + ".png");
                            ImageIO.write(bi, "png", t);//
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            } catch (Exception ex) {
            }
        }
        Panel.removeAll();
        Panel.revalidate();
        Panel.repaint();

                                
    }//GEN-LAST:event_formWindowClosing
    public void CrearTexto(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            fichero = new FileWriter(".\\codigo.txt");
            pw = new PrintWriter(fichero);
            pw.println(concatenar);
            }
        catch (Exception e) {
                e.printStackTrace();
        } finally {
               try {
               if (null != fichero)
                  fichero.close();
               } catch (Exception e2) {
                  e2.printStackTrace();
              }
            }
        try {
            String dotPath = ".\\bin\\dot.exe";
            String fileInputPath = ".\\codigo.txt";
            String fileOutputPath = ".\\grafo1.jpg ";
            String n = dotPath+" -Tjpg "+ fileInputPath+" -o "+fileOutputPath;
                Runtime rt = Runtime.getRuntime();
                rt.exec(n);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
            }
    }
    
    public void PintarArbol(){
        File img =  new  File (".\\grafo1.jpg "); 
        BufferedImage bufferedImage; 
        try {
            bufferedImage = ImageIO . read ( img );
            ImageIcon imageIcon =  new  ImageIcon ( bufferedImage );
            jLabel4.repaint();
            jLabel4.setIcon(imageIcon);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        familia.setCabeza("digraph n{ ");
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Opciones_Agregar;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JComboBox nodos;
    private javax.swing.JTextField nombre_hijo;
    // End of variables declaration//GEN-END:variables
    Tree familia = new Tree();
    int contador = 1;
    String concatenar = "";
}
