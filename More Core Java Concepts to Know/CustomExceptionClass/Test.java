package CustomExceptionClass;

public class Test {
    public static void validateAge(int age) throws CustomException {
        if (age < 18)
            throw new CustomException("Age is not valid");
        else
            System.out.println("Validated");
    }

    public static void main(String[] args) {
        try {
            validateAge(17);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
