import java.util.*;

public class CustomEightBall implements EightBall{

    protected static ArrayList<String> customResponses = new ArrayList<String>();

    public CustomEightBall(ArrayList<String> customResponses){

        //ArrayList<String> customResponses = new ArrayList<String>();




    }

    public static void addResponses(String input){

        customResponses.add(input);



    }

   /* public static String getRandomAnswerCustom(ArrayList<String> customResponses){

        Random randAnswerCustom = new Random();

        return CustomEightBall.customResponses.get(randAnswerCustom.nextInt(customResponses.size()));

    }
*/


   static String getRandomAnswer(ArrayList<String> customResponses) {
        Random randAnswerCustom = new Random();

        return CustomEightBall.customResponses.get(randAnswerCustom.nextInt(customResponses.size()));
    }
}
