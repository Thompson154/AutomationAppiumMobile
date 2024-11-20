package testSuite.clock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAlarmTest extends BaseClock{

    @Test
    public void createAlarm() throws InterruptedException {
        int hour = 4;
        int minute = 45;
        String time = "pm";

        String timeM = time.toUpperCase();

        footerSection.alarm.click();
        alarmScreen.addAlarm.click();
        Thread.sleep(2000);
        alarmScreen.setHour(hour).click();
        Thread.sleep(2000);
        alarmScreen.setMinute(minute).click();
        alarmScreen.setTime(time).click();
        alarmScreen.save.click();
        Thread.sleep(2000);

        Assertions.assertEquals(hour + ":" + minute + " " + timeM, alarmScreen.getAlarm(hour, minute, timeM).getText(), "ERROR, al crear el alarma");
    }
}
