public class PairArray {

    public static void pairArray(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")   ");
                tp++;

            }
            System.out.println();
            System.out.println("total pairs = "+ tp);
        }
    }

    public static void main(String[] args) {

        int numbers [] = {2,3,4,5,6,7,8,9,0};
        pairArray(numbers);
        
    }
    
}
