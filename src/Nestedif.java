public class Nestedif {
    public static void main(String[] args) {
        int age = 40;
        char gender = 'f';
        if (gender == 'm')
        {
            if (age > 50)
            System.out.println("Ticket price is Inr 10 only");
            else
            System.out.println("Ticket price is Inr 20 only");
        }
        else
        {
            if (age < 30)
                System.out.println("Ticket price is Inr 50 only");
            else
                System.out.println("Ticket price is Inr 40 only");
        }
    }
}
