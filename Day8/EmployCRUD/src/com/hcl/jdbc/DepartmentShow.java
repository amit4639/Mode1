package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentShow {
  /**
   * Showing Department details.
   * @param args for pasing arguments.
   */

  public static void main(String[] args) {
    Connection con = DaoConnection.getConnection();
    String cmd = "Select * from department";
    try {
      PreparedStatement pst = con.prepareStatement(cmd);
      ResultSet rs = pst.executeQuery();
      while (rs.next()) {
        System.out.println("Departmentno : " + rs.getInt("deptno"));
        System.out.println("Department Name : " + rs.getString("dname"));
        System.out.println("Location : " + rs.getString("loc"));
        System.out.println("Head : " + rs.getString("head"));
        System.out.println("-----------------------------");
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
