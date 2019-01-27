import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String st = "%B1234123412341234^Cardsfd43654356235454631254656435135464543654361254656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340ohn^235454631123%B4128123412341234^Binhai/Zhu^150910100000019301000000877000000?;4128123412341234=000?;1234123412341fdwei000dfg00?;12341%B123412341234235454631254656435135464543513546546;1234123412^341246101193010877?00000?;1234123412340000?;123412341dfggadsfi;1234123412341234=1405101193010877?00000?;1234123412340dfg;1234123412341fdwei1405101235649855189454556435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340000?;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^2354546311234123ohn^235454631254656435135464543513546546;1234123412341234=1405101193010877?00000?;123412341234000451234123412341fdwei14051012354546312546^11193010877?00000?;1234123412340000?;1234123412341fdwei;1234123412341354645434656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123414635000dfg;1234123412341fdweif^123545466;123412341231509104123ohn^235454631254656435135464543513546546;1234123412341234=1405101193010877?%B41281234123Yang9301000000877000000?;4128123412341293010877?%B4128123412341234^Binhai/0000877000000?;4128123412341234=1509101193010877?000?;1234123412341fdwei000dfg00?;12341%B123412341234235454631254656435135464543513546546;1234123412^341246101193010877?00000?;1234123412340000?;123412341dfggadsfi;1234123412341234=1405101193010877?00000?;1234123412340dfg;1234123412341fdwei1405101235649855189454556435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340000?;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^2354546311234123ohn^235454631254656435135464543513546546;1234123412341234=1405101193010877?00000?;123412341234000451234123412341fdwei14051012354546312546^11193010877?00000?;1234123412340000?;1234123412341fdwei;1234123412341354645434656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123414635000dfg;1234123412341fdweif^123545466;1234123412346;1234123412^341246101193010877?00000?;1234123412340000?;123412341dfggadsfi;1234123412341234=1405101193010877?00000?;1234123412340dfg;1234123412341fdwei1405101235649855189454556435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340000?;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^23534=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^2354546311234123ohn^235454631254656435135464543513546546;1234123412341234=1405101193010877?00000?;123412341234000451234123412341fdwei14051012354546312546^11193010877?00000?;1234123412340000?;1234123412341fdwei;1234123412341354645434656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123414635000dfg;1234123412341fdweif^123545466;1234123455189454556435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340000?;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^23534=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^2354546311234123ohn^235454631254656435135464543513546546;1234123412341234=1405101193010877?00000?;123412341234000451234123412341fdwei14051012354546312546^11193010877?00000?;1234123412340000?;1234123412341fdwei;1234123412341354645434656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123414635000dfg;1234123412341fdweif^123545466;1234123412346;1234123412^341246101193010877?00000?;1234123412340000?;123412341dfggadsfi;1234123412341234=1405101193010877?00000?;1234123412340dfg;1234123412341fdwei1454546312546^11193010877?00000?;1234123412340000?;1234123412%B4128123412341235^Paxton/John^181213100000019301000000877000000?;4128123412341234=1509101193010877?341fdwei;1234123412341354645434656435135464543513546546;1234123412341234=1405101193010877?00000?;1234123414635000dfg;1234123412341fdweif^123545466;1234123455189454556435135464543513546546;1234123412341234=1405101193010877?00000?;1234123412340000?;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;12341234365hn^23534=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;123412sfddi000000000000?;1234^234=1405101193010877?00000?;123412341234000dfg12^3412341234sfdeif^123545466;1234123";        StringTokenizer mt = new StringTokenizer(st, "%?;");
        //StringTokenizer end = new StringTokenizer(st, "?");
        List<String> tracks = new ArrayList<>();
        ArrayList<String> unencryptedInfo = new ArrayList<>();

        while (mt.hasMoreTokens()) {
            String track = mt.nextToken();
            if (track.startsWith("B") && track.contains("^") && track.contains("/")) {
                //System.out.println("MT " + track);
                tracks.add(track);
            }
        }
        for (String t : tracks) {
            unencryptedInfo = getCardInfo(t, unencryptedInfo);
        }
        if (!unencryptedInfo.isEmpty()) {
            printCardInfo(unencryptedInfo);
        }
    }

    private static ArrayList getCardInfo(String track, ArrayList<String> unencryptedInfo) { // Method to print card info.

        List<String> cardInfo = new ArrayList<>();
        StringTokenizer info = new StringTokenizer(track, "^");
        while (info.hasMoreTokens()) {
            cardInfo.add(info.nextToken());
        }
        if (cardInfo.size() == 3) {
            String[] name_temp = cardInfo.get(1).split("/");    // Splits the string where the name is broken up by a "/"
            String name = name_temp[0] + name_temp[1];  // Concatenates the name string.
            String cardNum = cardInfo.get(0).substring(1);
            String cardNum_spaced = "";
            for (int i = 0; i < cardNum.length(); i += 4) { // Adds spaces to the credit card number to help with readability.
                cardNum_spaced += cardNum.substring(i, i + 4) + " ";
            }
            String expirationDate = cardInfo.get(2).substring(2, 4) + "/20" + cardInfo.get(2).substring(0, 2);
            String cvc = cardInfo.get(2).substring(4, 7);
//            System.out.println("Cardholder’s Name: : " + name + "\n" + "Card Number: " + cardNum_spaced + "\n" + "Expiration Date: " + expirationDate + "\nCVC Number: " + cvc + "\n");
            if (!unencryptedInfo.isEmpty()) {
                unencryptedInfo.add("Cardholder’s Name: : " + name + "\n" + "Card Number: " + cardNum_spaced + "\n" + "Expiration Date: " + expirationDate + "\nCVC Number: " + cvc + "\n");
            } else {
                unencryptedInfo.add("Cardholder’s Name: : " + name + "\n" + "Card Number: " + cardNum_spaced + "\n" + "Expiration Date: " + expirationDate + "\nCVC Number: " + cvc + "\n");
            }
        }
        return unencryptedInfo;
    }

    private static void printCardInfo(ArrayList<String> unencryptedInfo) {
        Map<Integer, String> number_endings = Map.of( //Dictionary to make our print statement grammatically correct for values less than 8.
                1, "st",
                2, "nd",
                3, "rd",
                4, "th",
                5, "th",
                6, "th",
                7, "th",
                8, "th"
        );
        System.out.println("There are " + unencryptedInfo.size() + " track I record's in the memory data");
        for (int i = 0; i < unencryptedInfo.size(); i++) {
            System.out.println("<Information of the " + (i + 1) + number_endings.get(i + 1) + " record>");
            System.out.println(unencryptedInfo.get(i));

        }
    }

}
