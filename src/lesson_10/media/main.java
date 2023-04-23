package lesson_10.media;

public class main {
    public static void main(String[] args) {
        // * Вы работаете над программой-каталогом домашней медиа-библиотеки фильмов и музыкальных альбомов на DVD дисках (образах).
        //        * 1. Разобрать классы для хранения информации о:
        //        - музыкальных альбомах (название альбома, исполнитель, год издания, количество треков)
        //        - фильмах (название, год выхода, студия издатель, режиссер, продолжительность в минутах)
        //        * 2. Создать массив дисков с неоднородным составом (фильмы и музыкальные диски),
        //        заполнить его несколькими элементами, вывести все элементы на экран.
        //        * 3. Найти в массиве самый старый диск и вывести информацию о нем на экран.

        myAudioDisk audioDisk1 = new myAudioDisk();
        myAudioDisk audioDisk2 = new myAudioDisk();
        myAudioDisk audioDisk3 = new myAudioDisk();
        myAudioDisk audioDisk4 = new myAudioDisk();

        audioDisk1.setName("Группа крови");
        audioDisk1.setYear(1988);
        audioDisk1.setSigner("КИНО");
        audioDisk1.setTracksCount(11);

        audioDisk2.setSigner("Кирпичи");
        audioDisk2.setName("Сила ума");
        audioDisk2.setYear(2002);
        audioDisk2.setTracksCount(15);

        audioDisk3.setSigner("Сектор Газа");
        audioDisk3.setName("Колхозный панк");
        audioDisk3.setYear(1989);
        audioDisk3.setTracksCount(17);

        audioDisk4.setSigner("Guns N’ Roses");
        audioDisk4.setName("Use Your Illusion II");
        audioDisk4.setYear(1991);
        audioDisk4.setTracksCount(14);

        myVideoDisk videoDisk1 = new myVideoDisk();
        myVideoDisk videoDisk2 = new myVideoDisk();
        myVideoDisk videoDisk3 = new myVideoDisk();
        myVideoDisk videoDisk4 = new myVideoDisk();

        videoDisk1.setName("Transformers");
        videoDisk1.setMinutesCount(120);
        videoDisk1.setDirector("Майкл Бэй");
        videoDisk1.setYear(2007);
        videoDisk1.setProducer("Лоренцо ди Бонавентура");

        videoDisk2.setName("Titanic");
        videoDisk2.setYear(1997);
        videoDisk2.setDirector("Джеймс Кэмерон");
        videoDisk2.setMinutesCount(195);
        videoDisk2.setProducer("Джон Ландау");

        videoDisk3.setName("Fifty Shades of Grey");
        videoDisk3.setYear(2015);
        videoDisk3.setDirector("Сэм Тейлор-Джонсон");
        videoDisk3.setProducer("Дэна Брунетти");
        videoDisk3.setMinutesCount(128);

        videoDisk4.setName("Тайлер Рейк: Операция по спасению");
        videoDisk4.setYear(2020);
        videoDisk4.setDirector("Джо Руссо");
        videoDisk4.setProducer("Энтони Руссо");
        videoDisk4.setMinutesCount(117);

        myDisk[] boxOfDisks = new myDisk[20];

        boxOfDisks[0] = audioDisk1;
        boxOfDisks[1] = audioDisk2;
        boxOfDisks[2] = audioDisk3;
        boxOfDisks[3] = audioDisk4;
        boxOfDisks[4] = videoDisk1;
        boxOfDisks[5] = videoDisk2;
        boxOfDisks[6] = videoDisk3;
        boxOfDisks[7] = videoDisk4;

        myDisk.listOfDisks(boxOfDisks);

        myDisk minYDisk = myDisk.minYearDisk(boxOfDisks);
        System.out.printf("Самый старый диск: \n   %s",minYDisk.toString());
    }
}
