public class Main implements Range{
    public static void main(String[] args) {

    }

    @Override
    public int sum(int start, int end) {
        int sum = 0;
        for(int i = start; i<end; i++)
        {
            sum+=i;
        }
        return sum;
    }
}
