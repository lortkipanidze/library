
package ge.mziuri.library.model;


public class Author {
     private int id;

   private String firstname;
     private String lastname;
       private String country;
        
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author(String firstname, String lastname, String country, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.id = id;
    }

    public Author() {
    }
     @Override
    public String toString() {
        return "City{" + "id=" + id + ", firstname=" + firstname + ", lastname=" +lastname +  ", country=" + country+ '}';
    }
    
}
