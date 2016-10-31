
package ge.mziuri.library.Dao;

import java.util.List;


public interface Author {
      void addAuthor(Author author);
    
    void deleteAuthor(int authorId);
    
    List<Author> sortAuthors();
}
