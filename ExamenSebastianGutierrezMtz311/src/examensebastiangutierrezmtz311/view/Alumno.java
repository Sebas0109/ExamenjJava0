/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensebastiangutierrezmtz311.view;

import examensebastiangutierrezmtz311.businessLogic.AlumnoBLO;
import examensebastiangutierrezmtz311.businessLogic.MateriaBLO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import examensebastiangutierrezmtz311.model.Materia;
import java.util.HashSet;

/**
 *
 * @author sebas
 */
public class Alumno extends javax.swing.JFrame {
    
    AlumnoBLO alumnoBLO = new AlumnoBLO();
    MateriaBLO matBLO = new MateriaBLO();

    /**
     * Creates new form Alumno
     */
    public Alumno() {
        initComponents();
        setLocationRelativeTo(null); 
        alumnoBLO.load();
        matBLO.load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        tfSexo = new javax.swing.JTextField();
        tfCURP = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        tfMateria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setText("Search Alum");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Estado", "Fecha Nac.", "Sexo", "CURP", "Materia"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado");

        jLabel5.setText("Fecha Nac");

        jLabel6.setText("Sexo");

        jLabel7.setText("CURP");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel8.setText("Nom Materia");

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMateria)
                            .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(btnSearch)
                            .addComponent(btnDelete)
                            .addComponent(btnRefresh)
                            .addComponent(btnRegister)
                            .addComponent(btnUpdate)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(21, 21, 21)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String GenerarCURP(String nombre, String Apellido, String FechaNac, String Sexo, String Estado)
    {
     StringBuilder builder = new StringBuilder();
     String[] parts =Apellido.split(" ");
     String paterno = parts[0];
     String materno = parts[1];
     String[] partsFecha = FechaNac.split("/");
     String año = partsFecha[2]; 
     String mes = partsFecha[0];
     String dia = partsFecha[1];     
     builder.append(paterno.charAt(0));
        for (int i = 0; i < paterno.length(); i++) {
            char vocal = paterno.charAt(i);
            if(vocal == 'a'||vocal =='e'||vocal =='i'||vocal =='o'||vocal =='u')
            {
                builder.append(vocal);
                break;
            }
        }
        builder.append(materno.charAt(0));
        builder.append(nombre.charAt(0));
        builder.append(año.charAt(2));
        builder.append(año.charAt(3));
        builder.append(mes.charAt(0));
        builder.append(mes.charAt(1));
        builder.append(dia.charAt(0));
        builder.append(dia.charAt(1));
        builder.append(Sexo.charAt(0));
        builder.append(Estado.charAt(0));
        builder.append(Estado.charAt(1));
        
                    for (int i = 1; i < paterno.length(); i++) {
                                        char copaterno = paterno.charAt(i);

                       if (copaterno != 'a' && copaterno != 'e' && copaterno != 'i' && copaterno != 'o' && copaterno != 'u') {
                            //patereno , materno , nombre
                            builder.append(copaterno);
                            break;
                        }
            }
                for (int j = 1; j < materno.length(); j++) {
                                            char coMaterno = materno.charAt(j);

                                            if (coMaterno != 'a' && coMaterno != 'e' && coMaterno != 'i' && coMaterno != 'o' && coMaterno != 'u') {
                            //patereno , materno , nombre
                            builder.append(coMaterno);
                            break;
                        }
                }
                    
                    for (int k = 0; k < nombre.length(); k++) {
                        char coNombre = nombre.charAt(k);
                        
                        if (coNombre != 'e' && coNombre != 'e' && coNombre != 'i' && coNombre != 'o' && coNombre != 'u') {
                            //patereno , materno , nombre
                            builder.append(coNombre);
                            break;
                        }
                        
                    }

     String CURP = builder.toString();
     return CURP.toUpperCase();
    }
    
    private void ClearTable()
    {
         DefaultTableModel dtm = (DefaultTableModel) tblAlumnos.getModel();
         while(dtm.getRowCount()>0)
         {
             dtm.removeRow(0);
         }
    }
    
    private examensebastiangutierrezmtz311.model.Alumno SelectByIdAlum(List<examensebastiangutierrezmtz311.model.Alumno> studentList, String Id)
    {
        examensebastiangutierrezmtz311.model.Alumno temp = null;
        for(examensebastiangutierrezmtz311.model.Alumno alum : studentList)
        {
          if ( alum.getId().contains(Id)) {
                temp = alum;
            }        
        }
        return temp;
    }
    
    private Materia SelectByName(List<Materia> materias, String Name)
    {
        Materia mat = null;
        for(Materia materia : materias)
        {
            if (materia.getNombre().contains(Name)) {
                mat = materia;
            }
        }
        return mat;
    }
    
    private void RefreshTable(List<examensebastiangutierrezmtz311.model.Alumno> studentList)
    {
        ClearTable();
         DefaultTableModel dtm = (DefaultTableModel) tblAlumnos.getModel();
         Object[] emptyRow = {""};
         
        for (int i = 0; i < studentList.size(); i++) {
            dtm.addRow(emptyRow);
            dtm.setValueAt(studentList.get(i).getId(), i, 0);
            dtm.setValueAt(studentList.get(i).getNombre(), i, 1);
            dtm.setValueAt(studentList.get(i).getPaterno(), i, 2);
            dtm.setValueAt(studentList.get(i).getEstado(), i, 3);
            dtm.setValueAt(studentList.get(i).getFechaNacimiento(), i, 4);
            dtm.setValueAt(studentList.get(i).getSexo(), i, 5);
            dtm.setValueAt(studentList.get(i).getCURP(), i, 6);
            dtm.setValueAt(studentList.get(i).getMateria().Nombre, i,7);            
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = tfNombre.getText().trim();
        String apellidoP = tfApellidos.getText().trim();
        String estado = tfEstado.getText().trim();
        String FechaNac = tfFecha.getText().trim();
        String Sexo = tfSexo.getText().trim();
        String CURP = GenerarCURP(name, apellidoP, FechaNac, Sexo, estado); 
        examensebastiangutierrezmtz311.model.Alumno alumno = new examensebastiangutierrezmtz311.model.Alumno(name,apellidoP,estado,FechaNac,Sexo,CURP);
        alumnoBLO.save(alumno);
        tfNombre.setText("");
        tfApellidos.setText(""); 
        tfEstado.setText(""); 
        tfFecha.setText(""); 
        tfSexo.setText(""); 
        tfCURP.setText(""); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String id = tfId.getText().trim();
        if (!id.isEmpty()) {
        List<examensebastiangutierrezmtz311.model.Alumno> studentList = alumnoBLO.find(id);
        
        if (!studentList.isEmpty()) {
            RefreshTable(studentList);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "YOU NEED TO FILL THE LAST NAME");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = tfId.getText().trim();
        List<examensebastiangutierrezmtz311.model.Alumno> studentList = alumnoBLO.findAll();
        examensebastiangutierrezmtz311.model.Alumno elim = SelectByIdAlum(studentList, id);
        alumnoBLO.delete(elim);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        alumnoBLO.commitChanges(); //guardar los cambios de la lista
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id = tfId.getText().trim();
        String name = tfNombre.getText().trim();
        String apellidoP = tfApellidos.getText().trim();
        String estado = tfEstado.getText().trim();
        String FechaNac = tfFecha.getText().trim();
        String Sexo = tfSexo.getText().trim();
        String CURP = tfCURP.getText().trim();
        examensebastiangutierrezmtz311.model.Alumno alumno = new examensebastiangutierrezmtz311.model.Alumno(name,apellidoP,estado,FechaNac,Sexo,CURP);
        alumnoBLO.update(id, alumno);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
         String id = tfId.getText().trim();
         String mat = tfMateria.getText().trim();
         List<Materia> materias = matBLO.findAll();
        List<examensebastiangutierrezmtz311.model.Alumno> studentList = alumnoBLO.findAll();
        examensebastiangutierrezmtz311.model.Alumno reg = SelectByIdAlum(studentList, id);
        Materia materia = SelectByName(materias, mat);
        alumnoBLO.register(reg, materia);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
         RefreshTable(alumnoBLO.findAll());
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCURP;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfMateria;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfSexo;
    // End of variables declaration//GEN-END:variables
}