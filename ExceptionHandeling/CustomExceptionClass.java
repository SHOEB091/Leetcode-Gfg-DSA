package ExceptionHandeling;

public class CustomExceptionClass {
    
    // Custom Exception Class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method that throws custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote.");
        } else {
            System.out.println("Age is valid to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
            e.printStackTrace();
            // Handle custom exception
            System.out.println("Handling custom exception");
            // Additional handling logic
            // For example, logging the error or notifying the user
            System.out.println("Logging error: " + e.getMessage());
            // Additional logging or notification logic
            // For example, sending an email notification
            System.out.println("Sending email notification for error: " + e.getMessage());
        }
    }

}
