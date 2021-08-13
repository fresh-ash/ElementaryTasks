package services;
import input.ValidData;
import input.Validated;
import interfaces.IValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorChessBoardApp implements IValidator {

    @Override
    public List<Validated> validateData(String[] args, int neededCountArgs) throws IllegalArgumentException {
        List<Validated> validData;
        if(args.length == neededCountArgs){
            validData = new ArrayList<>();
            for (int i = 0; i < args.length; i++){
                Integer data = Integer.valueOf(args[i]);
                if(IValidator.checkZeroValue(data) || IValidator.checkNegativeValue(data)){
                    throw new IllegalArgumentException();
                }
                else {
                    ValidData<Integer> validated = new ValidData<>(data);
                    validData.add(validated);
                }
            }
        }
        else {
            throw new IllegalArgumentException();
        }
        return validData;
    }
}
