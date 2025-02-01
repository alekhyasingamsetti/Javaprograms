package Task1stFeb;

import java.util.Scanner;

public class website_based_on_domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website URL");
        String websiteURL = sc.next();
        if (websiteURL.endsWith(".com")) {
            System.out.println("The website type is: Commercial website");
        } else if (websiteURL.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (websiteURL.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (websiteURL.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (websiteURL.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (websiteURL.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else {
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
