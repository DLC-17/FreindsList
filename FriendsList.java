import java.time.LocalDate;

public class FriendsList {
    private Friend_Node head;
    private Friend_Node tail;

    public void addknownFriend(String name, char sex, LocalDate birthDate, String grouping, String interests, String experiences)
    {
        Friend_Node newFriend = new Friend_Node();
        newFriend.name= name;
        newFriend.sex=sex;
        newFriend.birthdate = birthDate;
        newFriend.grouping= grouping;
        newFriend.interests=interests;
        newFriend.experiences=experiences;
        if (head == null)
        {
            tail=newFriend;
            head=newFriend;
        }
        else
        {
            tail.next=newFriend;
            tail=newFriend;
        }
    }

    public void addFriend(String name)
    {
        Friend_Node newFriend = new Friend_Node();
        newFriend.name= name;
        if (head == null)
        {
            tail=newFriend;
            head=newFriend;
        }
        else
        {
            tail.next=newFriend;
            tail=newFriend;
        }
    }

    public static void main(String[] args)
{
    FriendsList myfriends = new FriendsList();

    // Add a known friend with details
    myfriends.addknownFriend("Remmy", 'M', LocalDate.parse("2000-12-29"), "school", "Rock climbing, running, jumping, playing", null);

    // Add a friend with only the name
    myfriends.addFriend("John Doe");

    // Print all information about each person
    Friend_Node node = myfriends.head;
    while (node != null) {
        System.out.println("Name: " + node.name);
        System.out.println("Sex: " + node.sex);
        System.out.println("Birthdate: " + node.birthdate);
        System.out.println("Grouping: " + node.grouping);
        System.out.println("Interests: " + node.interests);
        System.out.println("Experiences: " + node.experiences);
        System.out.println(); // Add a line break for better readability

        node = node.next;
    }
}
}