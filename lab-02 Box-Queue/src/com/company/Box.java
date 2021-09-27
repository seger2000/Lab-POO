package com.company;

public class Box {
    private int height;
    private int width;
    private int depth;

    public Box() {
        this(1,1,1);
    }

    public Box(int x) {
        this(x,x,x);

    }

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double getA(){
        return 2*(this.height*this.width+this.height*this.depth+this.width*this.depth);
    }
    public double getv(){
        return this.height*this.depth*this.width;
    }
}
