
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nithya.G
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    public bill() {
        initComponents();
        arr.getColumnModel().getColumn(0).setPreferredWidth(70);
        arr.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
 
    public void table (int ID ,String NAME, int QTY ,double PRICE)
    {
     DefaultTableModel tt = (DefaultTableModel)arr.getModel();
     
     //DecimalFormat abc = new DecimalFormat ("00.00") ;
      double totprice = PRICE * Double.valueOf(QTY);
      String totalprice = String.valueOf(totprice);
     
     for(int row =0 ; row  < arr.getRowCount();row++)
     {
       if(NAME == arr.getValueAt(row, 1))
       tt.removeRow(arr.convertRowIndexToModel(row));
     
     }
     
      
     Vector v = new Vector();
     v.add(ID);
     v.add(NAME);
     v.add(QTY);
     v.add(totalprice);
    
    tt.addRow(v);
    
    }
    
     
    public void call()
    {
      // int numofrow = arr.getRowCount();
       double sum =0.0;
      for(int i=0;i< arr.getRowCount();i++)
     sum = sum + Double.parseDouble(arr.getValueAt((int)i, 3).toString());
     // total.setText(String.valueOf(sum));
     
     total.setText(String.valueOf(sum));
    }
     
   public void num()
   {
   
        
          

      // sum = String.parseString(arr.getValueAt((String)i, 3).toString());
   
   }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arr = new javax.swing.JTable();
        bal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        q11 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        p = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        cus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 140, 70);

        arr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO", "ITEM", "QTY", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(arr);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 120, 250, 300);

        bal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bal.setText("00");
        getContentPane().add(bal);
        bal.setBounds(710, 520, 40, 20);

        total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total.setText("00");
        getContentPane().add(total);
        total.setBounds(710, 440, 70, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("TOTAL :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(630, 440, 60, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("CASH :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(640, 480, 60, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("BALANCE :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(620, 520, 80, 20);
        getContentPane().add(pay);
        pay.setBounds(710, 480, 64, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(960, 460, 60, 50);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1050, 460, 70, 50);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(770, 430, 80, 27);

        b1.setText("jButton4");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(20, 110, 70, 70);

        b2.setText("jButton5");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(140, 110, 80, 70);

        b3.setText("jButton6");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(260, 110, 110, 70);

        b4.setText("jButton7");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(20, 230, 80, 60);

        b5.setText("jButton8");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(140, 230, 80, 60);

        b6.setText("jButton9");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(260, 230, 100, 60);

        b7.setText("jButton10");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(20, 330, 80, 60);

        b8.setText("jButton11");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(140, 340, 80, 23);

        b9.setText("jButton12");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(260, 330, 100, 70);

        b10.setText("jButton13");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(20, 450, 90, 80);

        b11.setText("jButton14");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(260, 450, 110, 80);

        q11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q11.setText("0");
        getContentPane().add(q11);
        q11.setBounds(300, 540, 40, 20);

        q1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1.setText("0");
        getContentPane().add(q1);
        q1.setBounds(40, 190, 40, 16);

        q2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q2.setText("0");
        getContentPane().add(q2);
        q2.setBounds(170, 190, 40, 16);

        q3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q3.setText("0");
        getContentPane().add(q3);
        q3.setBounds(300, 190, 40, 16);

        q4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q4.setText("0");
        getContentPane().add(q4);
        q4.setBounds(50, 300, 40, 16);

        q5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q5.setText("0");
        getContentPane().add(q5);
        q5.setBounds(170, 300, 40, 16);

        q6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q6.setText("0");
        getContentPane().add(q6);
        q6.setBounds(300, 300, 40, 16);

        q7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q7.setText("0");
        getContentPane().add(q7);
        q7.setBounds(50, 410, 40, 20);

        q8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q8.setText("0");
        getContentPane().add(q8);
        q8.setBounds(170, 410, 40, 20);

        q9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q9.setText("0");
        getContentPane().add(q9);
        q9.setBounds(290, 410, 40, 20);

        q10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q10.setText("0");
        getContentPane().add(q10);
        q10.setBounds(50, 550, 40, 20);

        jScrollPane3.setViewportView(p);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(910, 120, 220, 300);

        jLabel2.setText("CUSTOMER NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 30, 100, 30);
        getContentPane().add(cus);
        cus.setBounds(750, 30, 100, 30);

        jLabel3.setText("PHONE NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 70, 100, 30);

        pho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoActionPerformed(evt);
            }
        });
        getContentPane().add(pho);
        pho.setBounds(750, 70, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
                 
                 String cusname = cus.getText();
                 String phone   = pho.getText();
                 String total1 =  total.getText();
                String num = ""  ;
               // String num1 = null  ;
                 
               // for(int i=0;i< arr.getRowCount();i++)
                   
                    for(int i=0;i< arr.getRowCount();i++)
                    num = num  + "\n"+String.valueOf(arr.getValueAt(i, 1));
                //    num1 =String.valueOf(arr.getValueAt(1, 1));
                    
                   System.out.println(num);
                    //  if("BUGGER         ".equals(num) );
                   // num =String.valueOf(arr.getValueAt(0, 1));
                   
              /*  num =String.valueOf(arr.getValueAt(0, 1));
                 if("BUGGER         ".equals(num) );
                System.out.println(num); */
                
                  
                
                 
               PreparedStatement ps;
              String query=" INSERT INTO `customer` ( `NAME`,`PHONE`  , `ITEM` , `TOTAL`)values(?,?,?,?)";
              try{
                 ps=MyConnection.getConnection().prepareStatement(query);
                 ps.setString(1,cusname);
                 ps.setString(2,phone);
                 ps.setString(3,num);
              //   ps.setString(3,num1);
                 ps.setString(4,total1);
                
                 
                 if(ps.executeUpdate()>0)
                 {
                    JOptionPane.showMessageDialog(null,"new bill added");   // "new user added"
                 } 
                 else
                    JOptionPane.showMessageDialog(null,"new bill not added");  // not added     

              }catch( Exception the)
                      {
                         System.out.println(the);
                      }
        
        
                  
                
               
        
              
              
        
        try 
      {
       p.setText(p.getText()+"\n"+"          STREET FOOD" +"\n"+"\n"+"   PERIYAR COLONY, " +"\n"+"      AVINASHI MAINROAD," +"\n"+"         TIRURRUR-641652 ");  //" PERIYAR COLONY +"l " + AVINSHI MAIN ROAD");
       p.setText(p.getText()+"--------------------------------------------------"+"\n");
       p.setText(p.getText()+"CUSTOMER NAME :"+cus.getText()+"\n");
       p.setText(p.getText()+"PHONE NO      :"+pho.getText()+"\n");
       p.setText(p.getText()+"\n"+"NAME" +"\t         QTY" +"\tPRICE");
       DefaultTableModel tt = (DefaultTableModel)arr.getModel();
       for(int i=0;i< arr.getRowCount();i++)
       {
         String name = tt.getValueAt(i, 1).toString();
         String qty = tt.getValueAt(i, 2).toString();
         String price = tt.getValueAt(i, 3).toString();
         p.setText(p.getText()+"\n"+name +"        "+qty +"\t"+price);
          
       }
       
        p.setText(p.getText()+"\n"+"--------------------------------------------------"+"\n");
        p.setText(p.getText()+" SUB TOTAL    :" + total.getText() +"\n");
        p.setText(p.getText()+" CASH              :" + pay.getText()   +"\n");
        p.setText(p.getText()+" BALANCE       :" + bal.getText()   +"\n");
      }catch(Exception e) 
      {
        System.out.print(e);
      }
          
        
                  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
         int a = Integer.valueOf(q1.getText());
         ++a;
         q1.setText(String.valueOf(a)); 
         
          
        
        table(1,"BUGGER         ",a,30);
        call();
        num();
        
       
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        int a = Integer.valueOf(q2.getText());
         ++a;
         q2.setText(String.valueOf(a)); 
        
        table(2,"chicken bugger",a,50);
        call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

            int a = Integer.valueOf(q3.getText());
            ++a;
            q3.setText(String.valueOf(a)); 
          
            table(3,"crunchyChicke",a,100);
             call();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
         int a = Integer.valueOf(q4.getText());
            ++a;
             q4.setText(String.valueOf(a)); 
         
             
             table(4,"french fries      ",a,90);
              call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

           int a = Integer.valueOf(q5.getText());
            ++a;
             q5.setText(String.valueOf(a)); 
          
             table(5,"panipori           ",a,220);
              call();            
// TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed

        int a = Integer.valueOf(q6.getText());
            ++a;
             q6.setText(String.valueOf(a)); 
         
             table(6,"pizza               ",a,100);
              call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
            int a = Integer.valueOf(q7.getText());
            ++a;
             q7.setText(String.valueOf(a)); 
         
             table(7,"sanvage          ",a,95);  
              call();

        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
           int a = Integer.valueOf(q8.getText());
            ++a;
             q8.setText(String.valueOf(a)); 
          
             table(8,"fresh juies       ",a,70);    
              call();

// TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

         int a = Integer.valueOf(q9.getText());
            ++a;
             q9.setText(String.valueOf(a)); 
          
             table(9," samosa         ",a,40);
              call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed

             int a = Integer.valueOf(q10.getText());
             ++a;
             q10.setText(String.valueOf(a)); 
         
             table(10,"black forest    ",a,65);
              call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed

            int a = Integer.valueOf(q11.getText());
            ++a;
             q11.setText(String.valueOf(a)); 
         
             table(11,"ice cream       ",a,60);
              call();
        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         DefaultTableModel tt = (DefaultTableModel)arr.getModel();
         int rw = arr.getSelectedRow();
         String r = tt.getValueAt(arr.getSelectedRow(), 0).toString();
         tt.removeRow(rw);
         
          
         switch(r)
         {
             case "1" :
                 q1.setText("0");
             break;
             case "2" :
                 q2.setText("0");
             break;
             case "3" :
                 q3.setText("0");
             break;
             case "4" :
                 q4.setText("0");
             break;
             case "5" :
                 q5.setText("0");
             break;
             case "6" :
                 q6.setText("0");
             break;
             case "7" :
                 q7.setText("0");
             break;
             case "8" :
                 q8.setText("0");
             break;
             case "9" :
                 q9.setText("0");
             break;
             case "10" :
                 q10.setText("0");
             break;
             case "11" :
                 q11.setText("0");
             break;
            
             default :
                 System.out.print("over");
         }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

           double tot = Double.valueOf(total.getText());
           double paid = Double.valueOf(pay.getText());
           double balance = paid - tot ;
           bal.setText(String.valueOf(balance));                 //   bal.setText(String.valueOf(balance));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable arr;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel bal;
    private javax.swing.JTextField cus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane p;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField pho;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
