package day10ForLoopWhileLoopReview;

public class Q03Practice {
    public static void main(String[] args) {

    int num = 20;

    for (int i = 1; i<num+1; i++){

        if (i%3==0 && i%5==0){
            System.out.print("RockStar ");
        }else if(i%3 == 0){
            System.out.print("Rock ");
        }else if (i%5 ==0){
            System.out.print("Star ");
        }else{
            System.out.print(i + " ");
        }


        }














    }
}
