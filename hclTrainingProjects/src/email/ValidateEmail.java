package email;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	
	public static final String REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        
        List <String> emails = new ArrayList<String>();
        List <String> validEmails = new ArrayList<String>();
        
        emails.add("foo@gmail.com");
        emails.add("jane.doe@yahoo.com");
        emails.add("austin.nguyen@hcl.com");
        emails.add("foo@outlook.com");
        emails.add("bar.com");
        emails.add("cris!@jobs.com");
        
        Pattern pattern = Pattern.compile(REGEX);
		
		for (String email: emails) {
			Matcher matcher = pattern.matcher(email);
			if(matcher.matches()) {
				validEmails.add(email);
			}
		}
        
        do {
	        System.out.print("Validate email : ");
	        String userEmail = scan.nextLine();
	        
	        for (String validEmail : validEmails) {
	            if (validEmail.compareTo(userEmail) == 0) {
	                System.out.println("Email validated");
	                isValid = true;
	                break;
	            }
	        }
	        
	        if (!isValid) {
	            System.out.println("Email is invalid, please try again");
	        }
	        
        } while(!isValid);
        
        System.out.println("Program Exiting...");
		scan.close();
		System.exit(0);
    }
}
