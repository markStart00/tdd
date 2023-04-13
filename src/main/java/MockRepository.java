

public interface MockRepository {

    public int getLon(int time);
    public int getLat(int time);
    public String getWeather(int lon, int lat);


}
