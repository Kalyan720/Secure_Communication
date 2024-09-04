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

    // variable For the Generalised term
    private double x;

    // method to start the Encryption technique
    public void encryption() {
        System.out.print("you can enter the plain text : ");
        Scanner scanner = new Scanner(System.in);
        String PlainText = scanner.nextLine();
        int len = PlainText.length();
        System.out.print("The length of the plain text is : " + len);
        // Call the cosine function
        Cosine(len);
    }

    // method to Execute Factorial
    public int Factorial(int n){
        int result = 1;
        for (int i=0;i<n;i++){
            result *= i;
        }
        return result;
    }

    // Method to calculate the General Term of the Cosine Function
    public double GeneralTerm(int len){
        return ((Math.pow(-1,len)*(Math.pow(x,2*len))))/Factorial(2*len);
    }

    // Method For the Cosine Function
    public void Cosine(int len) {
        double cosine = 1;
        for (int i = 0; i < len; i++){
            cosine = cosine + GeneralTerm(i);
        }
    }
}


