
package ge.mziuri.library.runner;

import ge.mziuri.library.Dao.AuthorDao;
import ge.mziuri.library.Dao.AuthorImpl;
import ge.mziuri.library.model.Author;

public class AutorRunner {
     AuthorDao abc =new AuthorImpl();
      Author author1 = new Author( "ფრედერიკ" ,"ბეგბედერი", "საფრანგეთი,",1);
     abc.addAuthor(author1);
     abc.deleteAuthor(4);
     
     
     
}