/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.mziuri.library.model;

import java.sql.Date;

/**
 *
 * @author lortkipanidze
 */
public class Book {

private int ID;        
private String name;
private int date;
private int score;
private String authorname;
    
    public Book() {
    }

    public Book(String name,int date,int score,int ID,String authorname) {
        this.name = name;
        this.date = date;
        this.score = score;
        this.ID = ID;
        this.authorname = authorname;
    }
    public int getID(){
        return ID;
        
    }
    public void setID(int id){
        this.ID = ID;
    }
    public String getAuthorName(){
        return authorname;
    }
    public void setAuthorName(String authorname){
        this.authorname =authorname;
    }
    
 public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Book{" +  ", name=" + name + ", date=" + date + ", score=" + score +  '}';
    }
}


