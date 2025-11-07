package OOP.InterfaceTest;

interface Machine {
    void start();
}

interface SmartMachine extends Machine {
    void updateFirmware();
}

class Robot implements SmartMachine {
    public void start() {
        System.out.println("Robot starting...");
    }

    public void updateFirmware() {
        System.out.println("Firmware updated.");
    }
}
public class InterfaceChain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.start();
        robot.updateFirmware();
    }
}
