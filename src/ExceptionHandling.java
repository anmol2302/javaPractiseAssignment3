public class ExceptionHandling {

    public String throwingException(){

        try{
            throw new Exception("exception thrown in try");
        }
        catch(Exception e){
            System.out.println("exception caught in catch");
            return e.getMessage();
        }
        finally {
            System.out.println("in finally");

        }

    }















}
