
package ge.mziuri.library.Dao;

import ge.mziuri.library.model.Author;



public interface AuthorDao {
      void addAuthor(Author author);
    
    void deleteAuthor(int authorId);
   
      
void closeConnection();
}
