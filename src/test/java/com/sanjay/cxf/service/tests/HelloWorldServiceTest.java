package com.sanjay.cxf.service.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sanjay.cxf.data.Book;
import com.sanjay.cxf.data.DramaBookType;
import com.sanjay.cxf.data.GenericEnvelop;
import com.sanjay.cxf.data.ThrillerBookType;
import com.sanjay.cxf.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/service-definition-beans-test.xml" })
public class HelloWorldServiceTest {

    @Autowired
    @Qualifier("helloWorldClient")
    private HelloWorldService helloWorldClient;

    @Test
    public void helloWorldClientTest() {
        String echo = "" + System.currentTimeMillis();
        String actual = helloWorldClient.echo(echo);
        Assert.assertEquals(echo + "-echoed", actual);
    }

    @Test
    public void helloBookTestThriller() {
        Book book = helloWorldClient.getBook(1001);
        Assert.assertNotNull(book);
        Assert.assertEquals("Name", book.getName());

        DramaBookType bookTypeDrama2 = (DramaBookType) book.getBookTypeDrama();
        Assert.assertEquals("publisherName2", bookTypeDrama2.getPublisherName());
        
        ThrillerBookType thrillerBookType = (ThrillerBookType) book.getBookType();
        Assert.assertEquals("100", thrillerBookType.getScale());
        Assert.assertEquals("ThrillerShort", thrillerBookType.getBookType());
        Assert.assertEquals("75", thrillerBookType.getValue());
    }

    @Test
    public void helloBookTestDrama() {
        Book book = helloWorldClient.getBook(1007);
        Assert.assertNotNull(book);
        Assert.assertEquals("Name", book.getName());

        DramaBookType bookType = (DramaBookType) book.getBookType();
        Assert.assertEquals("Drama", bookType.getBookType());
        Assert.assertEquals("publisherName", bookType.getPublisherName());
    }

    @Test
    public void helloGenericBookTest() {
        GenericEnvelop<Book> genericEnvelop = helloWorldClient.getGenericBook(1002);
        Book book = genericEnvelop.getData();
        Assert.assertNotNull(book);
        Assert.assertEquals("Name", book.getName());
    }

    
}
