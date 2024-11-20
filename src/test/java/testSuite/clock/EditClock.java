package testSuite.clock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditClock extends BaseClock{

    @Test
    public void EditClockTets(){
        int hour = 5;
        int minute = 45;
        String time = "am";
        String timeM = time.toUpperCase();

        footerSection.alarm.click();
        alarmScreen.setAlarm(hour, minute, time);
        Assertions.assertEquals(hour + ":" + minute + " " + timeM, alarmScreen.getAlarm(hour, minute, time).getText(), "ERROR, al crear el alarma");

        alarmScreen.getAlarm(hour, minute, time).click();

        int newHour = 2;
        int newMinute = 40;
        String newTime = "pm";
        String newTimeM = newTime.toUpperCase();

        alarmScreen.updateAlarm(newHour,newMinute,newTime);
        Assertions.assertEquals(newHour + ":" + newMinute + " " + newTimeM, alarmScreen.getAlarm(newHour, newMinute, newTime).getText(), "ERROR, al actualizar el alarma");

    }
    
}
