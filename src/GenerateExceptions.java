public class GenerateExceptions {
    String sizeNegeative="array size cant be negeative";
    String outOfBound="array value cant be greater than array size";
    String nullPointer="null pointer exception is thrown";
    public void performArrayOnArray(int size,Object[] arr){

        try{

            if(size<0){

                throw new NegativeArraySizeException(sizeNegeative);
            }


            else{

                if(size<arr.length){


                    throw new ArrayIndexOutOfBoundsException(outOfBound);
                }
    arr = null;
    Object val = arr[9];
    throw new NullPointerException(nullPointer);





            }


        }
        catch(Exception e){

            if(e.getLocalizedMessage().equalsIgnoreCase(sizeNegeative)){

                System.out.println("NegeativeArraysSizeException is thrown");

            }
            else if (e.getLocalizedMessage().equalsIgnoreCase(outOfBound)){


                System.out.println("out of exception thrown");
            }
            else if(e.getLocalizedMessage().equalsIgnoreCase(nullPointer)){


                System.out.println("NUll pointer exception got thrown in catch");
            }



        }








    }


    public static void main(String[] args) {


        GenerateExceptions e=new GenerateExceptions();
        Object[] arr={1,2,3,5,56};
        e.performArrayOnArray(1,arr);
    }









}
