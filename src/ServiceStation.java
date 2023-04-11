public class ServiceStation {
    public void check(TransportInterface transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            if(transport instanceof Bicycle){
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    transport.updateTyres();
                }
            }else{
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    transport.updateTyres();
            }
                transport.checkEngine();
                if(transport instanceof Truck){
                    transport.checkTrailer();
                }

            }
        }
    }
}

