package service

import com.fasterxml.jackson.core.JsonGenerationException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import model.FilmModel

class JacksonParser {
    private FilmModel parseFromJson(String stringToParse) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            FilmModel film = mapper.readValue(stringToParse, FilmModel.class)
            return film
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




