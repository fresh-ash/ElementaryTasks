package services;

import input.Validated;
import interfaces.IValidator;

import java.util.List;

public class ValidatorEnvelopesAnalysisApp implements IValidator {

    @Override
    public List<Validated> validateData(String[] args, int neededCountArgs) throws IllegalArgumentException{
        if (args.length == neededCountArgs){

        }
        else {
            throw new IllegalArgumentException();
        }
        return null;
    }
}
