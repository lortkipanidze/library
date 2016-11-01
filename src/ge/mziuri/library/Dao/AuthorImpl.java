
package ge.mziuri.library.Dao;

import ge.mziuri.library.metainfo.DatabaseMetaInfo;
import ge.mziuri.library.model.Author;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AuthorImpl implements AuthorDao {
      private Connection con;
    
    private PreparedStatement pstmt;
      
    public AuthorImpl() {
        try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(DatabaseMetaInfo.databaseURL, DatabaseMetaInfo.username, DatabaseMetaInfo.passsword);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }}

   @Override
     public void addAuthor(Author author){
         try {
            pstmt = con.prepareStatement("INSERT INTO author (id,firstname,lastname ,country) VALUES (?,?,?);");
           pstmt.setString(1,author.getFirstname());
             pstmt.setString(2, author.getLastname());
               pstmt.setString(3, author.getCountry());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     

    @Override
    public void deleteAuthor(int authorid) {
            try {
            pstmt = con.prepareStatement("DELETE FROM author WHERE id = ?");
            pstmt.setInt(1, authorid);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }

   // @Override
  /*  public List<Author> sortAuthors() {
        List<Author> authors = new ArrayList<>();
        try {
            pstmt = con.prepareStatement("SELECT * FROM author ");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lasttname");
                String country = rs.getString("country");
               Author author = new  Author(id, firstname, lastname, country);
                authors.add(author);
                
            } 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return citie;
    }*/

    @Override
    public void closeConnection() {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }

}