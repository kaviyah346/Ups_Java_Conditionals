import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //selected or rejected
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your GD score:");
        int s1=sc.nextInt();
        if(s1>75)
        {
            System.out.println("Enter your Aptitude score:");
            int s2=sc.nextInt();
            if(s2>75)
            {
                System.out.println("Congratulations! You are selected!!");

            }
            else
                System.out.println("Sorry ,You are not selected.");
        }
        else
            System.out.println("Sorry ,You are not selected.");

        //Switch to print desired item
        System.out.println("Enter 1.vegetables\n2.Fruits\n3.others\n");
        int c=sc.nextInt();
        switch(c)
        {
            case 1: {
                System.out.println("Enter 1.Tomato\n 2.Potato\n");
                int veg = sc.nextInt();
                switch (veg) {
                    case 1:
                        System.out.println("Tomato");
                        break;
                    case 2:
                        System.out.println("Potato");
                        break;
                    default:
                        System.out.println("Other");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Enter 1.Apple\n 2.Orange");
                int veg = sc.nextInt();
                switch (veg) {
                    case 1:
                        System.out.println("Apple");
                        break;
                    case 2:
                        System.out.println("Orange");
                        break;
                    default:
                        System.out.println("Other");
                        break;

                }
                break;
            }
            default:
                System.out.println("Other");

        }
    }
}