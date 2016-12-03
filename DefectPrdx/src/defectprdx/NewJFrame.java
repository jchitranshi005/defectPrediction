
package defectprdx;


import static defectprdx.Compare.identicalFile1;
import static defectprdx.Compare.identicalFile2;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Browse1 = new javax.swing.JButton();
        Browse2 = new javax.swing.JButton();
        Path1 = new javax.swing.JTextField();
        Path2 = new javax.swing.JTextField();
        Version1 = new javax.swing.JLabel();
        Version2 = new javax.swing.JLabel();
        Added = new javax.swing.JButton();
        SameFile = new javax.swing.JButton();
        Deleted = new javax.swing.JButton();
        CSV = new javax.swing.JButton();
        Loc = new javax.swing.JButton();
        Modified = new javax.swing.JButton();
        Complexity = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Browse1.setText("Browse");
        Browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse1ActionPerformed(evt);
            }
        });

        Browse2.setText("Browse");
        Browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse2ActionPerformed(evt);
            }
        });

        Path1.setText("Path1");
        Path1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path1ActionPerformed(evt);
            }
        });

        Path2.setText("Path2");
        Path2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Path2ActionPerformed(evt);
            }
        });

        Version1.setText("Version1");

        Version2.setText("Version2");

        Added.setText("Added");
        Added.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddedActionPerformed(evt);
            }
        });

        SameFile.setText("SameFile");
        SameFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SameFileActionPerformed(evt);
            }
        });

        Deleted.setText("Deleted");
        Deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedActionPerformed(evt);
            }
        });

        CSV.setText("CSV");
        CSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSVActionPerformed(evt);
            }
        });

        Loc.setText("Loc ");
        Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocActionPerformed(evt);
            }
        });

        Modified.setText("Modified");
        Modified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifiedActionPerformed(evt);
            }
        });

        Complexity.setText("Complexity");
        Complexity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplexityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Version1)
                    .addComponent(Version2)
                    .addComponent(Complexity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Path1)
                    .addComponent(Path2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Added)
                                    .addComponent(Deleted))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Loc)
                                    .addComponent(CSV))
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SameFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Modified)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Browse1)
                    .addComponent(Browse2))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Browse1)
                    .addComponent(Path1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Version1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Browse2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Path2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Version2)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SameFile)
                    .addComponent(Modified)
                    .addComponent(Complexity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Added)
                    .addComponent(Loc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deleted)
                    .addComponent(CSV))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse1ActionPerformed
                // TODO add your handling code here:
                JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Browse the folder :: ProjectVersion1");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("getCurrentDirectory(): "+ chooser.getCurrentDirectory());
                System.out.println("getSelectedFile() : "+ chooser.getSelectedFile());
                 File f= chooser.getSelectedFile();
                   filename1=f.getAbsolutePath();
                   Path1.setText(filename1);
            } else {
                System.out.println("No Selection ");
            }
            
    }//GEN-LAST:event_Browse1ActionPerformed

    private void Browse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Browse the folder :: ProjectVersion2");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           
                   if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("getCurrentDirectory(): "+ chooser.getCurrentDirectory());
                System.out.println("getSelectedFile() : "+ chooser.getSelectedFile());
                File f= chooser.getSelectedFile();
                   filename2=f.getAbsolutePath();
                   Path2.setText(filename2);
            } else {
                System.out.println("No Selection ");
            }
    }//GEN-LAST:event_Browse2ActionPerformed

    private void Path1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path1ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_Path1ActionPerformed

    private void Path2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Path2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Path2ActionPerformed

    private void AddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddedActionPerformed
        // TODO add your handling code here:
        System.out.println("Added entered");
