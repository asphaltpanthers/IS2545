/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import HelloWorld.Entity.Person;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
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
}
