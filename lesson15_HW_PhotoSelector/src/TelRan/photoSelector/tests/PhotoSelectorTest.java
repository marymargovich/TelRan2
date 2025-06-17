package TelRan.photoSelector.tests;

import org.junit.jupiter.api.Test;

import static TekRan.photoSelector.tools.PhotoSelector.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PhotoSelectorTest {
     private static final String[] pictures = {
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
     };


    @Test
    void testAllEuropeanPictures(){
        String regex = "^(Paris|London).*";
        String [] actual = selectPictures( pictures, regex);
        String [] expected = {
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
        };
        assertArrayEquals(expected, actual);

    }

    @Test
    void testAllAutumnPictures() {
        String regex = ".*\\d{4}(09|10|11)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPictures(pictures, regex);
        String[] expected = {
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAll2015SpringPictures() {
        // 2015‑03, 2015‑04, 2015‑05
        String regex = ".*2015(03|04|05)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPictures(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_110023.gif",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "Chicago\\20150301_120001.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllNightPictures() {
        // 18–23 часов
        String regex = ".*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPictures(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "London\\20140601_211035.gif",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testChicagoNightPictures() {
        String regex = "^Chicago.*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPictures(pictures, regex);
        String[] expected = {
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }



    @Test
    void testAllJpgAndPngPictures() {
        String regex = ".*\\.(jpg|png)$";
        String[] actual = selectPictures(pictures, regex);
        String[] expected = {
                "Paris\\20140101_090000.jpg",
                "Paris\\20140201_121005.jpg",
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "London\\20140205_090000.jpg",
                "London\\20140205_121005.jpg",
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20150301_120001.png",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllEuropeanPicturesSB(){
        String regex = "^(Paris|London).*";
        String [] actual = selectPicturesSB( pictures, regex);
        String [] expected = {
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
        };
        assertArrayEquals(expected, actual);

    }

    @Test
    void testAllAutumnPicturesSB() {
        String regex = ".*\\d{4}(09|10|11)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPicturesSB(pictures, regex);
        String[] expected = {
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAll2015SpringPicturesSB() {
        // 2015‑03, 2015‑04, 2015‑05
        String regex = ".*2015(03|04|05)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPicturesSB(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_110023.gif",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "Chicago\\20150301_120001.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllNightPicturesSB() {
        // 18–23 часов
        String regex = ".*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPicturesSB(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "London\\20140601_211035.gif",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testChicagoNightPicturesSB() {
        String regex = "^Chicago.*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPicturesSB(pictures, regex);
        String[] expected = {
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }



    @Test
    void testAllJpgAndPngPicturesSB() {
        String regex = ".*\\.(jpg|png)$";
        String[] actual = selectPicturesSB(pictures, regex);
        String[] expected = {
                "Paris\\20140101_090000.jpg",
                "Paris\\20140201_121005.jpg",
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "London\\20140205_090000.jpg",
                "London\\20140205_121005.jpg",
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20150301_120001.png",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }
    @Test
    void testAllEuropeanPictures_SB_Matcher() {
        String regex = "^(Paris|London).*";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
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
                "London\\20151001_231035.jpg"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllAutumnPictures_SB_Matcher() {
        String regex = ".*\\d{4}(09|10|11)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAll2015SpringPictures_SB_Matcher() {
        String regex = ".*2015(03|04|05)\\d{2}_\\d{6}\\..*";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_110023.gif",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "Chicago\\20150301_120001.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllNightPictures_SB_Matcher() {
        String regex = ".*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "London\\20140601_211035.gif",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testChicagoNightPictures_SB_Matcher() {
        String regex = "^Chicago.*_(18|19|20|21|22|23)\\d{4}\\..*";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllJpgAndPngPictures_SB_Matcher() {
        String regex = ".*\\.(jpg|png)$";
        String[] actual = selectPicturesSbMatcher(pictures, regex);
        String[] expected = {
                "Paris\\20140101_090000.jpg",
                "Paris\\20140201_121005.jpg",
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "London\\20140205_090000.jpg",
                "London\\20140205_121005.jpg",
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20150301_120001.png",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected, actual);
    }

}
