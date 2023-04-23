package lesson_10.media;

public class myVideoDisk extends myDisk {
    // класс фильмов (название, год выхода, студия издатель, режиссер, продолжительность в минутах)
    private String producer;
    private String director;
    private int minutesCount;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setMinutesCount(int minutesCount) {
        this.minutesCount = minutesCount;
    }


}
