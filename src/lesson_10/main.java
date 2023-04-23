package lesson_10;

import lesson_10.media.myAudioDisk;

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

        audioDisk1.setName("White album");
        audioDisk1.setYear(1991);
        audioDisk1.setSigner("Kino");
        audioDisk1.setTracksCount(14);

        audioDisk2.setSigner("Kirpichi");
        audioDisk2.setName("Sila uma");
        audioDisk2.setYear(2001);
        audioDisk2.setTracksCount(15);

        audioDisk3.setSigner("Sektor Gaza");
        audioDisk3.setName("Kolhoznyi pank");
        audioDisk3.setYear(1992);
        audioDisk3.setTracksCount(17);


    }
}
