/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Author;
import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {

    private String caption; //zagolovok knigi
    private Author[] author; //odin ili neskolko avtorov knigi
    private int publishedYear; //god publikacii
            
    public Book() {
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "caption=" + caption 
                + ", \n author=" + Arrays.toString(author) 
                + ", \n publishedYear=" + publishedYear + '}';
    }
    
    
}
