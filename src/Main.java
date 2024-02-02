//uc3 find the max String  

class Generic<E extends Comparable<E>> {
    private E num1;
    private E num2;
    private E num3;

    public E getMaxNums() {
        if (num1.compareTo(num2) >= 0 && num1.compareTo(num3) >= 0) {
            return num1;
        } else if (num2.compareTo(num1) >= 0 && num2.compareTo(num3) >= 0) {
            return num2;
        } else {
            return num3;
        }
    }

    public void setNums(E num1, E num2, E num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
}

public class Main {
    public static void main(String[] args) {

        // for Integer
        Generic<Integer> obj = new Generic<>();
        obj.setNums(42, 13, 22);
        // Printing the maximum number
        System.out.println("Maximum Number in int is : " + obj.getMaxNums());

        // for Float
        Generic<Float> obj1 = new Generic<Float>();
        obj1.setNums(12.1f, 13.4f, 32.1f);
        // Printing the maximum number
        System.out.println("Maximum Number in Float is : " + obj1.getMaxNums());

        // for String
        Generic<String> obj2 = new Generic<String>();
        obj2.setNums("Apple", "Peach", "Banana");
        // Printing the maximum number
        System.out.println("Maximum String is  : " + obj2.getMaxNums());

    }
}
