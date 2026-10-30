package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbConnection.DatabaseConnection;
import model.Seller;

public class SellerDao {
	public static void createSeller(Seller u) {
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "insert into seller(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			// executeUpdate -> DML(insert,update,delete)
			// executeQuery -> DQL(select)
			pst.executeUpdate();
			System.out.println("data inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "select * from seller where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static Seller loginUser(Seller u) {
		Seller u1 = null;
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "select * from seller where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getEmail());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u1 = new Seller();
				u1.setId(rs.getInt("id"));
				u1.setName(rs.getString("name"));
				u1.setContact(rs.getLong("contact"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				u1.setPassword(rs.getString("password"));
				System.out.println("user ->" + u1);
			} else {
				System.out.println("password is wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u1;
	}

	public static void updateSeller(Seller u) {
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "update seller set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getName());
			pst.setLong(2, u.getContact());
			pst.setString(3, u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setInt(5, u.getId());
			pst.executeUpdate();
			System.out.println("data updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkOldPassword(int id, String pass) {
		boolean flag = false;
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "select * from seller where id=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePassword(int id, String pass) {
		try {
			Connection conn = DatabaseConnection.createConnection();
			String sql = "update seller set password=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, pass);
			pst.setInt(2, id);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
