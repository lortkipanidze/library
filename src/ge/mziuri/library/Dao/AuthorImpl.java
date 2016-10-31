
package ge.mziuri.library.Dao;

import ge.mziuri.library.metainfo.DatabaseMetaInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class AuthorImpl implements Author {
      private Connection con;
    
    private PreparedStatement pstmt;
      
    public AuthorImpl() {
        try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(DatabaseMetaInfo.databaseURL, DatabaseMetaInfo.username, DatabaseMetaInfo.passsword);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

    @Override
    public void addAuthor(Author author) {
         try {
            pstmt = con.prepareStatement("INSERT INTO city (firstname,lastname ,country) VALUES (?,?,?);");
            pstmt.setString(1, author.get());
            pstmt.seString(2, author.getPopulatio());
            
            pstmt.setInt(3, author.getCountry_id());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteAuthor(int authorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Author> sortAuthors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
