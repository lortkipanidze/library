
package ge.mziuri.library.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ge.mziuri.library.metainfo.DatabaseMetaInfo;
import ge.mziuri.library.metainfo.ProjectMetaInfo;
import ge.mziuri.library.exceptions.LibraryException;
import ge.mziuri.library.model.Author;
import ge.mziuri.library.model.Book;

import java.sql.Date;


public class BookImpl implements BookDao{
    
       
      private Connection con;
    
    private PreparedStatement pstmt;
     
    
    public BookImpl() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(DatabaseMetaInfo.databaseURL, DatabaseMetaInfo.username, DatabaseMetaInfo.passsword);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

        @Override
    public void addBook(Book Book) {
         try {
            pstmt = con.prepareStatement("INSERT INTO book (id,name,date,score,authorname) VALUES (?,?,?,?,?) where 0<score<100");
            pstmt.setInt(1, Book.getID());
            pstmt.setString(2, Book.getName());
            pstmt.setInt(3, Book.getDate());
            pstmt.setInt(4, Book.getScore());
            pstmt.setString(5, Book.getAuthorName());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        @Override
    public void deleteBook(int id) {
       try {
            pstmt = con.prepareStatement("DELETE FROM book WHERE id = ?;");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        @Override
    public List<Book> getBookByYear(int Date) {
     List<Book> books = new ArrayList<>();
     Book book=null;
        try {
            pstmt = con.prepareStatement("SELECT * FROM book where date= ?;");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                int score= rs.getInt("score");
                String authorname = rs.getString("authorname");
                int ID=rs.getInt("ID");
                //book= new Book(name,Date,score/*,id*/,authorname);
                book= new Book(name,Date,score,ID,authorname);
                books.add(book);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return  books;
    }


    @Override
    public void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}