import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Login {

    int userType;

    Login() {
        userType = -1;
    }

    public int login() {

        System.out.println("Enter Login Credential:");
        System.out.println("Enter User Name:");
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        System.out.println("Enter Password:");
        String password = scan.next();
        File fileseller = new File(
                "textFiles/SellerInfo.txt");
        File filebuyer = new File(
                "textFiles/BuyerInfo.txt");

        try {

            Scanner sb = new Scanner(filebuyer);
            Scanner ss = new Scanner(fileseller);
            String buy;
            String sell;


            while (ss.hasNextLine()){
                sell = ss.nextLine();
                String[] temps = sell.split(":");
                if(temps[0].equals(username) && temps[1].equals(password)){
                   userType= 1;
                   break;
                }

            }
            while (sb.hasNextLine()){
                buy = sb.nextLine();
                String[] tempb = buy.split(":");
                if(tempb[0].equals(username) && tempb[1].equals(password)){
                    userType= 0;
                    break;
                }

            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(userType);
        return userType;
    }

}
