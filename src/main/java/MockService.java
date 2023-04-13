

public class MockService {

    private MockRepository mockRepository;
    private MockRepository mr;


    public MockService(MockRepository mockRepository) {
        this.mockRepository = mockRepository;
    }

    public int getLon(int time) {
        return mockRepository.getLon(time);
    }

    public int getLat(int time) {
        return mockRepository.getLat(time);
    }

    public String getWeather(int lon, int lat) {
        return mockRepository.getWeather(lon, lat);
    }

}