//        for(int i=0;i< identicalFile1.size();i++)
//        {
//        System.out.println("gggggggg"+identicalFile1.get(i));
//        }
        for(int i=0;i< identicalFile1.size();i++)
        {
            String compV1=identicalFile1.get(i);
            String compV2=identicalFile2.get(i);
        
         try 
             {
                  int flag=0;
                  int added=0;
                  Scanner file2 = new Scanner(new FileReader(compV2));
                    String line2= file2.nextLine();
                     while(file2.hasNext())
                {
                    flag=0;
                     Scanner file1 = new Scanner(new FileReader(compV1));
                     String line1=file1.nextLine();
                     while(file1.hasNext())
                     {  
                        if(line1.equals(line2)==true) flag=1;
			//System.out.println(line2);
                        	//System.out.println(line1);
			line1=file1.nextLine();
			 
                     }
                     if(flag==0)added++;
			line2=file2.nextLine();
			
                 }
                     added_matrix.add(added);
                   System.out.println("ADDED::"+added);   
            } 
          catch (FileNotFoundException ex)  {
             
        }
        }
    }//GEN-LAST:event_AddedActionPerformed

    private void SameFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SameFileActionPerformed
        // TODO add your handling code here:
        File dir1=new File(filename1);
        File dir2=new File(filename2);
      
        Compare compare = new Compare();
		try
		{
		compare.getDiff(dir1,dir2);
		}
		catch(IOException ie)
		{
                   System.out.println("Exception ");
                    
		}
        
    }//GEN-LAST:event_SameFileActionPerformed

    private void DeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedActionPerformed
        System.out.println("Deleted entered");
