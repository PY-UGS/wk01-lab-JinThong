public class SwitchCase 
{
    public static void main(String arg[]) 
    {
        String currency = "CSC1009"; 
        switch(currency)
        {
            case "CSC1006":
            System.out.println("Mathematics 2"); break;
            case "CSC1007":
            System.out.println("Operating Systems"); break;
            case "CSC1008":
            System.out.println("Data Structure and Algorithms"); break;
            case "CSC1009":
            System.out.println("Onject Oriented Programming"); break;
            case "CSC1010":
            System.out.println("Computer Network"); break;
            default:
            System.out.println("Unknown Module"); break;
            }
            System.out.println("After switch");
    }
}
  