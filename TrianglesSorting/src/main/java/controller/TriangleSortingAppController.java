package controller;

import cli.CLI;
import input.Validated;
import interfaces.IValidator;
import interfaces.Messages;
import model.Triangle;
import util.MathOperations;
import view.IViewTriangleSortApp;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TriangleSortingAppController {

    IViewTriangleSortApp view;
    IValidator validator;
    CLI cli;
    TreeSet<Triangle> sortedTriangles;

    public TriangleSortingAppController(IViewTriangleSortApp view, IValidator validator, CLI cli) {
        this.view = view;
        this.validator = validator;
        this.cli = cli;
        this.sortedTriangles = new TreeSet<>();
    }

    public String waitInput(String str){
        return cli.waitInput(str);
    }

    public boolean checkAnswer(String str){
        return cli.checkAnswer(str);
    }

    public String[] splitInput(String str, String regex){
        String[] inputData = Arrays.stream(str.split(regex))
                .map(String::trim)
                .toArray(String[]::new);
        return inputData;
    }


    public void startApp(){
        view.showStartMessage(Messages.TRIANGLES_WELCOME_MESSAGE);
        getData();
    }

    public void getData(){
        int neededArgsCount = 4;
        String[] args = splitInput(waitInput(Messages.TRIANGLES_FORMAT_INPUT_MESSAGE), ",");
        try {
            List<Validated> validData = validator.validateData(args, neededArgsCount);
            Double triangleSideA = (Double) validData.get(1).get();
            Double triangleSideB = (Double) validData.get(2).get();
            Double triangleSideC = (Double) validData.get(3).get();
            Double triangleSquare = MathOperations.getTriangleSquare(triangleSideA, triangleSideB, triangleSideC);
            Triangle triangle = new Triangle((String) validData.get(0).get(), triangleSideA, triangleSideB, triangleSideC, triangleSquare);
            sortedTriangles.add(triangle);
        }
        catch (IllegalArgumentException e){
            System.out.println(Messages.INCORRECT_INPUT);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (checkAnswer("Do you want to continue?\nPlease, type \'yes\' or \'y\':")){
            getData();
        }
        else {
            view.showTriangles(this.sortedTriangles);
        }
    }
}
