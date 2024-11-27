public class Main {
    public static void main(String[] args) {

        System.out.println("hi");
        Range sum1 = (start, end) -> {
            int count = 0;
            for(int i = start; i<=end; i++)
                count += i;
            return count;
        };


        System.out.println(sum1.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));

    }
}
