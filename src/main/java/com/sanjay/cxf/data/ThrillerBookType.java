/**
 * 
 */
package com.sanjay.cxf.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Sanjay Mistry
 * 
 */
@XmlRootElement(name = "ThrillerBookType")
public class ThrillerBookType implements BookType, Rating {

    @XmlElement
    private String scale;

    @XmlElement
    private String value;

    @XmlElement
    private String bookType;

    public ThrillerBookType() {
        this.scale = "10";
        this.value = "5";
        this.bookType = "Thriller";
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getScale() {
        return scale;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getBookType() {
        // TODO Auto-generated method stub
        return this.bookType;
    }

}
