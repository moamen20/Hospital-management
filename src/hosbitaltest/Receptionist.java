/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hosbitaltest;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Receptionist extends Users{
     static int idrr=1;
    
    @Override
    protected void add_user(String name,String code,String tele)
    { Reception_gui rec=new Reception_gui();
         try{
          
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select NAME from APP.RECIPTIONIST where NAME ='"+name+"'";
             rs=stmt.executeQuery(sql1);
             if(rs.next())
             {
             JOptionPane.showMessageDialog( rec, "username already exists","Error", JOptionPane.ERROR_MESSAGE);
             return;
            }
       
            String sql= "insert into APP.RECIPTIONIST(NAME,PASSCODE,TEL)values('"+name+"','"+code+"',"+ tele+")";
 
 
            pst=con.prepareStatement(sql);
            pst.execute();
           
            JOptionPane.showMessageDialog(rec,"Successfully Registered ","RECPTIONIST",JOptionPane.INFORMATION_MESSAGE);
            
            
 
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(rec,ex);
        }
         
    }
    
    @Override
     protected void login_user(String name,String code){
     Reception_gui res=new Reception_gui();
        try {
        Statement stmt;
        stmt= con.createStatement();
        String sql1="Select PASSCODE,NAME from APP.RECIPTIONIST where PASSCODE ='"+code+"'"+" AND NAME='"+name+"'";
        rs=stmt.executeQuery(sql1);
        if(rs.next())
        {
           
            new Reception_gui().setVisible(true);
            
        }
        else
        {
            JOptionPane.showMessageDialog( res, "RECIPTIONIST's username or passcode is wrong","Error", JOptionPane.ERROR_MESSAGE);
          
        }
        } catch (SQLException ex) {
            Logger.getLogger(Maindoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
