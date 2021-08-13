package input;

import java.util.List;

public interface IInputService {
    static String[] getDataFromInput(String[] args, int neededCountArgs){
        if(args.length < neededCountArgs){
            return null;
        }
        return args;
    }
}
