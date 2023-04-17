public class ServiceStation {
    public void check(TransportInterface transports) {
        transports.servise();

        }

    public void checkAll(TransportInterface[] transportInterfac) {
        for (TransportInterface transportInterface : transportInterfac) {
            transportInterface.servise();

        }
    }
}


