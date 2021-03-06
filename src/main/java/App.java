import java.io.Console;

public class App {
    public static void main(String[] args){
        CeaserCipher ceaserCipher = new CeaserCipher();
       Console myConsole = System.console();             //able to allow user input
       System.out.println("Enter Sentence");

       String stringSentence = myConsole.readLine();
       System.out.println("Enter Key");
       String key = myConsole.readLine();
       int userKey = Integer.parseInt(key);    //Changing an integer to a string

        String encryptResult = CeaserCipher.isEncrypt(stringSentence, userKey);   //create an instance of encrypt class and call isEncrypt method
        String decryptResult = CeaserCipher.runDecrypt(stringSentence,userKey);  //create an instance of decrypt class and call isDecrypt method

        System.out.println("Choose A to Encrypt\nEnter B to Decrypt");

        String userCeaserCipher = myConsole.readLine();
        String ceaserCiphers = userCeaserCipher.toLowerCase();

        if (ceaserCiphers.equals("a")) {       //created an if statement so as to output the encrypt and decrypt separately

            System.out.println(encryptResult);
        }
        else if(ceaserCiphers.equals("b")){   //decrypt output
            System.out.println(decryptResult);
        }
        else {
            System.out.println("Invalid choice");
        }

    }



}

