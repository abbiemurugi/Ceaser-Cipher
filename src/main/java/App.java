import java.io.Console;

public class App {
    public static void main(String[] args){
       Console myConsole = System.console();
       System.out.println("Enter Sentence");

       String stringSentence = myConsole.readLine();
       System.out.println("Enter Key");
       int intKey = Integer.parseInt(stringSentence);

    }
}

