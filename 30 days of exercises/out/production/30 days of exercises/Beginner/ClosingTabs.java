import java.io.IOException;
import java.util.Scanner;


public class ClosingTabs {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String dateOfUser = scanner.nextLine();
        String[] datesOfUserSplit = dateOfUser.split(" ");

        int inforOfTags = Integer.parseInt(datesOfUserSplit[0]);
        int inforOfAction = Integer.parseInt(datesOfUserSplit[1]);

if(0 > inforOfTags || inforOfTags > 500) {
    throw new IllegalArgumentException("Number of tags must be between 0 and 500");
}else if(0 > inforOfAction && inforOfAction > 500){
    throw new IllegalArgumentException("Number of actions must be between 0 and 500");
}else{
    int time = 0;
    while(time < inforOfAction){
        String actionOfUser = scanner.next().trim().toLowerCase();
        if(actionOfUser.equals("fechou")) {
            inforOfTags++;
            time++;
        }else if(actionOfUser.equals("clicou")){
            inforOfTags--;
            time++;
    }
}
}
scanner.close();
System.out.println(inforOfTags);
    }
}
