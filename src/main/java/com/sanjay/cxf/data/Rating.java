package com.sanjay.cxf.data;


//@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface Rating {

    String getScale();
    
    String getValue();
    
}
