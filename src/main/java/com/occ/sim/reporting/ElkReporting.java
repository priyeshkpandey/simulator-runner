package com.occ.sim.reporting;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public class ElkReporting {

    private static final String ELK_HOST = "localhost";
    private static final String ELK_PORT = "8080";
    private static final String ELK_KEY = "emo_sim";

    public void post(String key, Double value) {
        try {
            HttpClient client = HttpClients.createDefault();
            final HttpPost postMethod = new HttpPost("http://" + ELK_HOST + ":" + ELK_PORT + "/" + ELK_KEY);
            final Stat stat = new Stat();
            final String json = new ObjectMapper().writeValueAsString(stat);
            final StringEntity entity = new StringEntity(json);
            postMethod.setEntity(entity);
            final HttpContext localContext = new BasicHttpContext();
            System.out.println("Sending to [" + postMethod.getURI() + "], body " + json);
            HttpResponse response = client.execute(postMethod, localContext);
            System.out.println("Response code : " + response.getStatusLine().getStatusCode() + " for " + postMethod.getURI());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