//        for(int i=0;i< identicalFile1.size();i++)
//        {
//            
//            String compV1=identicalFile1.get(i);
//            String compV2=identicalFile2.get(i);
//            System.out.println("Identical loop"+compV1+"/////////"+compV2);
//        
//         try 
//             {
//                  int flag=0;
//                  int delete=0;
//                  Scanner file1 = new Scanner(new FileReader(compV1));
//                     String line1=file1.nextLine();
//                     while(file1.hasNext())
//                  
//                      {
//                    Scanner file2 = new Scanner(new FileReader(compV2));
//                    String line2= file2.nextLine();
//                     while(file2.hasNext())
//                     {
//                         flag=0;
//                        if(line1.equals(line2)==true) flag=1;
//			//System.out.println(line2);
//                        	//System.out.println(line1);
//			line2=file2.nextLine();
//			// System.out.println("1");
//                          }
//                     if(flag==0)delete++;
//			line1=file1.nextLine();
//                 }
//                     delete_matrix.add(delete);
//                   System.out.println("DELETED"+delete);
for(int i=0;i< identicalFile1.size();i++){
             File compV1=new File(identicalFile1.get(i));
             File compV2=new File(identicalFile2.get(i));
             System.out.println(identicalFile1.get(i));
             System.out.println(identicalFile2.get(i));
             
        if(compV1!=null && compV2!=null){
            Modified c = new Modified(compV1 ,compV2);
            System.out.println("Changed lines are : " + c.GetDeletesLines());
            delete_matrix.add(c.GetDeletesLines());
        }
        } 
   
    }//GEN-LAST:event_DeletedActionPerformed

    private void CSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSVActionPerformed
        String userDir = System.getProperty("user.home");
        String csvFile =userDir+"/Desktop/Semester7/major-1/excel.csv";
        try{ 
            FileWriter writer = new FileWriter(csvFile);
    
System.out.println("CSVUTIL entered");

        //for header
        CSVUtils.writeLine(writer, Arrays.asList("FILE", "ADDED", "DELETED","LOC","MODIFIED","COMPLEXITY"));

        for (int i=0;i<identicalFile1.size();i++) {

            List<String> list = new ArrayList<>();
            list.add(identicalFile1.get(i));
            list.add(added_matrix.get(i).toString());
            list.add(String.valueOf(delete_matrix.get(i)));
            list.add(String.valueOf(loc_matrix.get(i)));
            list.add(String.valueOf(modified_matrix.get(i)));
            list.add(String.valueOf(complexity_matrix.get(i)));
            CSVUtils.writeLine(writer, list);

			//try custom separator and quote.
			//CSVUtils.writeLine(writer, list, '|', '\"');
        }

        writer.flush();
        writer.close();
        }
        catch(IOException e){
        }
        
    }//GEN-LAST:event_CSVActionPerformed
     public static int fileRead(File file){
         int count=0;
	try{
	    // Open the file that is the first
	    // command line parameter
            String input=file.toString();
	    FileInputStream fstream = new FileInputStream(input);
	    // Get the object of DataInputStream
	    DataInputStream in = new DataInputStream(fstream);
	        BufferedReader br = new BufferedReader(new InputStreamReader(in));
	    String strLine;
	    
	    int count2 = 0;
	    //Read File Line By Line
	    while((strLine = br.readLine())!= null ){
	    	if (strLine.trim().length() != 0){
	    		count++;
	    	}else{
	    		count2++;
	    	}
	    }
	    System.out.println("-------Lines Of COdes-------");
	    System.out.println("number of lines:" + count);
	    System.out.println("number of blank elines:" + count2);
	    //Close the input stream
	    in.close();
	    }catch (Exception e){//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }
        return count;
     }
    private void LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocActionPerformed
        // TODO add your handling code here:
        for(int i=0;i< identicalFile2.size();i++)
        {
       File locfile=new File(identicalFile2.get(i));
       System.out.println(identicalFile2.get(i));
       loc_matrix.add(fileRead(locfile));
       
        }
       
    }//GEN-LAST:event_LocActionPerformed
     
    private void ModifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifiedActionPerformed
        // TODO add your handling code here:
        for(int i=0;i< identicalFile1.size();i++)
        {
             File compV1=new File(identicalFile1.get(i));
             File compV2=new File(identicalFile2.get(i));
             System.out.println(identicalFile1.get(i));
             System.out.println(identicalFile2.get(i));
             
        if(compV1!=null && compV2!=null)
        {
            Modified c = new Modified(compV1 ,compV2);
            System.out.println("Changed lines are : " + c.GetChangedLines());
            modified_matrix.add(c.GetChangedLines());
        }
    }
    }//GEN-LAST:event_ModifiedActionPerformed

    private void ComplexityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplexityActionPerformed
        // TODO add your handling code here:
        Complexity cc = new Complexity();
        cc.showCyclomaticComplexity(cc.check());
    }//GEN-LAST:event_ComplexityActionPerformed

    /**
     * @param args the command line arguments
     */
	 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String userDir = System.getProperty("user.home");
        String csvFile =userDir+"/Desktop/rel_excel.csv";
        try{ 
            FileWriter writer = new FileWriter(csvFile);
    
System.out.println("CSVUTIL entered in relative churn");

        //for header
        CSVUtils.writeLine(writer, Arrays.asList("FILE", "ADDED", "DELETED","MODIFIED","COMPLEXITY"));

        for (int i=0;i<identicalFile1.size();i++) {

            List<String> list = new ArrayList<>();
            list.add(identicalFile1.get(i));
            double p=(float)(added_matrix.get(i))/(loc_matrix.get(i));
            list.add(String.valueOf(p));
            double x=(float)(delete_matrix.get(i))/(loc_matrix.get(i));
            list.add(String.valueOf(x));
            double q=(float)(modified_matrix.get(i))/(loc_matrix.get(i));
            list.add(String.valueOf(q));
            double r=(float)(complexity_matrix.get(i))/(loc_matrix.get(i));
            list.add(String.valueOf(r));
           
             CSVUtils.writeLine(writer, list);

			//try custom separator and quote.
			//CSVUtils.writeLine(writer, list, '|', '\"');
        }
        
        writer.flush();
        writer.close();
        }
        catch(IOException e){
        }
        
    }                                        

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }
   public static String extension = ".java";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Added;
    private javax.swing.JButton Browse1;
    private javax.swing.JButton Browse2;
    private javax.swing.JButton CSV;
    private javax.swing.JButton Complexity;
    private javax.swing.JButton Deleted;
    private javax.swing.JButton Loc;
    private javax.swing.JButton Modified;
    private javax.swing.JTextField Path1;
    private javax.swing.JTextField Path2;
    private javax.swing.JButton SameFile;
    private javax.swing.JLabel Version1;
    private javax.swing.JLabel Version2;
    // End of variables declaration//GEN-END:variables
  static ArrayList<Integer> added_matrix=new ArrayList<Integer>();
  static ArrayList<Integer> delete_matrix=new ArrayList<Integer>();
  static ArrayList<Integer> loc_matrix=new ArrayList<Integer>();
  static ArrayList<Integer> modified_matrix=new ArrayList<Integer>();
  static ArrayList<Integer> complexity_matrix=new ArrayList<Integer>();
String filename1;
String filename2;
}
