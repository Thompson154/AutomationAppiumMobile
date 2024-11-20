package factoryDevices;

public class FactoryDevices {
    public static IDevice make(String deviceType) {
        IDevice device;
        switch (deviceType) {
            case "cloud":
                device = new AndroidCloud();
                break;
            case "ios":
                device = new IOS();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
