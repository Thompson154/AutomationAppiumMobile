package activities.clock;

import controls.Button;
import org.openqa.selenium.By;

public class FooterSection {

    public Button alarm = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.deskclock:id/navigation_bar_item_icon_view\"])[1]"));
    public Button clock = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.deskclock:id/navigation_bar_item_icon_view\"])[2]"));
    public Button timer = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.deskclock:id/navigation_bar_item_icon_view\"])[3]"));
    public Button stopwatch = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.deskclock:id/navigation_bar_item_icon_view\"])[4]"));
    public Button bedtime = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.deskclock:id/navigation_bar_item_icon_view\"])[5]"));
}
