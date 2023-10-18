package prak_2_oop;

public class Matematika implements MatematikaInterface {
    public int pertambahan(int a, int b) {
    	return a + b;
    }

    public int pengurangan(int a, int b) {
       return a-b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }
    
    public float pembagian(int a, int b) {
        return (float) a / b;
    }
}