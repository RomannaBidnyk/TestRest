import Util.PropertyManager
import bo.FilmBo
import org.testng.Assert
import org.testng.annotations.Test

class FilmTest {
    PropertyManager property = new PropertyManager("src/main/resources/config.properties");

    @Test(groups = '')
    void verifyYearOfFilm() {
        FilmBo filmBo = new FilmBo()
        String actualYear = filmBo.getFilmByTitle(property.getFilmTitle1()).getYear()
        Assert.assertEquals(actualYear, "1992", "wrong year")
    }

    @Test
    void verifyDurationOfFilm() {
        FilmBo filmBo = new FilmBo()
        String actualDuration = filmBo.getFilmByTitle(property.getFilmTitle1()).getRuntime()
        Assert.assertEquals(actualDuration, "103 min", "wrong duration")
    }

    @Test
    void verifyCountryOfFilm() {
        FilmBo filmBo = new FilmBo()
        String actualCountry = filmBo.getFilmByTitle(property.getFilmTitle1()).getCountry()
        Assert.assertEquals(actualCountry, "USA", "wrong country")
    }

    @Test
    void verifyImdbID() {
        FilmBo filmBo = new FilmBo()
        String actualImdbID = filmBo.getFilmByTitle(property.getFilmTitle1()).getImdbID()
        Assert.assertEquals(actualImdbID, "tt0103016", "wrong ImdbID")
    }

    @Test
    void verifyDirectorOfFilm() {
        FilmBo filmBo = new FilmBo()
        String actualDirector = filmBo.getFilmByTitle(property.getFilmTitle1()).getDirector()
        Assert.assertEquals(actualDirector, "Blake Edwards", "wrong Director")
    }
}
