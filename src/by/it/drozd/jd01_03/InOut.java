package by.it.drozd.jd01_03;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
    }
     static double[] getArray(String line){
    String[] strArray=line.split(" ");
    double[] res=new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            res[i]=Double.parseDouble(strArray[i]);
        }
    return res;
    }
    static void printArray(double[ ] arr){
        for (double element : arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    static void printArray(double[ ] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ",name,i,arr[i]);
            if ((i+1)%columnCount==0 || i+1==arr.length)
                System.out.println();
        }

    }
}

