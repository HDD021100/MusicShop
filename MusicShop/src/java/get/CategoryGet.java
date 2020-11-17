/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package get;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author NguyenDang
 */
public class CategoryGet {
    public ArrayList<Category> getListCategory() throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM musicshop.category";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList<>();
        while (rs.next()) {
            Category category = new Category();
            category.setCategoryID(rs.getLong("category_id"));
            category.setCategoryName(rs.getString("category_name"));
            list.add(category);
        }
        return list;
    }
    
    
    public Category getCategory(long categoryID) throws SQLException {
        Connection connection = DBConnect.getConnecttion();
        String sql =  "SELECT * FROM musicshop.category WHERE category_id = '" + categoryID + "'";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Category category = new Category();
        while (rs.next()) {
            category.setCategoryID(rs.getLong("category_id"));
            category.setCategoryName(rs.getString("category_name"));
        }
        return category;
    }
    

public boolean insert(Category c) throws SQLException {
    try {
         Connection connection = DBConnect.getConnecttion();
         String sql = "INSERT INTO musicshop.category VALUE(?,?)";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setLong(1, c.getCategoryID());
         ps.setString(2, c.getCategoryName());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (Exception e) {
         return false;
    }
}

public boolean update(Category c) throws SQLException {
    try {
         Connection connection = DBConnect.getConnecttion();
         String sql = "UPDATE musicshop.category SET category_name = ? WHERE category_id = ?";
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setString(1, c.getCategoryName());
         ps.setLong(2, c.getCategoryID());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (Exception e) {
         return false;
    }
}

public boolean delete(long category_id) throws SQLException {
    try {
        Connection connection = DBConnect.getConnecttion();
        String sql = "DELETE FROM musicshop.category WHERE category_id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, category_id);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (Exception e) {
        return false;
    }
}
 public boolean insertCategory(Category c) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO musicshop.category VALUES(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, c.getCategoryID());
            ps.setString(2, c.getCategoryName());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // cập nhật dữ liệu
    public boolean updateCategory(Category c) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "UPDATE musicshop.category SET category_name = ? WHERE category_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, c.getCategoryName());
            ps.setLong(2, c.getCategoryID());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // xóa dữ liệu
    public boolean deleteCategory(long category_id) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "DELETE FROM musicshop.category WHERE category_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, category_id);
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    public static void main(String[] args)throws SQLException {
        CategoryGet get = new CategoryGet();
        for(Category ds : get.getListCategory()){
        System.out.println(ds.getCategoryID() + " - "+ds.getCategoryName());
        }
    }
    
    
}
