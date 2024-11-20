package testSuite.clock;

import activities.clock.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class BaseClock {
    AlarmScreen alarmScreen = new AlarmScreen();
    AlarmOptions alarmOptions = new AlarmOptions();
    BedTimeScreen bedTimeScreen = new BedTimeScreen();
    ClockScreen clockScreen = new ClockScreen();
    FooterSection footerSection = new FooterSection();
    StopwatchScreen stopwatchScreen = new StopwatchScreen();
    TimerScreen timerScreen = new TimerScreen();


    @BeforeEach
    public void before() {}

    @AfterEach
    public void after() {
        Session.getInstance().closeApp();
    }
}
