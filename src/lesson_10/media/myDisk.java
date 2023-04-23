package lesson_10.media;

public class myDisk {
    private String name;
    private int year;

    public myDisk() {
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Disk{" + "name='" + name + '\'' + ", year=" + year + "}";
    }

}
