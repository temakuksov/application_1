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

    public static void listOfDisks (myDisk[] disks){
        System.out.println("Коллекция дисков:");
        for (myDisk diskFromBox : disks) {
            if (diskFromBox != null) {
                System.out.println(diskFromBox.toString());
            }
        }
    }
    public static myDisk minYearDisk(myDisk[] disks) {
        myDisk mYrDisk = disks[0];
        for (myDisk eachDisk : disks) {
            if (eachDisk != null) {
                if (mYrDisk.getYear() > eachDisk.getYear()) {
                    mYrDisk = eachDisk;
                }
            }
        }
        return mYrDisk;
    }

    @Override
    public String toString() {
        return "Disk {" + "name='" + name + '\'' + ", year=" + year + "}";
    }

}
