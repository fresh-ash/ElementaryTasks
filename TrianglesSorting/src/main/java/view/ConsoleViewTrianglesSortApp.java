package view;

import model.Triangle;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ConsoleViewTrianglesSortApp implements IViewTriangleSortApp{

    @Override
    public void showTriangles(TreeSet treeSet) {
        NavigableSet<Triangle> set = treeSet.descendingSet();
        System.out.println("============= Triangles list: ===============");
        int counter = 1;
        for (Triangle triangle : set){
            System.out.printf(counter + ". " + triangle.toString());
            counter +=1;
        }
    }

    @Override
    public void showStartMessage(String str) {
        System.out.println(str);
    }
}
