package test;
import org.junit.*;

import main.TimeConversion;

import static org.junit.Assert.*;

public class TimeConversionTest {

    @Test
    public void testConvertSecondsToMinutes() {
        assertEquals(61, TimeConversion.convertSecondsToMinutes(3661));
        assertEquals(0, TimeConversion.convertSecondsToMinutes(0));
        assertEquals(1, TimeConversion.convertSecondsToMinutes(60));
        assertEquals(60, TimeConversion.convertSecondsToMinutes(3600));
    } 

    @Test
    public void testConvertSecondsToHours() {
        assertEquals(1, TimeConversion.convertSecondsToHours(3661));
        assertEquals(0, TimeConversion.convertSecondsToHours(0));
        assertEquals(0, TimeConversion.convertSecondsToHours(3599));
        assertEquals(1, TimeConversion.convertSecondsToHours(3600));
        assertEquals(2, TimeConversion.convertSecondsToHours(7200));
    }

    @Test
    public void testConvertMinutesToSeconds() {
        assertEquals(3661, TimeConversion.convertMinutesToSeconds(61));
        assertEquals(0, TimeConversion.convertMinutesToSeconds(0));
        assertEquals(60, TimeConversion.convertMinutesToSeconds(1));
        assertEquals(3600, TimeConversion.convertMinutesToSeconds(60));
    }

    @Test
    public void testConvertMinutesToHours() {
        assertEquals(1, TimeConversion.convertMinutesToHours(61));
        assertEquals(0, TimeConversion.convertMinutesToHours(0));
        assertEquals(0, TimeConversion.convertMinutesToHours(59));
        assertEquals(1, TimeConversion.convertMinutesToHours(60));
        assertEquals(2, TimeConversion.convertMinutesToHours(120));
    }

}