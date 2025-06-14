package TelRan.photoFilter.model;

public class PhotoFilter {

    /*
    ^.+\\\\ — любая папка
    \\d{4} — год (4 цифры)
    (09|10|11) — месяц
    \\d{2} — день (2 цифры)
    _\\d{6} — время: hhmmss
    \\. — точка перед расширением
    [^.]+$ — расширение (например, jpg, gif, png)
      */

    public static boolean isEuropeanPhoto(String photo) {
        return photo.matches("^(Paris|London)\\\\\\d{8}_\\d{6}\\.[^.]+$");
        //из папки Paris или London,
        //с датой в формате YYYYMMDD,
        //временем в формате hhmmss,
        //и любым расширением файла
    }


    public static boolean isAutumn( String photo){
        return photo.matches("^.+\\\\\\d{4}(09|10|11)\\d{2}_\\d{6}\\.[^.]+$");
        //из любой папки,
        //с датой в формате YYYYMMDD,
        //месяц — сентябрь, октябрь или ноябрь (09, 10, 11),
        //с временем в формате hhmmss,
        //и с любым расширением файла
    }

    public static boolean isSpring2015(String photo){
        return photo.matches("^.+\\\\2015(03|04|05)\\d{2}_\\d{6}\\.[^.]+$");
        // любой папки,
        //с датой в формате 2015MMDD, где
        //месяц — март, апрель или май (03, 04, 05),
        //с временем в формате hhmmss,
        //и с любым расширением файла

    }

    public static boolean isNight ( String photo){
        return photo.matches("^.+_((1[89])|(2[0-3]))\\d{4}\\.[^.]+$");
        //любой папки,
        //с временем в формате hhmmss,
        //где часы — от 18 до 23 (то есть вечер/ночь),
        //и с любым расширением файла
    }

    public static boolean isNightChicago(String photo){
        return photo.matches("^Chicago\\\\\\d{8}_((1[89])|(2[0-3]))\\d{4}\\.[^.]+$");
        //из папки Chicago,
        //с датой в формате YYYYMMDD,
        //с временем в формате hhmmss, где
        //часы — от 18 до 23,
        //и с любым расширением файла
    }


    public static boolean isGpgOrPng(String photo){
        return photo.toLowerCase().matches("^.+\\.(jpg|png)$");
        //из любой папки,
        //с любым названием и датой,
        //и с расширением файла .jpg или .png
    }

}


    /*
Download file Photo.txt
Full list of picture file Names for selection in format:
folder#*YYYYMMDD_hhmmss.ext, where:
folder - name of folder equal to location where picture was taken
YYYY, MM, DD - year, month, day
hh,mm,ss - hours, minutes, seconds
Write the following tests:
PhotoFilterTest 1. All Europe pictures
PhotoFilterTest 2. All autumn pictures
PhotoFilterTest 3 All 2015 spring pictures
PhotoFilterTest 4. * All night pictures (from 18:00 till 24:00)
PhotoFilterTest 5. * All night pictures from Chicago
PhotoFilterTest 6. * All jpg and png pictures



"Paris\\20140101_090000.jpg",
"Paris\\20140201_121005.jpg",
"Paris\\20150301_211035.jpg",
"Paris\\20150401_110023.gif",
"Paris\\20150401_181705.jpg",
"Paris\\20150501_231035.gif",
"London\\20140205_090000.jpg",
"London\\20140205_121005.jpg",
"London\\20140601_211035.gif",
"London\\20151001_110023.jpg",
"London\\20151001_121705.jpg",
"London\\20151001_231035.jpg",
"Chicago\\20150301_120001.png",
"Chicago\\20151111_232000.png"

     */

