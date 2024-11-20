package testSuite.clock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteAlarm extends BaseClock {

    @Test
    public void testDeleteAlarm() {
        int hour = 4;
        int minute = 45;
        String time = "pm";
        String timeM = time.toUpperCase();

        footerSection.alarm.click();
        alarmScreen.setAlarm(hour, minute, time);

        Assertions.assertEquals(hour + ":" + minute + " " + timeM, alarmScreen.getAlarm(hour, minute, timeM).getText(), "ERROR, al crear el alarma");

        alarmOptions.delete.click();

        Assertions.assertFalse(alarmScreen.getAlarm(hour,minute,time).isControlDisplayed(),"ERROR, al eliminar el alarma");
    }
}
