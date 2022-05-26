package core;

import Jlogger.JloggerManager;

public class JloggerManagerAdaptor implements IJloggerServices{
    @Override
    public void logToSystem(String message) {
        JloggerManager manager = new JloggerManager();
        manager.log("Ürün Adaptor ile Loglandı ");
    }
}
