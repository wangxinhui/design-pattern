package com.prototypePattern.prototype;

import java.util.Hashtable;

public class PrototypeManager {
    private static Hashtable ht = new Hashtable();
    private static PrototypeManager prototypeManager = new PrototypeManager();
    private PrototypeManager(){
        ht.put("far", new FAR());
        ht.put("sfr", new SFR());

    }
    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }

    public OfficalDocument getOfficalDocument(String key){
        return ((OfficalDocument) ht.get(key)).clone();
    }
}
