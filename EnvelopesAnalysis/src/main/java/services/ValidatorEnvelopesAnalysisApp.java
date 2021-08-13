package services;

import interfaces.IValidator;
import interfaces.Messages;

public class ValidatorEnvelopesAnalysisApp implements IValidateData {

    public Float validateInput(String str){
        try {
            if (str != "" && str != null) {
                Float data = Float.valueOf(str);
                if (IValidator.checkZeroValue(data) || IValidator.checkNegativeValue(data)) {
                    throw new IllegalArgumentException();
                }
                return data;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.err.println(Messages.INCORRECT_INPUT);
        }
        return null;
    }
}
