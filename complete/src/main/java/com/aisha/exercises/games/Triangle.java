package com.aisha.exercises.games;

public class Triangle {
    double area;
    int height;
    int length;
    void setArea() {
        area = (height * length) / 2;  //method to calculate area
    }
    public static void main(String [] args) {
        int x = 0;                       //declare variable called X of type int
        Triangle[] ta = new Triangle[4]; //Make new Triangle array called ta
        while (x<4){
            ta[x] = new Triangle();      //Put triangle objects in the array
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();             //call setArea method on ta[x]
            System.out.print("Triangle"+x+"area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;                    //increment loop
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = "+ y);
        System.out.println(", t5 area = "+ t5.area);
}
    }
