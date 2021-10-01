/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

/**
 *
 * @author pupil
 */
public class Application {
    Book book;
    
    public Application() {
        
    }
    
    public void run(){
        //System.out.println("Hello!");
        
        //VOINA I MIR
        Book book1 = new Book();
        book1.setCaption("Voina i mir");
        //sozdajom massiv dlja vnesenija avtora
        //initiate
        Author author1 = new Author();
        author1.setName("Lev");
        author1.setLastname("Tolstoy");
        author1.setYear(1828);
        author1.setMonth(9);
        author1.setDay(9);
        Author[] authors = new Author[1]; // massiv with cells stolko skolko avtorov u knigi
        authors[0] = author1; //pomestili avtora v cell
        //otpravljaem massiv v book1
        book1.setAuthor(authors);
        book1.setPublishedYear(2005);
        
        //OTSY I DETI
        Book book2 = new Book();
        book2.setCaption("Otsy i deti");
        //sozdajom massiv dlja vnesenija avtora
        //initiate
        Author author2 = new Author();
        author2.setName("Ivan");
        author2.setLastname("Turgenev");
        author2.setYear(1818);
        author2.setMonth(11);
        author2.setDay(9);
        Author[] authors2 = new Author[1]; // initiate massiv with cells stolko skolko avtorov u knigi
        authors2[0] = author2; //pomestili avtora v cell massiva authors2
        //otpravljaem massiv v book1
        book2.setAuthor(authors2);
        book2.setPublishedYear(2006);
        
        
        //READER
        Reader reader1 = new Reader();
        reader1.setFirstname("Ivan");
        reader1.setLastname("Ivanov");
        reader1.setPhone("55933888");
    }
    
}
