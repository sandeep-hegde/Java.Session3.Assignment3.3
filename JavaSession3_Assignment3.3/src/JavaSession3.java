//Java Session 3 Assignment 3.3

//Problem Statement - What would happen when the following is compiled and executed.


public class JavaSession3 {

    public static void main(String args[]) {


        example pnt = new example();
        System.out.println("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);


    }

    // Class example need to be static
    static class example

    {

        int x;
        int y;
        String name;

    }


}


// Expected Output - The program prints pnt is null 0 0.