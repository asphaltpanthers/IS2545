/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 *
 * @author AsphaltPanthers
 */
public class TestThread implements Runnable {
    private Thread t;
    private final CloseableHttpClient _client;
    private final HttpPost _post;
    
    public TestThread(CloseableHttpClient client, HttpPost post) {
        _client = client;
        _post = post;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                _client.execute(_post);
                Thread.sleep(50);
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}
