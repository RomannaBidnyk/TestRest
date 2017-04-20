package model

import com.fasterxml.jackson.annotation.JsonProperty

class Ratings {
    @JsonProperty("Source")
    private String source
    @JsonProperty("Value")
    private String value

    String getSource() {
        return source
    }

    void setSource(String source) {
        this.source = source
    }

    String getValue() {
        return value
    }

    void setValue(String value) {
        this.value = value
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "source='" + source + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
