package by.it.potapovich.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar(3.14);
        Var v2 = new Vector(new double[]{1.0,2.0,4.0});
        Var v3 = new Matrix(new double[][]{{1,2},{3,4}});
        Var v4= new Vector("1.0,2.0,4.0");


    }
}
