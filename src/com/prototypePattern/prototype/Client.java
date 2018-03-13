package com.prototypePattern.prototype;

public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficalDocument doc1,doc2,doc3,doc4;
        doc1 = pm.getOfficalDocument("far");
        doc2 = pm.getOfficalDocument("far");
        doc1.display();
        doc2.display();
        System.out.println("doc1 == doc2" + (doc1 == doc2));

    }
}
