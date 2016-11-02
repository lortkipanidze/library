
package ge.mziuri.library.Dao;

import java.sql.Date;
import ge.mziuri.library.Dao.BookImpl;
import ge.mziuri.library.model.Book;
import java.util.List;
   


public interface BookDao {
    void addBook(Book Book);
    void deleteBook(int id);
    List<Book> getBookByYear(int Date);
    
    void closeConnection();
}
