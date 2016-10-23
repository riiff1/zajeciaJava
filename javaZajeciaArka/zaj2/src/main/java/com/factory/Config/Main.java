package main.java.com.factory.Config;

import main.java.com.factory.DaoFactory;
import main.java.com.factory.EDaoFactory;
import main.java.com.factory.IDaoFactory;

/**
 * Created by Rafal on 10/19/2016.
 */
public class Main {
    public static void main(String[] args) {
        DaoFactory dt = DaoFactory.getInstance();
        dt.setSource(EDaoFactory.XML);
        System.out.println(dt.id());
    }
}
