package service

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.ClientResponse
import com.sun.jersey.api.client.WebResource
import model.FilmModel

class JerseyClient {
    static FilmModel getFilmByTitle(String title) {
        try {
            Client client = Client.create()
            WebResource webResource = client
                    .resource(String.format("http://www.omdbapi.com/?t=%s&plot=full", title))
            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class)
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus())
            }
            String output = response.getEntity(String.class)
            JacksonParser obj = new JacksonParser()
            return obj.parseFromJson(output)
        } catch (Exception e) {
            e.printStackTrace()
        }
    }
}
