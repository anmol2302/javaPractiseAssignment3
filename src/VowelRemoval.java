import java.util.Arrays;

public class VowelRemoval {


    public String removeVowels(Object[] places) {
        StringBuilder sb=new StringBuilder();
        try {

            if (places.length != 0) {

                if (places instanceof String[]) {

                    for (int i = 0; i < places.length; i++) {

                        char[] individualChar = places[i].toString().toCharArray();
                        sb.append(new String(individualChar[0]+"").toUpperCase());
                        for (int j = 1; j < individualChar.length; j++) {
                            if (individualChar[j] == 'a' || individualChar[j] == 'e' || individualChar[j] == 'i' || individualChar[j] == 'o' || individualChar[j] == 'u') {
                                continue;

                            } else {

                                sb.append(individualChar[j]);
                            }
                        }
                        if(i<places.length-1)
                        {
                        sb.append(" ");}
                    }

                } else {

                    throw new Exception("invalid input");

                }
            }
        } catch (Exception e)
        {
            sb.append("invalid input");
            return sb.toString();
        }
        System.out.println(sb.toString());
return sb.toString();

    }


}
