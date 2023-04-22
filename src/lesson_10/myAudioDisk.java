package lesson_10;

public class myAudioDisk  extends myDisk{
    // класс музыкальных альбомов (название альбома, исполнитель, год издания, количество треков)
    private String signer;
    private int tracksCount;
    public myAudioDisk() {
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public void setTracksCount(int tracksCount) {
        this.tracksCount = tracksCount;
    }

    public String getSigner() {
        return signer;
    }

    public int getTracksCount() {
        return tracksCount;
    }
}
