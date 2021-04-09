package demo;

public class ExceptionHandlingDemo {
        /*
        /What is exception handling?
        Exception unexpected condition at runtime
        Exception Handling
        Handling any unexpected behavior during execution
        Catch the exception and log messages for troubleshooting
        Enables continuation of runs even if a test fails
        Practical Examples in the link below
        https://www.youtube.com/results?search_query=%23ExceptionHandlingInJava
         */
        public static void main(String[] args) {

            try {
                System.out.println("Testing Exception handling");
                int i = 1/0;
                System.out.println("Test Completed");
            }
            catch (Exception exp){
                System.out.println("Message is " +exp.getMessage());
                System.out.println("Cause is " +exp.getCause());
                exp.printStackTrace();
            }
            // will always execute irrespective of an exception or not
            finally {
                System.out.println("I am inside the finally block");
            }
        }
    }
