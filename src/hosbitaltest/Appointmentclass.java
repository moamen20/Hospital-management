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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;


/**
 *
 * @author Moamen 
 */
public class Appointmentclass  {
    
    Connection con=connect.connectdb();
    ResultSet rs=null;
    PreparedStatement pst=null;
    String[] tbdata = new String[4];
    Appointment_gui app=new Appointment_gui();
    
    
    protected void make_app(int pid,String did,String date,String time)
    {
       try{
          
       Statement stmt;
       stmt= con.createStatement();
       int idr =Receptionist.idrr;
       
       String sql1="Select ID from APP.PATIENT where ID ="+pid+"";
      rs=stmt.executeQuery(sql1);
      if(!rs.next()){
        JOptionPane.showMessageDialog( app, "PATIENT ID DOESN'T exists","Error", JOptionPane.ERROR_MESSAGE);
      // P_id.setText("");
       //P_id.requestDefaultFocus();
       return;
      }
            String sql= "insert into APP.APPOINTMENTS(ID_DOCTOR,ID_PATIENT,DATE,TIME,IDR)values('"+did+"',"+ pid+",'"+date+"','"+ time +"',"+ idr +")";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(app,"APPOINTMENT Successfully ","DOCTOR",JOptionPane.INFORMATION_MESSAGE);
            
 
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(app,ex);
        }
    }
    
    protected Vector<String[]> searchid_doctor(String id)
    {
        Vector<String[]> vec=new Vector<String[]>();
        int count=0;
      try {
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select * from APP.APPOINTMENTS where ID_DOCTOR ='"+id+"'";
            rs=stmt.executeQuery(sql1);
            while(rs.next()){
                count++;
                String DoctorID=String.valueOf(rs.getString("ID_DOCTOR"));
                String PatientID=String.valueOf(rs.getInt("ID_PATIENT"));
                String DATE=String.valueOf(rs.getString("DATE"));
                String TIME=String.valueOf(rs.getString("TIME"));
                tbdata[0]=DoctorID;
                tbdata[1]=PatientID;
                tbdata[2]=DATE;
                tbdata[3]=TIME;
                //String tbdata[]={PatientID,PatientName,Patientage,PatientTel};  
                vec.add(tbdata);
            } 
              if(count==0)
            {   
                JOptionPane.showMessageDialog(app,"Appointment doesn't exists","Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
           Logger.getLogger(PATINT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    
       
     protected Vector<String[]> searchid_Patient(int id)
    {
        Vector<String[]> vec = new Vector<String[]>();
        int count=0;
      try {
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select * from APP.APPOINTMENTS where ID_PATIENT ="+id+"";
            rs=stmt.executeQuery(sql1);
            while(rs.next()){
                count++;
                String DoctorID=String.valueOf(rs.getString("ID_DOCTOR"));
                String PatientID=String.valueOf(rs.getInt("ID_PATIENT"));
                String DATE=String.valueOf(rs.getString("DATE"));
                String TIME=String.valueOf(rs.getString("TIME"));
                tbdata[0]=DoctorID;
                tbdata[1]=PatientID;
                tbdata[2]=DATE;
                tbdata[3]=TIME;
                //String tbdata[]={PatientID,PatientName,Patientage,PatientTel};  
                vec.add(tbdata);
            } 
             if(count==0)
            {   
                JOptionPane.showMessageDialog(app,"Appointment doesn't exists","Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
           Logger.getLogger(PATINT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
}