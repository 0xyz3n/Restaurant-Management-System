import java.util.Scanner;
public class Login {

    static class Admin {
        private static String uname = "admin";
        private static String pass = "admin";
    }

    static class UserName{
        private static boolean sanityChecks(String s) {

            char c = '\u0000';

            for(int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if(!Character.isLetterOrDigit(c))
                    return false;
            }
            return true;
        }
    }

    static class Password {
        
        private static boolean sanityChecks(String s) {

            char c = '\u0000';

            for(int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if(Character.isWhitespace(c))
                    return false;
            }

            return true;
        }

        private void setPassword() {

        }
    }

    static boolean success() {
        String uname = "";
        String pass = "";
        while(true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter admin unsername :");
                uname = in.next();
                System.out.println("Enter password :");
                pass = in.next();

                if(!Admin.uname.equals(uname) ) {
                    System.out.println("Wrong user name !");
                    if(!UserName.sanityChecks(uname))
                        System.out.println("[WARNING] : Username may only contain alphanumeric characters or numbers.");
                }
                

                if(!Admin.pass.equals(pass)) {
                    System.out.println("Wrong password !");
                    if(!UserName.sanityChecks(uname))
                        System.out.println("[WARNING] : Password may only contain alphanumeric characters , numbers or special characters.");
                }
                
                if(!Admin.uname.equals(uname) || !Admin.pass.equals(pass)) {
                    System.out.print("Retry (y/n) ? : ");
                    char c = in.next().charAt(0);
                    if(c == 'y') 
                        continue;
                    else if(c == 'n') 
                        break;
                    else {
                        System.out.println("Error ! Please try again");
                        continue;
                    } 
                        
                }

                if(Admin.uname.equals(uname) && Admin.pass.equals(pass)) {
                    return true;
                }
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Error ! Please try again");
                continue;
            }
            
        }

        return false;
    }

}
