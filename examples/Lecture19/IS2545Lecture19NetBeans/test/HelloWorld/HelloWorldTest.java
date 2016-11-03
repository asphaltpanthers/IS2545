/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.client.methods.HttpPost;
import org.junit.Test;

/**
 *
 * @author AsphaltPanthers
 */
public class HelloWorldTest extends BaseTest {
    @Test
    public void sendMessageTest() throws URISyntaxException, UnsupportedEncodingException, InterruptedException {
        URI uri = new URI(baseURI + "chat/post/HelloFromDISER");
        HttpPost post = new HttpPost(uri);
        
        int numUsers = 2;
        for (int i = 1; i <= numUsers; i++) {
            TestThread user = new TestThread(client, post);
            user.start();
        }
        Thread.sleep(Long.MAX_VALUE);
    }
}
