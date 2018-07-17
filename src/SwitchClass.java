import java.util.Scanner;

public class SwitchClass {

    public static void main(String[] args) {
        String code ;
        String description;
        System.out.print("Please enter a code :");
        Scanner keyscan = new Scanner(System.in);
        code = keyscan.next();

        switch (code) {
            case "BALL":  description = "Golf Balls (1 dozen) \t $38.00";
                break;
            case "DRV01":  description = "Big Bertha Driver \t $449.95";
                break;
            case "DRV02":  description = "Vaporizer Driver \t $375.00";
                break;
            case "DRV03":  description = "Fly-Z Driver \t $179.00";
                break;
            case "SET01":  description = "Project Manager Gold Club Set \t $179.00";
                break;
            case "SET02":  description = "Junior VP Golf Club Set \t $225.00";
                break;
           case "SET03":  description = "Executive Golf Club Set \t $299.95";
                break;
            case "SET04":  description = "CEO Golf Club Set \t  $374.95";
                break;
            case "SET05":  description = "Chairman of the Board Club Set \t  $495.00";
                break;
            default: description = "Unknown";
                break;
        }
        System.out.print(description);
    }

}
