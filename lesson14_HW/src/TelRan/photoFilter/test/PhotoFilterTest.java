package TelRan.photoFilter.test;


import TelRan.photoFilter.model.PhotoFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhotoFilterTest {
    private static final String[] PHOTOS = {
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
    public void testIsEuropeanPhoto() {
        assertTrue(PhotoFilter.isEuropeanPhoto("Paris\\20140101_090000.jpg"));
        assertTrue(PhotoFilter.isEuropeanPhoto("London\\20140205_121005.jpg"));
        assertFalse(PhotoFilter.isEuropeanPhoto("Chicago\\20150301_120001.png"));
        assertFalse(PhotoFilter.isEuropeanPhoto("Berlin\\20150401_180000.jpg"));
    }

    @Test
    public void testIsAutumn() {
        assertTrue(PhotoFilter.isAutumn("Paris\\20140915_120000.jpg"));
        assertTrue(PhotoFilter.isAutumn("London\\20141010_090000.png"));
        assertTrue(PhotoFilter.isAutumn("Berlin\\20141130_150000.gif"));
        assertFalse(PhotoFilter.isAutumn("Paris\\20140831_090000.jpg"));
        assertFalse(PhotoFilter.isAutumn("Chicago\\20141201_230000.jpg"));
    }

    @Test
    public void testIsSpring2015() {
        assertTrue(PhotoFilter.isSpring2015("Paris\\20150301_211035.jpg"));
        assertTrue(PhotoFilter.isSpring2015("London\\20150430_110023.gif"));
        assertTrue(PhotoFilter.isSpring2015("Berlin\\20150515_180000.png"));
        assertFalse(PhotoFilter.isSpring2015("Paris\\20150601_090000.jpg"));
        assertFalse(PhotoFilter.isSpring2015("Paris\\20140301_211035.jpg"));
    }

    @Test
    public void testIsNight() {
        assertTrue(PhotoFilter.isNight("Paris\\20150401_181705.jpg"));
        assertTrue(PhotoFilter.isNight("London\\20151001_231035.jpg"));
        assertFalse(PhotoFilter.isNight("Paris\\20150401_171705.jpg"));
        assertFalse(PhotoFilter.isNight("Chicago\\20150301_120001.png"));
    }

    @Test
    public void testIsNightChicago() {
        assertTrue(PhotoFilter.isNightChicago("Chicago\\20151111_232000.png"));
        assertFalse(PhotoFilter.isNightChicago("Chicago\\20150301_120001.png"));
        assertFalse(PhotoFilter.isNightChicago("London\\20151001_231035.jpg"));
    }

    @Test
    public void testIsJpgOrPng() {
        assertTrue(PhotoFilter.isGpgOrPng("Paris\\20140101_090000.jpg"));
        assertTrue(PhotoFilter.isGpgOrPng("Chicago\\20150301_120001.png"));
        assertFalse(PhotoFilter.isGpgOrPng("Paris\\20150401_110023.gif"));
        assertFalse(PhotoFilter.isGpgOrPng("London\\20140601_211035.gif"));
        assertTrue(PhotoFilter.isGpgOrPng("paris\\20140101_090000.JPG"));
        assertTrue(PhotoFilter.isGpgOrPng("chicago\\20150301_120001.PnG"));
    }



}






