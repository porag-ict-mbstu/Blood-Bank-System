package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private DBCon getst=null;
    private Statement st=null;
    private ResultSet rs=null;
    private Connection con=null;
    public Task()
    {
        getst=new DBCon();
        con=getst.getCon();
        st=getst.getSt();
    }
    public int createBloodList()
    {
        int x=0;
        try{
            String sql="CREATE TABLE IF NOT EXISTS bloodlist(Name varchar(255),Amount varchar(255),PRIMARY KEY (Name))";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public int insertIntoBloodList(BloodListModel m)
    {
        int x=0;
        try{
            String sql="insert into bloodlist values('"+m.getBloodname()+"','"+m.getAmount()+"')";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public int updateBloodList(String amount,String name)
    {
        int x=0;
        try{
            String sql="update bloodlist set Amount='"+amount+"' where Name='"+name+"'";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public boolean checkBloodName(String name)
    {
        try{
            String sql="select *from bloodlist where Name='"+name+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                    return true;
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public String getAmount(String name)
    {
        String x="";
        try{
            String sql="select *from bloodlist where Name='"+name+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                x=rs.getString("Amount");
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        if(x.length()==0)x="0";
        return x;
    }
    
    public int clearTableList(String name)
    {
        int x=0;
        try{
            String sql="delete from "+name;
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public List<BloodListModel>readBloodList()
    {
        List<BloodListModel>L=new ArrayList<BloodListModel>();
        
        try{
            String sql="select *from bloodlist";
            
            rs=st.executeQuery(sql);
            
            while(rs.next())
            {
                BloodListModel m=new BloodListModel();
                m.setBloodname(rs.getString("Name"));
                m.setAmount(rs.getString("Amount"));
                L.add(m);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return L;
    }
    
    
    public int createDonorList()
    {
        int x=0;
        try{
            String sql="CREATE TABLE IF NOT EXISTS donorlist(NID varchar(255),Name varchar(255),Sex varchar(255),BloodGroup varchar(255),Address varchar(255),Phone varchar(255),Username varchar(255),Email varchar(255),Password varchar(255),PRIMARY KEY(NID))";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
           ex.printStackTrace();
        }
        return x;
    }
    
    public int insertIntoDonorList(DonorListModel m)
    {
        int x=0;
        try{
            String sql="insert into donorlist values('"+m.getNid()+"','"+m.getName()+"','"+m.getSex()+"','"+m.getBloodgroup()+"','"+m.getAddress()+"','"+m.getPhone()+"','"+m.getUsername()+"','"+m.getEmail()+"','"+m.getPassword()+"')";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public int updateDonorList(DonorListModel m)
    {
        int x=0;
        try{
            String sql="update donorlist set Name='"+m.getName()+"',Sex='"+m.getSex()+"',BloodGroup='"+m.getBloodgroup()+"',Address='"+m.getAddress()+"',Phone='"+m.getPhone()+"',Username='"+m.getUsername()+"',Email='"+m.getEmail()+"',Password='"+m.getPassword()+"' where NID='"+m.getNid()+"'";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    public int deleteDonorfromDonorList(String email,String pass)
    {
        int x=0;
        try{
            String sql="delete from donorlist where NID='"+email+"' and Password='"+pass+"'";
            st.executeUpdate(sql);
            x=1;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return x;
    }
    public boolean checkDonorNid(String nid)
    {
        try{
            String sql="select NID from donorlist where NID='"+nid+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                if(!rs.getString("NID").equals(""))
                    return true;
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean checkDonor(String nid,String email,String pass)
    {
        try{
            String sql="select *from donorlist where NID='"+nid+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                if(!rs.getString("NID").equals(nid)&&!rs.getString("Email").equals(email)&&!rs.getString("Password").equals(pass))
                    return true;
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean checkValidity(String email,String pass)
    {
        try{
            String sql="select NID from donorlist where Password='"+pass+"' and Password='"+pass+"'";
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                return true;
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    
    
    public List<DonorListModel>readDonor()
    {
        List<DonorListModel>L=new ArrayList<DonorListModel>();
        
        try{
            
            String sql="select *from donorlist";
            rs=st.executeQuery(sql);
            
            while(rs.next())
            {
                DonorListModel m=new DonorListModel();
                m.setNid(rs.getString("NID"));
                m.setName(rs.getString("Name"));
                m.setSex(rs.getString("Sex"));
                m.setBloodgroup(rs.getString("BloodGroup"));
                m.setAddress(rs.getString("Address"));
                m.setPhone(rs.getString("Phone"));
                m.setUsername("Not Showable");
                m.setEmail("Not Showable");
                m.setPassword("Not Showable");
                L.add(m);
                
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return L;
    }
}
