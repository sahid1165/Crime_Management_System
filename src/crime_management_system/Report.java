/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime_management_system;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PRANTIK
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
    }
    public Report(String mobno,String dob){
        initComponents();
        lbl_vmob.setText(mobno);
        lbl_vdob.setText(dob);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_caseid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_doe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_toe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_loc = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_vname = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_vgender = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_vdob = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_vaddr = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_vmob = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbl_residence = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_residenceid = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbl_cname = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbl_cage = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbl_caddr = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lbl_cgender = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbl_police = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbl_station = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lbl_cmark = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Incident  and Crime Report");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Case Id:");

        lbl_caseid.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date of the Event:");

        lbl_doe.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Time of Event:");

        lbl_toe.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Type of Crime:");

        lbl_type.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Location:");

        lbl_loc.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("Victim(s):-");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Name:");

        lbl_vname.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Gender:");

        lbl_vgender.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Date of Birth:");

        lbl_vdob.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Address:");

        lbl_vaddr.setText("jLabel21");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Mobile No:");

        lbl_vmob.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Residence Type:");

        lbl_residence.setText("jLabel25");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Residence ID:");

        lbl_residenceid.setText("jLabel27");

        jLabel28.setText("Signature of the Victim(s)");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel29.setText("Suspect(s):-");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Status of Case:");

        lbl_status.setText("jLabel31");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Name:");

        lbl_cname.setText("jLabel33");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Age:");

        lbl_cage.setText("jLabel35");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Address");

        lbl_caddr.setText("jLabel37");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Gender:");

        lbl_cgender.setText("jLabel39");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Mark:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel41.setText("Crime Description:-");

        lbl_description.setText("jLabel42");

        jLabel43.setText("Date:-");

        jLabel44.setText("For Sr. Superintendent of Police(Name of the Officer with Seal)");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Police Officer Reporting:");

        lbl_police.setText("jLabel46");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Police Station Name: ");

        lbl_station.setText("jLabel48");

        jLabel49.setForeground(new java.awt.Color(204, 0, 51));
        jLabel49.setText("I declare that this report and information contained herein is true, and complete to the best of my knowledge and belief.I further acknowledge");

        jLabel50.setForeground(new java.awt.Color(204, 0, 51));
        jLabel50.setText("that any international false statement or misstatement may be a violation section 148.5 of the Parliament Of India.");

        lbl_cmark.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28)
                                    .addGap(100, 100, 100)
                                    .addComponent(jLabel44))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(65, 65, 65)
                                            .addComponent(lbl_vaddr, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbl_vname))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel9))
                                                    .addGap(37, 37, 37)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_caseid)
                                                        .addComponent(lbl_type)))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel32)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbl_cname))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel24)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lbl_residence))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel36)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbl_caddr)))
                                            .addGap(111, 111, 111)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(42, 42, 42)
                                                    .addComponent(lbl_doe))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel47)
                                                    .addGap(57, 57, 57)
                                                    .addComponent(lbl_station))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(77, 77, 77))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel16)
                                                                .addGap(82, 82, 82)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel26)
                                                                .addComponent(jLabel38)
                                                                .addComponent(jLabel40))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_cmark)
                                                        .addComponent(lbl_cgender)
                                                        .addComponent(lbl_residenceid)
                                                        .addComponent(lbl_loc)
                                                        .addComponent(lbl_vgender)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel45)
                                            .addGap(53, 53, 53)
                                            .addComponent(lbl_police))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(38, 38, 38)))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addGap(54, 54, 54)
                                            .addComponent(lbl_cage))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel30))
                                            .addGap(35, 35, 35)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_status)
                                                .addComponent(lbl_vmob)
                                                .addComponent(lbl_vdob)
                                                .addComponent(lbl_toe))))
                                    .addGap(0, 9, Short.MAX_VALUE)))
                            .addComponent(jLabel13)
                            .addComponent(jLabel29)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(54, 54, 54)
                                .addComponent(lbl_description)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_caseid)
                    .addComponent(jLabel5)
                    .addComponent(lbl_doe)
                    .addComponent(jLabel7)
                    .addComponent(lbl_toe))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_type)
                    .addComponent(jLabel11)
                    .addComponent(lbl_loc)
                    .addComponent(jLabel30)
                    .addComponent(lbl_status))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lbl_vname)
                    .addComponent(jLabel16)
                    .addComponent(lbl_vgender)
                    .addComponent(jLabel18)
                    .addComponent(lbl_vdob))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lbl_vaddr)
                    .addComponent(jLabel22)
                    .addComponent(lbl_vmob))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lbl_residence)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_residenceid))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(lbl_cname)
                    .addComponent(jLabel34)
                    .addComponent(lbl_cage)
                    .addComponent(jLabel38)
                    .addComponent(lbl_cgender))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(lbl_caddr)
                    .addComponent(jLabel40)
                    .addComponent(lbl_cmark))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(lbl_description))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lbl_police)
                    .addComponent(jLabel47)
                    .addComponent(lbl_station))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addGap(13, 13, 13))
        );

        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_back.setForeground(new java.awt.Color(255, 0, 51));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_back)
                        .addGap(256, 256, 256)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_print)
                    .addComponent(btn_back)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
       PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.70,1);
                
                jPanel2.paint(g2);
 //         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
         
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String mobno=lbl_vmob.getText();
        String dob=lbl_vdob.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/crimemanagement","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from crime natural join victim where vmmob='"+mobno+"' and vmdob='"+dob+"'");
            if(rs.next())
            {
              lbl_caseid.setText(rs.getString(1));
              lbl_cname.setText(rs.getString(2));
              lbl_caddr.setText(rs.getString(3));
              lbl_cage.setText(rs.getString(4));
              lbl_cgender.setText(rs.getString(5));
              lbl_cmark.setText(rs.getString(6));
              lbl_type.setText(rs.getString(7));
              lbl_doe.setText(rs.getString(8));
              lbl_toe.setText(rs.getString(9));
              lbl_loc.setText(rs.getString(10));
              lbl_description.setText(rs.getString(11));
              lbl_status.setText(rs.getString(12));
              
              lbl_vname.setText(rs.getString(13));
              lbl_vaddr.setText(rs.getString(14));
              //mobile
              lbl_residence.setText(rs.getString(16));
              lbl_station.setText(rs.getString(17));
              //DOB
              lbl_vgender.setText(rs.getString(19));
              lbl_residenceid.setText(rs.getString(20));
              lbl_police.setText(rs.getString(21));
              
              
                
                
                
            }
           
        }
       catch(ClassNotFoundException | SQLException e){
            
        }
    }//GEN-LAST:event_formComponentShown

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Search().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_caddr;
    private javax.swing.JLabel lbl_cage;
    private javax.swing.JLabel lbl_caseid;
    private javax.swing.JLabel lbl_cgender;
    private javax.swing.JLabel lbl_cmark;
    private javax.swing.JLabel lbl_cname;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_doe;
    private javax.swing.JLabel lbl_loc;
    private javax.swing.JLabel lbl_police;
    private javax.swing.JLabel lbl_residence;
    private javax.swing.JLabel lbl_residenceid;
    private javax.swing.JLabel lbl_station;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_toe;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_vaddr;
    private javax.swing.JLabel lbl_vdob;
    private javax.swing.JLabel lbl_vgender;
    private javax.swing.JLabel lbl_vmob;
    private javax.swing.JLabel lbl_vname;
    // End of variables declaration//GEN-END:variables
}
