package view;

import model.Envelope;

public class ConsoleViewEnvelopesAnalysisApp implements IView{

    @Override
    public void showCompareEnvelopes(Envelope envAB, Envelope envCD, boolean result) {
        if(result){
            System.out.printf("Success! You put %s\u2709(h: %s, w: %s) into %s\u2709(h: %s, w: %s)\n", envCD.getName(), envCD.getHeight(), envCD.getWidth(),
                                envAB.getName(), envAB.getHeight(), envAB.getWidth());
        }
        else {
            System.out.printf("You tried, but %s\u2709(h: %s, w: %s) and %s\u2709(h: %s, w: %s) cannot be nested!\n", envCD.getName(), envCD.getHeight(), envCD.getWidth(),
                    envAB.getName(), envAB.getHeight(), envAB.getWidth());
        }
    }

    @Override
    public void showWelcomeMessage(String str) {
        System.out.println(str);
    }
}
