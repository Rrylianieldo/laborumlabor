public class Adder {
    private int total = 0;
    
    public void add(int number) {
        total += number;
    }
    
    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(1);
        System.out.println(adder.getTotal());  // Output: 1
    }
}
