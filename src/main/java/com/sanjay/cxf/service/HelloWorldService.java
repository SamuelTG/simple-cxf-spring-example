/**
 * 
 */
package com.sanjay.cxf.service;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sanjay.cxf.data.Book;
import com.sanjay.cxf.data.GenericEnvelop;

/**
 * @author Sanjay Mistry
 * 
 */
@Path("/helloservice/")
public interface HelloWorldService {

    @GET
    @Path("/echo/{echo}/")
    String echo(@PathParam("echo") String echo);

    @POST
    @Path("/book/{id}/")
    @Produces("application/json")
    Book getBook(@PathParam("id") long id);

    @POST
    @Path("/genericbook/{id}/")
    @Produces("application/json")
    public GenericEnvelop<Book> getGenericBook(@PathParam("id")long id);


}
