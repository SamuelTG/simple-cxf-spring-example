/**
 * 
 */
package com.sanjay.cxf.data;

/**
 * @author Sanjay Mistry
 * 
 */
public class GenericEnvelop<T> {

    private T data;

    public GenericEnvelop() {
    }

    public GenericEnvelop(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
