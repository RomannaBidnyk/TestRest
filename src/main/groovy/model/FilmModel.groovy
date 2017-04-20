package model

import com.fasterxml.jackson.annotation.JsonProperty

class FilmModel {
    @JsonProperty("Title")
    private String title
    @JsonProperty("Year")
    private String year
    @JsonProperty("Rated")
    private String rated
    @JsonProperty("Released")
    private String released
    @JsonProperty("Runtime")
    private String runtime
    @JsonProperty("Genre")
    private String genre
    @JsonProperty("Director")
    private String director
    @JsonProperty("Writer")
    private String writer
    @JsonProperty("Actors")
    private String actors
    @JsonProperty("Plot")
    private String plot
    @JsonProperty("Language")
    private String language
    @JsonProperty("Country")
    private String country
    @JsonProperty("Awards")
    private String awards
    @JsonProperty("Poster")
    private String poster
    @JsonProperty("Ratings")
    private List<Ratings> ratings
    @JsonProperty("Metascore")
    private String metascore
    @JsonProperty("imdbRating")
    private String imdbRating
    @JsonProperty("imdbVotes")
    private String imdbVotes
    @JsonProperty("imdbID")
    private String imdbID
    @JsonProperty("Type")
    private String type
    @JsonProperty("DVD")
    private String dvd
    @JsonProperty("BoxOffice")
    private String boxOffice
    @JsonProperty("Production")
    private String production
    @JsonProperty("Website")
    private String website
    @JsonProperty("Response")
    private String response

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getYear() {
        return year;
    }

    void setYear(String year) {
        this.year = year;
    }

    String getRated() {
        return rated;
    }

    void setRated(String rated) {
        this.rated = rated;
    }

    String getReleased() {
        return released;
    }

    void setReleased(String released) {
        this.released = released;
    }

    String getRuntime() {
        return runtime;
    }

    void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    String getGenre() {
        return genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    String getDirector() {
        return director;
    }

    void setDirector(String director) {
        this.director = director;
    }

    String getWriter() {
        return writer;
    }

    void setWriter(String writer) {
        this.writer = writer;
    }

    String getActors() {
        return actors;
    }

    void setActors(String actors) {
        this.actors = actors;
    }

    String getPlot() {
        return plot;
    }

    void setPlot(String plot) {
        this.plot = plot;
    }

    String getLanguage() {
        return language;
    }

    void setLanguage(String language) {
        this.language = language;
    }

    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String getAwards() {
        return awards;
    }

    void setAwards(String awards) {
        this.awards = awards;
    }

    String getPoster() {
        return poster;
    }

    void setPoster(String poster) {
        this.poster = poster;
    }

    List<Ratings> getRatings() {
        return ratings
    }

    void setRatings(List<Ratings> ratings) {
        this.ratings = ratings
    }

    String getMetascore() {
        return metascore;
    }

    void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    String getImdbRating() {
        return imdbRating;
    }

    void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    String getImdbVotes() {
        return imdbVotes;
    }

    void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    String getImdbID() {
        return imdbID;
    }

    void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    String getDvd() {
        return dvd;
    }

    void setDvd(String dvd) {
        this.dvd = dvd;
    }

    String getBoxOffice() {
        return boxOffice;
    }

    void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    String getProduction() {
        return production;
    }

    void setProduction(String production) {
        this.production = production;
    }

    String getWebsite() {
        return website;
    }

    void setWebsite(String website) {
        this.website = website;
    }

    String getResponse() {
        return response;
    }

    void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "FilmModel{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", released='" + released + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actors='" + actors + '\'' +
                ", plot='" + plot + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", awards='" + awards + '\'' +
                ", poster='" + poster + '\'' +
                ", ratings=" + ratings +
                ", metascore='" + metascore + '\'' +
                ", imdbRating='" + imdbRating + '\'' +
                ", imdbVotes='" + imdbVotes + '\'' +
                ", imdbID='" + imdbID + '\'' +
                ", type='" + type + '\'' +
                ", dvd='" + dvd + '\'' +
                ", boxOffice='" + boxOffice + '\'' +
                ", production='" + production + '\'' +
                ", website='" + website + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
