import java.util.Scanner; //scanner class
import java.util.Arrays;
import java.util.Random;

class Conversation {
  /**
   * 
   * @param 
   * @arguments
   */
  public static void main(String[] arguments) {
    
    String [] canned_responses = {"Intriguing, tell me more!", "Interesting", "Fascinating", "Of course!"};
    String [] keywords = {"I","you","me","am","your","my"};
  
    // You will start the conversation here.
    // need to clear the buffer
    //.equals(); --> compare lists of keywords and replacement words
    //.split();
    //javadoc comments on class stuff

    Random num = new Random();
    
    Scanner user = new Scanner(System.in);
    System.out.println("Hi! I am a rudementary Chat Bot, please eanter the number of conversation rounds you would like!");
    Integer rounds = user.nextInt(); //user input for round #

    String [] transcript = new String[(rounds*2)+4]; // create the transcript long enough to hold responses
    transcript[0] = ("Hi! I am a rudementary Chat Bot, please eanter the number of conversation rounds you would like!");
    transcript[1] = (String.valueOf(rounds));
    // System.out.println(Arrays.toString(transcript));


    for (int i = 1; i <= rounds+2; i++){
      if (i == rounds+2){
        System.out.println("Goodbye! I hope you enjoyed your chat!");
        transcript[(transcript.length)-1] = (" Goodbye! I hope you enjoyed your chat!");
        //also print transcript here
        System.out.println(Arrays.toString(transcript));

      } else {
        // for (Integer w=0; w<=10;w++){
        //   for (Integer k=0; k<=10; k++){
            String user_input = user.nextLine();
            transcript[i+2] = ("User Input: "+user_input);
            // System.out.println(Arrays.toString(transcript));

            // String [] words = user_input.split(" ");
        
            // if (words==keywords) {
              // System.out.println("it works");
            // } else {
              String this_response = canned_responses[num.nextInt( canned_responses.length)];
              System.out.println(this_response);
              transcript[i+3] = ("Canned Response: " + this_response);
              // System.out.println(Arrays.toString(transcript));

            // }

        //   }
        // }
      }      
    }
  }
}

/* NOTE TO SELF:
 * to fix the transcript issue possibly check for nulls in the array and fill in their indexes
 * probably something better i can think of but not right now
 */