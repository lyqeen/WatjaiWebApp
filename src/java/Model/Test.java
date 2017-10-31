/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
       
        HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead 

        
            HttpPost request = new HttpPost("http://watjai.me:3000/patients");
            
            StringEntity params = 
                    new StringEntity(("{\"patFirstName\":\"okdf\","
                            + "\"patLastName\":\"สนธยา\","
                            + "\"birthDay\":\"2537-05-06\","
                            + "\"address\":\"59/45\","
                            + "\"subDistrict\":\"ประชาอุทิศ\","
                            + "\"district\":\"บางมด\","
                            + "\"province\":\"กรุงเทพมหานคร\","
                            + "\"patTel\":\"0858388229\","
                            + "\"bloodType\":\"O\","
                            + "\"docId\":\"DO1708001\","
                            + "\"underlyingDisease\":\"ภูมิแพ้ หืดหอบ\","
                            + "\"patPic\":\"SLKDJFSI\"}"),
                "UTF-8");
               
            
            request.setEntity(params);
            HttpResponse response = httpClient.execute(request);
            System.out.println(response);
            // handle response here...
       
    }
    
  
}


