/**
 * 
 */
package com.sanjay.cxf.data;

/**
 * @author Sanjay Mistry
 * 
 */
public class DramaBookType implements BookType {

    private String bookType;
    private String publisherName;

    public DramaBookType() {
        this.bookType = "Drama";
    }

    @Override
    public String getBookType() {
        return this.bookType;
    }
    
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

}
