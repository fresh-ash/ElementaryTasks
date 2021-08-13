package service;

import input.ValidData;
import input.Validated;
import interfaces.IValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorTriangleSortApp implements IValidator {

    @Override
    public List<Validated> validateData(String[] args, int neededCountArgs) throws IllegalArgumentException{
        List<Validated> validData;
        if(args.length == neededCountArgs){
            validData = new ArrayList<>();
            if (args[0] != ""){
                validData.add(new ValidData(args[0]));
            }
            else {
                throw new IllegalArgumentException();
            }
            for (int i = 1; i < args.length; i++){
                Float data = Float.valueOf(args[i]);
                if(IValidator.checkZeroValue(data) || IValidator.checkNegativeValue(data)){
                    throw new IllegalArgumentException();
                }
                else {
                    ValidData<Float> validated = new ValidData<>(data);
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
