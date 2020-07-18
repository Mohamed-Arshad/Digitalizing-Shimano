/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.Database;
import Model.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
/**
 *
 * @author MSI GV62 8RE
 */
public class additem extends javax.swing.JFrame {

    /**
     * Creates new form additem
     */
    Shimano_GUI maingui;
    ArrayList<Product> item;
    public additem() {
        initComponents();
    }
    public additem(Shimano_GUI sh,ArrayList<Product> arr){
        initComponents();
        maingui=sh;
        item=arr;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtItemDescription = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtItemType = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtItemModel = new javax.swing.JTextField();
        txtItemQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setText("ADD ITEM");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Type :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Model :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Description :");

        txtItemDescription.setColumns(20);
        txtItemDescription.setRows(5);
        jScrollPane1.setViewportView(txtItemDescription);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Quantity :");

        txtItemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemTypeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Price :");

        txtItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemPriceActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtItemModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemModelActionPerformed(evt);
            }
        });

        txtItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemModel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemTypeActionPerformed

    private void txtItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemPriceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Name=txtItemType.getText();
        int quantity=0;
        Double unitprice=0.0;
        if(Name.equals("")){
            JOptionPane.showMessageDialog(jPanel1,"Please enter a Name","Missing field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Model=txtItemModel.getText();
        if(Model.equals("")){
            JOptionPane.showMessageDialog(jPanel1,"Please enter a Model","Missing field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Description=txtItemDescription.getText();
        if(Description.equals("")){
            JOptionPane.showMessageDialog(jPanel1,"Please enter a Description","Missing field",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
        unitprice=Double.parseDouble(txtItemPrice.getText());
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(jPanel1,"Please enter valid unit price","Invalid data",JOptionPane.ERROR_MESSAGE);
             return;
        }
        try{
        quantity=Integer.parseInt(txtItemQuantity.getText());
        }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(jPanel1,"Please enter valid quantity","Invalid data",JOptionPane.ERROR_MESSAGE);
         return;
        }
        String sql="";
        Database db=new Database();
        
        Product pr=new Product(Name, Model, Description, unitprice, quantity);
        for(int i=0;i<item.size();i++){
            if(item.get(i).getModel().equalsIgnoreCase(Model)){
                int newquantity=item.get(i).getQuantity()+quantity;
                sql="update AvailableProduct set quantity= "+newquantity+" where model = '"+Model+"'";
                if(db.update(sql)){
                item.get(i).setQuantity(newquantity);
               JOptionPane.showMessageDialog(jPanel1,"Item have been added Sucessfully","Transection added",JOptionPane.INFORMATION_MESSAGE);
               maingui.refreshitemtable(item);
               this.setVisible(false);
                }else{
                    System.out.println("problem in update");
                }
                return;
            }
        }
        sql="INSERT INTO `AvailableProduct`(`name`, `model`, `description`, `unitprice`, `quantity`) VALUES ('"+Name+"','"+Model+"','"+Description+"','"+unitprice+"','"+quantity+"')";
        if(db.insert(sql)){
            item.add(pr);
            JOptionPane.showMessageDialog(jPanel1,"Item have been added Sucessfully","Item added",JOptionPane.INFORMATION_MESSAGE);
            maingui.refreshitemtable(item);
            this.setVisible(false);
        }else{
            System.out.println("problem with insert");
        }
        
        /*try{
            String type="",newType="",model="",newModel="",description="";
            int quantity=0,price=0;
            type=comboBoxType.getSelectedItem().toString();
            newType=txtItemType.getText().toString();
            System.out.println(type);
            model=comboBoxModel.getSelectedItem().toString();
            newModel=txtItemModel.getText().toString();
            System.out.println(model);
            description=txtItemDescription.getText().toString();
            System.out.println(model);
            quantity=Integer.parseInt(txtItemQuantity.getText().toString());
            System.out.println(quantity);
            price=Integer.parseInt(txtItemPrice.getText().toString());
            System.out.println(price);
            System.out.println(model);
            if(jCheckBox1.isSelected())
            {
                type=comboBoxType.getSelectedItem().toString();
                model=comboBoxModel.getSelectedItem().toString();
                quantity=Integer.parseInt(txtItemQuantity.getText().toString());
                
                String str1="",str2="";
                int oldQuantity=0, newQuantity=0;
                str1="SELECT quantity FROM item where type='"+type+"' and model='"+model+"'";
                oldQuantity=Integer.parseInt((database.instance.select(str1)).get(0).toString());
                
                newQuantity=oldQuantity+quantity;
                
                str2="UPDATE item SET quantity='"+newQuantity+"' WHERE type='"+type+"' and model='"+model+"'";
                database.instance.insert(str2);
                JOptionPane.showMessageDialog(this, "Updated Sucessfull", "Added", 1);
                
            }else
            {
                type=comboBoxType.getSelectedItem().toString();
                newType=txtItemType.getText().toString();
                model=comboBoxModel.getSelectedItem().toString();
                newModel=txtItemModel.getText().toString();
                description=txtItemDescription.getText().toString();
                quantity=Integer.parseInt(txtItemQuantity.getText().toString());
                price=Integer.parseInt(txtItemPrice.getText().toString());
                String str="";
                if(jCheckBoxModel.isSelected())
                {
                    str="INSERT INTO `item`(`type`, `model`, `description`, `quantity`, `price`) VALUES ('"+type+"','"+newModel+"','"+description+"','"+quantity+"','"+price+"')";
                }
                if(jCheckBoxModel.isSelected() && jCheckBoxType.isSelected())
                {
                    str="INSERT INTO `item`(`type`, `model`, `description`, `quantity`, `price`) VALUES ('"+newType+"','"+newModel+"','"+description+"','"+quantity+"','"+price+"')";
                }
                database.instance.insert(str);
                JOptionPane.showMessageDialog(this, "Added Sucessfull", "Added", 1);
                txtItemType.setText("");
                txtItemModel.setText("");
                txtItemDescription.setText("");
                txtItemQuantity.setText("");
                txtItemPrice.setText("");
            }
            
        }catch(Exception Ex){
            JOptionPane.showMessageDialog(this,"Error While Adding");
            System.out.println(Ex.getMessage());
        }*/
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtItemModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemModelActionPerformed

    private void txtItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(additem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new additem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtItemDescription;
    private javax.swing.JTextField txtItemModel;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemQuantity;
    private javax.swing.JTextField txtItemType;
    // End of variables declaration//GEN-END:variables
}