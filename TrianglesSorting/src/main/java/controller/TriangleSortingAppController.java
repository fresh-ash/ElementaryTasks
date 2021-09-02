package controller;

import input.CLI;
import input.Validated;
import interfaces.Input;
import interfaces.Messages;
import model.Triangle;
import service.ValidatorTriangleSortApp;
import util.MathOperations;
import view.IViewTriangleSortApp;
import java.util.List;
import java.util.TreeSet;

public class TriangleSortingAppController {

    IViewTriangleSortApp view;
    ValidatorTriangleSortApp validator;
    CLI cli;
    TreeSet<Triangle> sortedTriangles;

    public TriangleSortingAppController(IViewTriangleSortApp view, ValidatorTriangleSortApp validator, CLI cli) {
        this.view = view;
        this.validator = validator;
        this.cli = cli;
        this.sortedTriangles = new TreeSet<>();
    }

    public void startApp(){
        view.showInfoMessage(Messages.TRIANGLES_WELCOME_MESSAGE);
        getData();
    }

    public void getData(){
        int neededArgsCount = 4;
        String[] args = Input.splitInput(cli.waitInput(Messages.TRIANGLES_FORMAT_INPUT_MESSAGE), ",");
        try {
            List<Validated> validData = validator.validateData(args, neededArgsCount);
            Double triangleSideA = (Double) validData.get(1).get();
            Double triangleSideB = (Double) validData.get(2).get();
            Double triangleSideC = (Double) validData.get(3).get();
            Double triangleSquare = MathOperations.getTriangleSquare(triangleSideA, triangleSideB, triangleSideC);
            Triangle triangle = new Triangle((String) validData.get(0).get(), triangleSideA,
                                            triangleSideB, triangleSideC, triangleSquare);
            sortedTriangles.add(triangle);
        }
        catch (IllegalArgumentException e){
            view.showInfoMessage(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            view.showInfoMessage(Messages.UNDEFINED_ERR);
        }
        if (cli.checkAnswer(Messages.CHECK_ANSWER)){
            getData();
        }
        else {
            view.showTriangles(this.sortedTriangles);
        }
    }
}
