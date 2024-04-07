//First 'for loop' to start your journey of understanding programming logic
//We are primarily focusing on logics only
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");//print Hello and welcome!

        for (int i = 1; i <= 5; i++) {
            /* in this for loop "first step" -> we initialize i to 1(i = 1),
            "second step" -> will check if the given condition is true or not that is if the
            value of i is smaller or equal than 5(i <= 5), if it is true then it will print the
            current value of i, or the loop will break.
            "Third step" -> But if the condition satisfied then the value of i will increase
            because of increment operator and loop didn't break until the condition is dissatisfied  */

            System.out.println("i = " + i);
            /* i = 1 , condition satisfied, print value of i = 1, i++ means i = 2, then
            i = 2 , condition satisfied, print value of i = 2, i++ means i = 3, then
            i = 3 , condition satisfied, print value of i = 3, i++ means i = 4, then
            i = 4 , condition satisfied, print value of i = 4, i++ means i = 5, then
            i = 5 , condition satisfied, print value of i = 5, i++ means i = 6, then
            i = 6 , condition dissatisfied, loop -> break.

            Output Hello and welcome!
                    i = 1
                    i = 2
                    i = 3
                    i = 4
                    i = 5
             */


        }
    }
}
