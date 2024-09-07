import java.util.Scanner;

// Main class
class Main {
    public static void main(String[] args) {
        Encryption e = new Encryption();
        e.encryption();
    }
}

// Encryption class
class Encryption {

    // Variable for the Generalized term
    private String x = "x"; // Placeholder for the general variable

    // Method to start the Encryption technique
    public void encryption() {
        System.out.print("You can enter the plain text: ");
        Scanner scanner = new Scanner(System.in);
        String plainText = scanner.nextLine();
        int len = plainText.length();
        System.out.println("The length of the plain text is: " + len);
        // Call the cosine function
        String result = Cosine(len);
        System.out.println("This is the output of the code: " + result);
    }

    // Method to calculate the General Term of the Cosine Function as a symbolic string
    public String GeneralTerm(int len) {
        String factorial = String.format("%d!", 2 * len);
        return String.format(
                "(-1)^%d * %s^(%d) / %s",
                len, x, 2 * len, factorial
        );
    }

    // Method for the Cosine Function expression
    public String Cosine(int len) {
        StringBuilder cosine = new StringBuilder("cos(" + x + ") = ");
        cosine.append("1");
        for (int i = 1; i < len; i++) {
            cosine.append(" + ").append(GeneralTerm(i));
        }
        return cosine.toString();
    }
}
