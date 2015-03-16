/**
 * Created by vagrant on 2/7/15.
 */
import java.util.*;

public class Group{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String names = reader.nextLine();
        String yourName = null;
        int assigNum = 0;

	//input for review group generator
        //agopar@csumb.edu,gazapata@csumb.edu,sbharat@csumb.edu,aruval@csumb.edu,mcockman@csumb.edu,arlopez@csumb.edu agopar@csumb.edu 1
        
        String[] groupMembers = names.split(","); 
        String[] name = groupMembers[groupMembers.length - 1].split(" ");
               
        yourName = name[1];
        assigNum = Integer.parseInt(name[2]);
        groupMembers[groupMembers.length-1] = name[0];
        
        ArrayList<String> members = new ArrayList<String>(Arrays.asList(groupMembers));    
        String[] finalAr = makeGroup(yourName, assigNum, members);
        
        System.out.printf("[%s,%s,%s]",finalAr[0],finalAr[1],finalAr[2]);
    }
    
    public static String[] makeGroup(String name,int i, ArrayList<String> groupMembers)
    {
        Collections.shuffle(groupMembers, new Random(i));
        
        String[] firstGroup = {groupMembers.get(0), groupMembers.get(1),groupMembers.get(2)};
        String[] secondGroup = {groupMembers.get(3), groupMembers.get(4),groupMembers.get(5)};
                
        for(int x = 0; x <= 3;x++){
            if(firstGroup[x].equals(name))
                return firstGroup;
            else if(secondGroup[x].equals(name))
                return  secondGroup;
        }
        
        return null;
    }
}
