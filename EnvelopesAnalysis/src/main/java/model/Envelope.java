package model;

public class Envelope implements Comparable<Envelope>{
    String name;
    Float height;
    Float width;

    public Envelope(String name, Float height, Float width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }


    @Override
    public String toString() {
        String str = "\u2709" + name + "(h: " + height + ", w: " + width + ")";
        return str;
    }

    @Override
    public int compareTo(Envelope o) {
        if(this.width > o.getWidth() || this.width > o.getHeight()){
            return 1;
        }
        else if(this.width < o.getWidth() || this.height < o.getWidth()){
            return -1;
        }
        return 0;
    }
}
