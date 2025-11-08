package ExceptionHandeling;

public class ExceptionHandlingTypes {
    // Checked Exception Example
    public void checkedExceptionExample() {
        try {
            throw new Exception("This is a checked exception");
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
            e.printStackTrace();
            // Handle checked exception
            System.out.println("Handling checked exception");
            // Additional handling logic
            // For example, logging the error or notifying the user
            System.out.println("Logging error: " + e.getMessage());
            // Additional logging or notification logic
            // For example, sending an email notification
            System.out.println("Sending email notification for error: " + e.getMessage());

        }
    }
    // Unchecked Exception Example
    public void uncheckedExceptionExample() {
        try {
            throw new RuntimeException("This is an unchecked exception");
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
            e.printStackTrace();
            // Handle unchecked exception
            System.out.println("Handling unchecked exception");
            // Additional handling logic
            // For example, logging the error or notifying the user
            System.out.println("Logging error: " + e.getMessage());
            // Additional logging or notification logic
            // For example, sending an email notification
            System.out.println("Sending email notification for error: " + e.getMessage());
        }
    }
    // Error Example
    public void errorExample() {
        try {
            throw new StackOverflowError("This is an error");
        } catch (StackOverflowError e) {
            System.out.println("Caught error: " + e.getMessage());
            e.printStackTrace();
            // Handle error
            System.out.println("Handling error");
            // Additional handling logic
            // For example, logging the error or notifying the user
            System.out.println("Logging error: " + e.getMessage());
            // Additional logging or notification logic
            // For example, sending an email notification
            System.out.println("Sending email notification for error: " + e.getMessage());

        }   
    }
}
