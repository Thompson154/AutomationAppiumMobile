package activities.clock;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button addAlarm = new Button(By.xpath("//android.widget.Button[@content-desc=\"Add alarm\"]"));
    public Button changeMinutes = new Button(By.xpath("//android.view.View[@content-desc=\"0 minutes\"]"));
    public Button save = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.deskclock:id/material_timepicker_ok_button\"]"));

    public Button setHour(int hour) {
        if (hour >= 1 && hour <= 12) {
            Button setHour = new Button(By.xpath("//android.widget.TextView[@content-desc=\"" + hour + " o'clock\"]"));
            return setHour;
        } else {
            throw new IllegalArgumentException("El valor de 'hour' debe estar entre 1 y 12.");
        }
    }

    public Button setMinute(int minute) {
        if (minute >= 0 && minute <= 59 && minute % 5 == 0) {
            Button setMinute = new Button(By.xpath("//android.widget.TextView[@content-desc=\"" + minute + " minutes\"]"));
            return setMinute;
        } else {
            throw new IllegalArgumentException("El valor de 'minute' debe ser un múltiplo de 5 entre 0 y 59.");
        }
    }


    public Button setTime(String time) {
        if (time.equals("am") || time.equals("pm")) {
            Button setTime = new Button(By.xpath("//android.widget.RadioButton[@resource-id=\"com.google.android.deskclock:id/material_clock_period_" + time + "_button\"]"));
            return setTime;
        } else {
            throw new IllegalArgumentException("El valor de 'time' debe ser 'am' o 'pm'.");
        }
    }

    public Label getAlarm(int hour, int minute, String time) {
        time = time.toUpperCase();
        Label alarm = new Label(By.xpath("//android.widget.TextView[@content-desc=\"" + hour + ":" + minute + " " + time + "\"]"));
        return alarm;
    }

    public void setAlarm(int hour, int minute, String time) {
        addAlarm.click();
        setHour(hour).click();
        changeMinutes.click();
        setMinute(minute).click();
        setTime(time).click();
        save.click();
    }
}
