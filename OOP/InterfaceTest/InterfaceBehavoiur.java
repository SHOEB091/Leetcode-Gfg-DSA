package OOP.InterfaceTest;

interface Config {
    int TIMEOUT = 5000; // implicitly public static final
}

class NetworkClient implements Config {
    void connect() {
        System.out.println("Connecting with timeout = " + TIMEOUT);
    }
}
public class InterfaceBehavoiur {
    public static void main(String[] args) {
        NetworkClient client = new NetworkClient();
        client.connect();
    }
}