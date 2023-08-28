package com.fssa.sharpandclean.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fssa.sharpandclean.model.User;
import com.fssa.sharpandclean.utils.ConnectionUtil;

public class UserDAO {
	
	

	// Add new user to DB - Register
	 public boolean register(User user) throws SQLException {
	        Connection connection =  ConnectionUtil.getConnection();
	        String query = "INSERT INTO User (email, userName, password, phoneNumber, type) VALUES ( ?, ?, ?, ?, ?)";
	        
	        try (PreparedStatement pmt = connection.prepareStatement(query)) {
	            // Set the userId during registration
	            pmt.setString(1, user.getEmail());
	            pmt.setString(2, user.getUsername());
	            pmt.setString(3, user.getPassword());
	            pmt.setString(4, user.getPhonenumber());
	            pmt.setString(5, user.getType());
	            int rows = pmt.executeUpdate();
	            return rows == 1;
	        }
	    }
	
	 // Method to check if a user with the given email exists in the database
    public boolean isEmailExists(String email) throws SQLException {
        String query = "SELECT * FROM User WHERE email = ?";
        try (Connection connection =  ConnectionUtil.getConnection();
             PreparedStatement pmt = connection.prepareStatement(query)) {
            pmt.setString(1, email);
            ResultSet rs = pmt.executeQuery();
            return rs.next(); // If a row is found, the email exists
        }
    }

    
 // Method to authenticate the user with the provided email and password
    public boolean login(User user, String email) throws SQLException {
        String query = "SELECT * FROM User WHERE email = ? AND password = ?";
        try (Connection connection =  ConnectionUtil.getConnection();
             PreparedStatement pmt = connection.prepareStatement(query)) {
            pmt.setString(1, email); // Use provided email for the query
            pmt.setString(2, user.getPassword());
            try (ResultSet rs = pmt.executeQuery()) {
                return rs.next(); // If a row is found, authentication is successful
            }
        }
    }


 // Update user information based on email
    public boolean updateUser(User user) throws SQLException {
        Connection connection =  ConnectionUtil.getConnection();
        String query = "UPDATE User SET username=?, phonenumber=? WHERE email=?";
        try (PreparedStatement pmt = connection.prepareStatement(query)) {
            pmt.setString(1, user.getUsername());
            pmt.setString(2, user.getPhonenumber());
            pmt.setString(3, user.getEmail());
            int rows = pmt.executeUpdate();
            return rows == 1;
        }
    }
    
    

 // Delete user based on email
    public boolean deleteUser(User user) throws SQLException {
        Connection connection =  ConnectionUtil.getConnection();
        
        String query = "UPDATE User SET isDeleted = ? WHERE email = ?";
        
        try (PreparedStatement pmt = connection.prepareStatement(query)) {
            pmt.setBoolean(1, true); // Set isDeleted to true to mark the user as deleted
            pmt.setString(2, user.getEmail());
            int rows = pmt.executeUpdate();
            return rows == 1;
        }
    }




	




	


}