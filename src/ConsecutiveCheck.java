import java.math.BigInteger;

public class ConsecutiveCheck {


    public String checkConsecutives(Object str) {

        try {

            if (str.toString().length() != 0) {

                if (str instanceof String) {

                    BigInteger[] numbers = convertStringToInteger(str.toString());
                    int count = 0;
                    int Min_COUNT = 7;
                    for (int i = 1; i < numbers.length; i++) {


                        if ((numbers[i].subtract(numbers[i - 1])).abs().compareTo(new BigInteger("1")) == 0) {

                            count++;

                        } else {

                            continue;
                        }


                    }

                    if (count >= Min_COUNT - 1) {

                        return prepareOutput(true, numbers);

                    } else {

                        return prepareOutput(false, numbers);
                    }

                } else {

                    throw new Exception("invalid input");
                }

            } else {

                return "size 0";
            }


        } catch (Exception e) {

            return "invalid input";
        }


    }

    public BigInteger[] convertStringToInteger(String str) {

        String[] individualString = str.split(" ");
        BigInteger[] arr = new BigInteger[individualString.length];

        for (int i = 0; i < individualString.length; i++) {
            arr[i] = new BigInteger(individualString[i]);
        }

        return arr;

    }

    public String prepareOutput(boolean found, BigInteger[] arr) {

        StringBuilder opStr = new StringBuilder();
        if (found) {
            for (int i = 0; i < arr.length; i++) {

                opStr.append(arr[i].toString());

                if (i < arr.length - 1) {

                    opStr.append(",");
                }

            }
            opStr.append(" are consecutive numbers");

        } else {

            for (int i = 0; i < arr.length; i++) {

                opStr.append(arr[i].toString());

                if (i < arr.length - 1) {

                    opStr.append(",");
                }
            }
            opStr.append(" are not consecutive numbers");
        }

        return opStr.toString();

    }


}
