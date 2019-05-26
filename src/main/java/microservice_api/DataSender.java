package microservice_api;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class DataSender {

    //fixme change to original link
    private static final String MICROSERVICE_URL = "test";

    public void sendJsonData(String json){
        HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead

        try {

            HttpPost request = new HttpPost(MICROSERVICE_URL);
            StringEntity params =new StringEntity(json);
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);

            //handle response here...

        }catch (Exception ex) {

            ex.printStackTrace();

        }


    }
}


