/**
 * 
 */
package com.sanjay.cxf.service;

import org.springframework.beans.factory.FactoryBean;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Sanjay Mistry
 * 
 */
public class ObjectMapperFactoryBean implements FactoryBean<ObjectMapper> {

    @Override
    public ObjectMapper getObject() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enableDefaultTyping();
        return objectMapper;
    }

    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return false;
    }

}
