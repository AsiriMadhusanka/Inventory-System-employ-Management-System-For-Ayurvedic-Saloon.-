/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author TITANIUM
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class ManagementFinance extends javax.swing.JInternalFrame {

    Connection conn =null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    public ManagementFinance() {
        initComponents();
        conn = MysqlConnect.ConnectDB();//Data base connection
        jRadioButton1.setSelected(false);
        jRadioButton1.setVisible(false);
        txt_Exid.setVisible(false);
        jLabel9.setVisible(false);
        updateTable();
        btn_add.setEnabled(true);
        btn_clear.setEnabled(false);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }
    
    public void clearField()
    {
        txt_rent.setText("");
        txt_weba.setText("");
        txt_tlephonebill.setText("");
        txt_salarypayment.setText("");
        jDateChooser1.setDateFormatString("");
        txt_expendituredescription.setText("");
        txt_amount.setText("");
        
        jRadioButton_fixed.setSelected(false);
        jRadioButton2_other.setSelected(false);
        jRadioButton1.setSelected(true);
    }
    
     private void updateTable()
     {
         try {
             String sql="SELECT*FROM finance_management";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null, e);
         }finally
         {
             try {
                 rs.close();
                 pst.close();
             } catch (Exception e) {
             }
         }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton_fixed = new javax.swing.JRadioButton();
        jRadioButton2_other = new javax.swing.JRadioButton();
        txt_rent = new javax.swing.JTextField();
        txt_weba = new javax.swing.JTextField();
        txt_tlephonebill = new javax.swing.JTextField();
        txt_salarypayment = new javax.swing.JTextField();
        txt_expendituredescription = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_Exid = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Expences");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rent");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Water and electricity bill ammount");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telephone bill");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Salary payment");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Expenditure descryption");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Amount");

        jRadioButton_fixed.setText("Fixed expenditure");
        jRadioButton_fixed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_fixedActionPerformed(evt);
            }
        });

        jRadioButton2_other.setText("Other expenditure");
        jRadioButton2_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_otherActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_add.setText("Add Expenditures");
        btn_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete.setText("Delete Expenditures");
        btn_delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update.setText("Update Expenditures");
        btn_update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_show.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_show.setText("Show monthly report");
        btn_show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jRadioButton1.setText("r1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("exID");

        txt_Exid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ExidActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton_fixed)
                                .addGap(33, 33, 33)
                                .addComponent(jRadioButton2_other)
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButton1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addGap(29, 29, 29)
                                .addComponent(txt_Exid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn_add)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_update)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_delete)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(txt_expendituredescription)
                                        .addComponent(txt_salarypayment)
                                        .addComponent(txt_tlephonebill)
                                        .addComponent(txt_rent)
                                        .addComponent(txt_weba)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_show)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_fixed)
                    .addComponent(jRadioButton2_other)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel9)
                    .addComponent(txt_Exid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txt_weba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tlephonebill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_salarypayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_expendituredescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_fixedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_fixedActionPerformed

        expenditure = "Fixed expenditure";

    }//GEN-LAST:event_jRadioButton_fixedActionPerformed

    private void jRadioButton2_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_otherActionPerformed

        expenditure = "Other expenditure";

    }//GEN-LAST:event_jRadioButton2_otherActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        String  rent_validate = txt_rent.getText();
        String  weba_validate = txt_weba.getText();
        String  phone_validate = txt_tlephonebill.getText();
        String  salary_validate = txt_salarypayment.getText();
        java.util.Date dte = jDateChooser1.getDate();
        String  exdes_validate = txt_expendituredescription.getText();
        String  amount_validate = txt_amount.getText();

        if(expenditure == null)
        {
            JOptionPane.showMessageDialog(null, "SELECT EXPENDIYURE");
        }
        else if(rent_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENETER RENTAL");
        }
        else if(weba_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENTER WATER,ELECTRICITY BIIL AMOUNT ");
        }else if(phone_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENTER PHONE NUMBER");
        }
        else if(salary_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENTER SALARY PAYMENT");
        }
        else if(dte==null)
        {
            JOptionPane.showMessageDialog(null, "SELECT DATE");
        }
        else if(exdes_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENETER EXPENDITURES DESCRIPTION");
        }
        else if(amount_validate.equals(""))
        {
            JOptionPane.showMessageDialog(null, "ENETER AMOUNT");
        }
        else
        {

            try {
                String sql = "INSERT INTO finance_management (Expenditure,Rent,WaterElectricityBill,TelephoneBill,SalaryPayment,Date,ExpenditureDescription,Amount)VALUES(?,?,?,?,?,?,?,?)";

                pst=conn.prepareStatement(sql);
                pst.setString(1, expenditure);
                pst.setString(2, txt_rent.getText());
                pst.setString(3, txt_weba.getText());
                pst.setString(4, txt_tlephonebill.getText());
                pst.setString(5, txt_salarypayment.getText());

                java.util.Date date = jDateChooser1.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String strDateoutput = sdf.format(date);
                pst.setString(6, strDateoutput);

                pst.setString(7, txt_expendituredescription.getText());
                pst.setString(8, txt_amount.getText());

                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA Saved Succesfull");

            } catch (Exception e) {
            }finally{
                try {
                    rs.close();
                    pst.close();
                } catch (Exception e) {
                }
            }
        }
        clearField();
        updateTable();
        btn_add.setEnabled(true);
        btn_clear.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        if(txt_Exid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT DATA TO DELETE");
        }
        else
        {
            int p = JOptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO DELETE", "Delete", JOptionPane.YES_NO_OPTION);

            if(p==0)
            {
                try {
                    String sql ="DELETE FROM finance_management WHERE ExpenditureID=?";
                    pst=conn.prepareStatement(sql);

                    pst.setString(1, txt_Exid.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"DELETED SUCCESFULL");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }finally
                {
                    try {
                        rs.close();
                        pst.close();
                    } catch (Exception e) {
                    }
                }
            }//end if
        }//end else
        clearField();
        updateTable();
        btn_add.setEnabled(false);
        btn_clear.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {
            String sql = "UPDATE finance_management SET Expenditure=?,Rent=?,WaterElectricityBill=?,TelephoneBill=?,SalaryPayment=?,Date=?,ExpenditureDescription=?,Amount=? WHERE ExpenditureID=?";
            pst=conn.prepareStatement(sql);

            if(jRadioButton_fixed.isSelected())
            {
                pst.setString(1, "Fixed expenditure");
            }
            else
            {
                pst.setString(1, "Other expenditure");
            }
            pst.setString(2, txt_rent.getText());
            pst.setString(3, txt_weba.getText());
            pst.setString(4, txt_tlephonebill.getText());
            pst.setString(5, txt_salarypayment.getText());

            java.util.Date date = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDateoutput = sdf.format(date);
            pst.setString(6, strDateoutput);

            pst.setString(7, txt_expendituredescription.getText());
            pst.setString(8, txt_amount.getText());
            pst.setString(9, txt_Exid.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"UPDATE SUCESSFULL");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally
        {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
        updateTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        String Table_click =(jTable1.getModel().getValueAt(row, 0).toString());

        try
        {
            String sql="SELECT*FROM finance_management WHERE ExpenditureID='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();

            if(rs.next())
            {
                String strExID = rs.getString("ExpenditureID");
                txt_Exid.setText(strExID);

                String strexpen = rs.getString("Expenditure");
                if("Fixed expenditure".equals(strexpen))
                {
                    jRadioButton_fixed.setSelected(true);
                }
                if("Other expenditure".equals(strexpen))
                {
                    jRadioButton2_other.setSelected(true);
                }

                String strrent = rs.getString("Rent");
                txt_rent.setText(strrent);

                String strweb = rs.getString("WaterElectricityBill");
                txt_weba.setText(strweb);

                //Date

                String strtellbill = rs.getString("TelephoneBill");
                txt_tlephonebill.setText(strtellbill);

                String strsalary = rs.getString("SalaryPayment");
                txt_salarypayment.setText(strsalary);

                String strdate = rs.getString("Date");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strdate);
                jDateChooser1.setDate(date);

                String strspdes = rs.getString("ExpenditureDescription");
                txt_expendituredescription.setText(strspdes);

                String stramount = rs.getString("Amount");
                txt_amount.setText(stramount);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
        btn_add.setEnabled(true);
        btn_clear.setEnabled(true);
        btn_update.setEnabled(true);
        btn_delete.setEnabled(true);

    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_ExidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ExidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ExidActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        clearField();
        btn_add.setEnabled(true);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }//GEN-LAST:event_btn_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton btn_update;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2_other;
    private javax.swing.JRadioButton jRadioButton_fixed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_Exid;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_expendituredescription;
    private javax.swing.JTextField txt_rent;
    private javax.swing.JTextField txt_salarypayment;
    private javax.swing.JTextField txt_tlephonebill;
    private javax.swing.JTextField txt_weba;
    // End of variables declaration//GEN-END:variables
private String expenditure;
}
