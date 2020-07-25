package epam.CollectionsTask;
import java.util.logging.Level;
import java.util.logging.Logger;
public class App
{
	private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<Integer>();
        for(int i = 0;i<15;i++)
        {
            ml.add(i);
        }
        ml.remove(3);
        ml.remove(3);
        logger.log(Level.INFO,"Size of List :"+ml.size()+"");
        logger.log(Level.INFO,"Print List\n");
        logger.log(Level.INFO," List : \n");
        ml.display();
    }
}