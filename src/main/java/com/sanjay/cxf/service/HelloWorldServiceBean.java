/**
 * 
 */
package com.sanjay.cxf.service;

import com.sanjay.cxf.data.Book;
import com.sanjay.cxf.data.DramaBookType;
import com.sanjay.cxf.data.GenericEnvelop;
import com.sanjay.cxf.data.ThrillerBookType;

/**
 * @author Sanjay Mistry
 * 
 */

public class HelloWorldServiceBean implements HelloWorldService {

    @Override
    public String echo(String echo) {
        System.out.println("Echo : " + echo);
        return echo + "-echoed";
    }

    @Override
    public Book getBook(long id) {
        System.out.println("Request for Book with id:" + id);
        Book book = new Book();
        book.setId(id);
        book.setName("Name");

        DramaBookType dramaBookType2 = new DramaBookType();
        dramaBookType2.setPublisherName("publisherName2");
        book.setBookTypeDrama(dramaBookType2);
        
        if (id < 1006) {
            ThrillerBookType tBookType = new ThrillerBookType();
            tBookType.setScale("100");
            tBookType.setBookType("ThrillerShort");
            tBookType.setValue("75");
            book.setBookType(tBookType);
        } else {
            DramaBookType dramaBookType = new DramaBookType();
            dramaBookType.setPublisherName("publisherName");
            book.setBookType(dramaBookType);

        }
        return book;
    }

    @Override
    public GenericEnvelop<Book> getGenericBook(long id) {
        Book book = this.getBook(id);
        GenericEnvelop<Book> genericEnvelop = new GenericEnvelop<Book>(book);
        return genericEnvelop;
    }

}
