package activities.clock;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class AlarmOptions {
    public Button openOptions = new Button(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.google.android.deskclock:id/alarm_card_layout\"])[1]"));
    public Button delete = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.deskclock:id/delete\"]"));


    public Label getAlarmToDelete(int hour, int minute, String time) {
        time = time.toUpperCase();
        Label alarm = new Label(By.xpath("" +
                "//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.deskclock:id/alarm_recycler_view\"]" +
                "//android.view.ViewGroup[@resource-id=\"com.google.android.deskclock:id/alarm_card_layout\"]" +
                "//android.widget.TextView[contains(@content-desc,\"" + hour + ":" + minute + " " + time + "\")]"));
        return alarm;
    }

    public void setDelete(int hour, int minute, String time) {
        getAlarmToDelete(hour, minute, time).click();
        delete.click();
    }
}
