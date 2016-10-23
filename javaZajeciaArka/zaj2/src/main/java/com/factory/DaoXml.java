package main.java.com.factory;

/**
 * Created by Rafal on 10/19/2016.
 */
public class DaoXml implements IDaoFactory {

    private int id = 1;
    @Override
    public void getPersonById(int personId) {

    }

    @Override
    public int id() {
        return id;
    }
}
