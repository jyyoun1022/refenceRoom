package codeJ.referenceRoom.Lab.Math;

public class MathRandom {

    public static void main(String[] args) {

        int count = (int)(Math.random()*5)+1;

        for( int i =0; i< count; i++){
            System.out.println(i);
        }
    }
}
