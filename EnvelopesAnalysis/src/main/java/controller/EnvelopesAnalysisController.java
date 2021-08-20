package controller;

import cli.CLI;
import interfaces.Messages;
import model.Envelope;
import services.IValidateData;
import view.IViewEnvelopesAnalysisApp;

public class EnvelopesAnalysisController {

    IViewEnvelopesAnalysisApp view;
    IValidateData validateData;
    CLI cli;
    Envelope envelopeAB;
    Envelope envelopeCD;

    public EnvelopesAnalysisController(IViewEnvelopesAnalysisApp view, IValidateData validateData, CLI cli) {
        this.view = view;
        this.validateData = validateData;
        this.cli = cli;
    }

    public String waitInput(String str){
        return cli.waitInput(str);
    }

    public boolean checkAnswer(String str){
        return cli.checkAnswer(str);
    }

    public Float getCorrectInputParameter(String inviteMess){
            Float parameter = null;
            while (parameter == null){
                String consoleInput = waitInput(inviteMess);
                parameter = validateData.validateInput(consoleInput);
            }
            return parameter;
        }

    public void writeData(){
        view.showWelcomeMessage(Messages.ENVELOPES_WELCOME_MESSAGE);
            Float heightEnvelopAB = getCorrectInputParameter("Please, enter value for height EnvelopAB:");
            Float widthEnvelopAB = getCorrectInputParameter("Please, enter value for width EnvelopAB:");
            Float heightEnvelopCD = getCorrectInputParameter("Please, enter value for height EnvelopCD:");
            Float widthEnvelopCD = getCorrectInputParameter("Please, enter value for width EnvelopCD:");
            this.envelopeAB = new Envelope("AB", heightEnvelopAB, widthEnvelopAB);
            this.envelopeCD = new Envelope("CD", heightEnvelopCD, widthEnvelopCD);
    }

    public void getDataAndShow(){
        writeData();
        int compareResult = envelopeAB.compareTo(envelopeCD);
        if(compareResult != 0){
            if(compareResult > 0){
                view.showCompareEnvelopes(envelopeAB, envelopeCD, true);
            }
            else {
                view.showCompareEnvelopes(envelopeCD, envelopeAB, true);
            }
        }
        else {
            view.showCompareEnvelopes(envelopeAB, envelopeCD, false);
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            getDataAndShow();
        }
        else {
            return;
        }

    }





}
