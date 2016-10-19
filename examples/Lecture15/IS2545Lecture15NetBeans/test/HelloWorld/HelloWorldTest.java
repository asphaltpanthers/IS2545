/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import HelloWorld.Entity.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author AsphaltPanthers
 */
public class HelloWorldTest extends BaseTest {
    @Test
    public void getPeopleTest() throws URISyntaxException, IOException {
        URI uri = new URI(baseURI + "api/person");
        HttpGet get = new HttpGet(uri);
        CloseableHttpResponse response = client.execute(get);
        
        assertEquals(200, response.getStatusLine().getStatusCode());
        
        Person[] people = responseToEntity(response, Person[].class);
        assertEquals("Joe", people[0].firstName);
    }
    
    @Test
    public void getPersonHappyPathTest() throws URISyntaxException, IOException {
        URI uri = new URI(baseURI + "api/person/joe");
        HttpGet get = new HttpGet(uri);
        CloseableHttpResponse response = client.execute(get);
        
        assertEquals(200, response.getStatusLine().getStatusCode());
        
        Person person = responseToEntity(response, Person.class);
        assertEquals("Joe", person.firstName);
    }
    
    @Test
    public void getPersonSadPathTest() throws URISyntaxException, IOException {
        URI uri = new URI(baseURI + "api/person/sally");
        HttpGet get = new HttpGet(uri);
        CloseableHttpResponse response = client.execute(get);
        
        assertEquals(404, response.getStatusLine().getStatusCode());
        
        assertEquals("No person exists with specified name.", EntityUtils.toString(response.getEntity(), "UTF-8"));
    }
    
    @Test
    public void createPerson() throws URISyntaxException, IOException {
        URI uri = new URI(baseURI + "api/person");
        HttpPost post = new HttpPost(uri);
        
        Person person = new Person();
        person.firstName = "Sally";
        person.lastName = "Smith";
        person.age = 25;
        person.married = false;
        person.birthDate = new Date();
        
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyyy").create();
        String json = gson.toJson(person);
        
        post.setEntity(new StringEntity(json));
        
        CloseableHttpResponse response = client.execute(post);
        
        assertEquals(201, response.getStatusLine().getStatusCode());
        
        assertEquals("Person creation success!", EntityUtils.toString(response.getEntity(), "UTF-8"));
    }
}
