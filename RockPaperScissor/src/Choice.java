import java.util.ArrayList;
import java.util.Random;

public class Choice {
    Random random=new Random();

    public Object getChoice(ArrayList list){
        int result= random.nextInt(list.size());
        Object theChoice=list.get(result);
        return theChoice;

    }
}
