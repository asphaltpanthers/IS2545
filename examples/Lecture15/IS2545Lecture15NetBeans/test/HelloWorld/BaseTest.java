/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorld;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author AsphaltPanthers
 */
public class BaseTest {
    public final String baseURI = "http://demo3192753.mockable.io/";
    public final CloseableHttpClient client = HttpClients.createDefault();
    
    public <T> T responseToEntity(CloseableHttpResponse response, Class<T> type) throws IOException {
        Gson gson = new GsonBuilder().setDateFormat("MM/dd/yyyy").create();
        return gson.fromJson(EntityUtils.toString(response.getEntity(), "UTF-8"), type);
    }
}
