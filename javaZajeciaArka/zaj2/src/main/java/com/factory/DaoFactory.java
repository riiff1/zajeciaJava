package main.java.com.factory;

/**
 * Created by Rafal on 10/19/2016.
 */
public class DaoFactory implements IDaoFactory {

    private static DaoFactory instance = null;
    private int id = 3;
    private DaoFactory(){}
    public static DaoFactory getInstance()
    {
        if(instance == null)
        {
            instance = new DaoFactory();
            return instance;
        }
        return instance;
    }

    @Override
    public void getPersonById(int personId) {
    }

    @Override
    public int id() {
        return id;
    }

    public void setSource(EDaoFactory enume)
    {
        switch (enume)
        {
            case DB:
                instance = new DaoDb();
                break;
            case XML:
                instance = new DaoXml();
        }
    }
}
