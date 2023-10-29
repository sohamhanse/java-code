package greedy_algo;

public class indian_coin {
    public static void main(String arg[]) {
        // money should be in desending order or sort it by comparator
        int money[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 521;
        int count = 0;
        while (amount != 0) {
            for(int i = 0 ; i < money.length ;i++){
               if(money[i] <= amount){
                amount -= money[i];
                count++;
                break;
               } 
            }
        }
        System.out.println(count);
        
    }
}
