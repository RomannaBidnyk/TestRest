package Util

class PropertyManager {
    private Properties properties;

    PropertyManager(String path) {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getFilmTitle1() {
        return properties.getProperty("filmTitle1");
    }
}
