/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hosbitaltest;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Examineclass {
    
    Connection con=connect.connectdb();
    ResultSet rs=null;
    PreparedStatement pst=null;
    String[] tbdata = new String[4];
    Examine_gui exm=new Examine_gui(); 
    
    
     protected void Save_examine(int idp,String idD,String medc,String state)
    {
      try{
          
       Statement stmt;
       stmt= con.createStatement();
       
      String sql1="Select ID_PATIENT from APP.APPOINTMENTS where ID ="+idp+"";
      rs=stmt.executeQuery(sql1);
      if(!rs.next()){
        JOptionPane.showMessageDialog( exm, "PATIENT DOESN'T exists in Appointments","Error", JOptionPane.ERROR_MESSAGE);
       return;
      }
            String sql= "insert into APP.EXAMINE(DOCTOR_ID,PATIENT_ID,DRUGS,STATE)values('"+idD+"',"+ idp+",'"+ medc+"','" + state + "')";
 
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(exm,"Successfully Saved","DOCTOR",JOptionPane.INFORMATION_MESSAGE);
            
 
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(exm,ex);
        }
    }
    
    protected Vector<String[]> searchid_Patient(int id)
    {
        Vector<String[]>vec=new Vector<String[]>();
      try {
          int count=0;
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select * from APP.EXAMINE where PATIENT_ID ="+id+"";
            rs=stmt.executeQuery(sql1);
            while(rs.next()){
                count++;
                String DoctorID=String.valueOf(rs.getString("DOCTOR_ID"));
                String PatientID=String.valueOf(rs.getInt("PATIENT_ID"));
                String DRUGS=String.valueOf(rs.getString("DRUGS"));
                String STATE=String.valueOf(rs.getString("STATE"));
                tbdata[0]=DoctorID;
                tbdata[1]=PatientID;
                tbdata[2]=DRUGS;
                tbdata[3]=STATE;
                vec.add(tbdata);
            } 
            if(count==0)
            {   
                JOptionPane.showMessageDialog(exm,"Examination doesn't exists","Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
           Logger.getLogger(PATINT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    
    protected Vector<String[]> searchid_doctor(String id)
    {
      Vector<String[]> vec= new Vector<String[]>();
      try {
          int count=0;
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select * from APP.EXAMINE where DOCTOR_ID ='"+id+"'";
            rs=stmt.executeQuery(sql1);
            while(rs.next()){
                count++;
                String DoctorID=String.valueOf(rs.getString("DOCTOR_ID"));
                String PatientID=String.valueOf(rs.getInt("PATIENT_ID"));
                String DRUGS=String.valueOf(rs.getString("DRUGS"));
                String STATE=String.valueOf(rs.getString("STATE"));
                tbdata[0]=DoctorID;
                tbdata[1]=PatientID;
                tbdata[2]=DRUGS;
                tbdata[3]=STATE;
                //String tbdata[]={PatientID,PatientName,Patientage,PatientTel};  
                vec.add(tbdata);
            } 
              if(count==0)
            {   
                JOptionPane.showMessageDialog(exm,"Appointment doesn't exists","Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
           Logger.getLogger(PATINT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    
    protected String show_state(int idstate)
    {
        String state = null;
         try {
            
            Statement stmt;
            stmt= con.createStatement();
           
            String sql1="Select * from APP.EXAMINE where PATIENT_ID ="+idstate+"";
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
               state=String.valueOf(rs.getString("STATE"));
                
                                
            }
            else
            {JOptionPane.showMessageDialog( exm, "Doctor doesn't exists","Error", JOptionPane.ERROR_MESSAGE);
            }
            
                                         
            }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(exm,ex);
        }
         return state;
    }
}