package bo

import model.FilmModel
import service.JerseyClient

class FilmBo {
    static FilmModel getFilmByTitle(String title){
        JerseyClient jerseyClient = new JerseyClient()
        return jerseyClient.getFilmByTitle(title)
    }
}
