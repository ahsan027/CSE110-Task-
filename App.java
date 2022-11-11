import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to add?: ");
        int num = scan.nextInt();
        for(int nums = 1;nums <= num ;nums++){
            int res = num - nums;
            if(nums % 2 != 0){
                System.out.print(" ".repeat(res));
            }
            if(nums % 2 != 0){
                for(int numsOne = 1; numsOne <= nums; numsOne++){
                    System.out.print(numsOne);
                    System.out.print(" ");
            }
            }
            if(nums %2 != 0){
                System.out.println(" ");
            }
        }
    }
}