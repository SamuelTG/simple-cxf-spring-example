package com.sanjay.cxf.data;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Book")
public class Book {

    private long id;
    private String name;
    
    private Object bookTypeDrama;
    public Object getBookTypeDrama() {
        return bookTypeDrama;
    }
    public void setBookTypeDrama(Object bookTypeDrama) {
        this.bookTypeDrama = bookTypeDrama;
    }
    
    private BookType bookType;
    public BookType getBookType() {
        return bookType;
    }
    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
