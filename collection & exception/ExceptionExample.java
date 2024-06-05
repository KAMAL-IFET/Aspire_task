public class ExceptionExample {

    // This method declares that it throws CustomCheckedException
    public static void methodThatThrows() throws CustomCheckedException {
       
        boolean errorCondition = true;
        if (errorCondition) {
            throw new CustomCheckedException("This is a custom checked exception.");
        }
    }

    public static void main(String[] args) {
        try {
           
            methodThatThrows();
        } catch (CustomCheckedException e) {
          
            System.out.println("Caught the custom checked exception: " + e.getMessage());
        } finally {
           
            System.out.println("This is the finally block.");
        }

        try {
           
            int result = 10 / 0;
        } catch (ArithmeticException e) {
     
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } finally {
            
            System.out.println("This is the finally block for the unchecked exception.");
        }
    }
}
