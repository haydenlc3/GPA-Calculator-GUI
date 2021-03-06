/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa_calculator_gui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HLC
 */
public class gpacalculator extends javax.swing.JFrame {

    /**
     * Creates new form gpacalculator
     */
    public gpacalculator() {
        initComponents();
    }
    
    
    public void clearFields() {
        Class.setText("");
        Grade.setText("");
        Level.setSelectedIndex(0);
        Semesters.setSelectedIndex(0);
    }
    
    public static boolean isNumeric(String str) {  
          try  
          {  
            double d = Double.parseDouble(str);  
          }  
          catch(NumberFormatException nfe)  
          {  
            return false;  
          }  
          return true;  
    }
    
    public static double convertGPA(double grade, int level) {
        double rawGPA = 0;
        if (grade <= 100 && grade >= 97) {
            rawGPA = 4.0;
        } else if (grade <= 96 && grade >= 94) {
            rawGPA = 3.8;
        } else if (grade <= 93 && grade >= 90) {
            rawGPA = 3.6;
        } else if (grade <= 89 && grade >= 87) {
            rawGPA = 3.4;
        } else if (grade <= 86 && grade >= 84) {
            rawGPA = 3.2;
        } else if (grade <= 83 && grade >= 80) {
            rawGPA = 3.0;
        } else if (grade <= 79 && grade >= 77) {
            rawGPA = 2.8;
        } else if (grade <= 76 && grade >= 74) {
            rawGPA = 2.6;
        } else if (grade <= 73 && grade >= 71) {
            rawGPA = 2.4;
        } else if (grade == 70) {
            rawGPA = 2.2;
        }
        
        if (rawGPA != 0) {
            switch (level) {
                case 1: return rawGPA;
                case 2: return rawGPA + 1;
                case 3: return rawGPA + 1.5;
                case 4: return rawGPA + 2;
                default: break;
            }
        }
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Data = new javax.swing.JTable();
        ClassLabel = new javax.swing.JLabel();
        Class = new javax.swing.JTextField();
        GradeLabel = new javax.swing.JLabel();
        Grade = new javax.swing.JTextField();
        LevelLabel = new javax.swing.JLabel();
        SemesterLevel = new javax.swing.JLabel();
        Level = new javax.swing.JComboBox();
        Semesters = new javax.swing.JComboBox<>();
        AddCourse = new javax.swing.JButton();
        DeleteCourse = new javax.swing.JButton();
        DeleteAll = new javax.swing.JButton();
        GPALabel = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        GPA = new javax.swing.JLabel();
        Updated = new javax.swing.JLabel();
        HelpLevel = new javax.swing.JButton();
        HelpSemester = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        Title.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        Title.setText("Coppell High School GPA Calculator");

        Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Grade", "Level", "Semester(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Data.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Data);
        if (Data.getColumnModel().getColumnCount() > 0) {
            Data.getColumnModel().getColumn(0).setResizable(false);
            Data.getColumnModel().getColumn(1).setResizable(false);
            Data.getColumnModel().getColumn(2).setResizable(false);
            Data.getColumnModel().getColumn(3).setResizable(false);
        }

        ClassLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        ClassLabel.setText("Course:");

        Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassActionPerformed(evt);
            }
        });

        GradeLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        GradeLabel.setText("Grade:");

        Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeActionPerformed(evt);
            }
        });

        LevelLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        LevelLabel.setText("Level:");

        SemesterLevel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        SemesterLevel.setText("Semester(s):");

        Level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4","3","2","1" }));
        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        Semesters.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2","1" }));
        Semesters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestersActionPerformed(evt);
            }
        });

        AddCourse.setBackground(new java.awt.Color(0, 255, 0));
        AddCourse.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        AddCourse.setText("Add Course");
        AddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourseActionPerformed(evt);
            }
        });

        DeleteCourse.setBackground(new java.awt.Color(255, 153, 0));
        DeleteCourse.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        DeleteCourse.setText("Delete Selected");
        DeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCourseActionPerformed(evt);
            }
        });

        DeleteAll.setBackground(new java.awt.Color(255, 0, 0));
        DeleteAll.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        DeleteAll.setText("Delete All");
        DeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllActionPerformed(evt);
            }
        });

        GPALabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        GPALabel.setText("GPA:");

        Calculate.setBackground(new java.awt.Color(0, 0, 255));
        Calculate.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        Calculate.setText("Calculate GPA");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        GPA.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 36)); // NOI18N
        GPA.setText("0.00");

        Updated.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        Updated.setText("Updated: 9/25/2018");

        HelpLevel.setBackground(new java.awt.Color(204, 204, 204));
        HelpLevel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        HelpLevel.setText("Add Course");
        HelpLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpLevelActionPerformed(evt);
            }
        });

        HelpSemester.setBackground(new java.awt.Color(204, 204, 204));
        HelpSemester.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        HelpSemester.setText("Add Course");
        HelpSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpSemesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HelpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HelpSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GradeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClassLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LevelLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SemesterLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Class)
                            .addComponent(Grade, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(Level, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Semesters, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(GPA)
                                    .addComponent(GPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Updated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GPALabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GPA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClassLabel)
                            .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddCourse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GradeLabel)
                            .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteCourse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LevelLabel)
                            .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteAll)
                            .addComponent(HelpLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SemesterLevel)
                            .addComponent(Semesters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HelpSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calculate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Updated))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassActionPerformed

    private void GradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradeActionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed

    }//GEN-LAST:event_LevelActionPerformed

    private void SemestersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemestersActionPerformed
    
    private void AddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourseActionPerformed
        if (!(Class.getText().isEmpty() && Grade.getText().isEmpty())) {
            if (isNumeric(Grade.getText())) {
                if (Double.parseDouble(Grade.getText()) <= 100 && Double.parseDouble(Grade.getText()) >= 0) {
                    DefaultTableModel model = (DefaultTableModel) Data.getModel();
                    model.addRow(new Object[]{Class.getText(), Double.parseDouble(Grade.getText()), Integer.parseInt((String) Level.getSelectedItem()), Double.parseDouble((String) Semesters.getSelectedItem())});
                    clearFields();
                } else {
                    Grade.setText("Must be 0-100");
                }
            } else {
                Grade.setText("Must be number");
            }
        }
    }//GEN-LAST:event_AddCourseActionPerformed

    private void DeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCourseActionPerformed
        DefaultTableModel model = (DefaultTableModel) Data.getModel();
        int[] rows = Data.getSelectedRows();
        for(int i=0; i<rows.length; i++){
            model.removeRow(rows[i]-i);
        }
    }//GEN-LAST:event_DeleteCourseActionPerformed

    private void DeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllActionPerformed
        DefaultTableModel model = (DefaultTableModel) Data.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_DeleteAllActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        double gpa = 0;
        double classes = 0;
        if (Data.getRowCount() > 0) {
            for (int i=0; i<Data.getRowCount(); i++) {
                gpa += convertGPA((double)Data.getValueAt(i, Data.getColumn("Grade").getModelIndex()), (int)Data.getValueAt(i, Data.getColumn("Level").getModelIndex()));
                classes += ((double)Data.getValueAt(i, Data.getColumn("Semester(s)").getModelIndex()))/2;
            }
            GPA.setText(Double.toString(Math.round(gpa/classes * 100.0) / 100.0));
        }
        clearFields();
    }//GEN-LAST:event_CalculateActionPerformed

    private void HelpLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpLevelActionPerformed
        JOptionPane.showMessageDialog(Title, "\n4 = AP/IB\n3 = Dual Credit, Honors, Pre-AP\n2 = On-Level\n1 = Basic");
    }//GEN-LAST:event_HelpLevelActionPerformed

    private void HelpSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpSemesterActionPerformed
        JOptionPane.showMessageDialog(Title, "\nOne full year = 2 semesters\nHalf year = 1 semester");
    }//GEN-LAST:event_HelpSemesterActionPerformed

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
            java.util.logging.Logger.getLogger(gpacalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gpacalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gpacalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gpacalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gpacalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCourse;
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField Class;
    private javax.swing.JLabel ClassLabel;
    private javax.swing.JTable Data;
    private javax.swing.JButton DeleteAll;
    private javax.swing.JButton DeleteCourse;
    private javax.swing.JLabel GPA;
    private javax.swing.JLabel GPALabel;
    private javax.swing.JTextField Grade;
    private javax.swing.JLabel GradeLabel;
    private javax.swing.JButton HelpLevel;
    private javax.swing.JButton HelpSemester;
    private javax.swing.JComboBox Level;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JLabel SemesterLevel;
    private javax.swing.JComboBox<String> Semesters;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Updated;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}