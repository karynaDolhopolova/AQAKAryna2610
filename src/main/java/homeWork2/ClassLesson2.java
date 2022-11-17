package homeWork2;

public class ClassLesson2 {
    public static void main(String[] args) {
        String s1="karyna";
        String s2="Dolh0polova";

        System.out.println("Name: "+s1.substring(0, 1).toUpperCase()+s1.substring(1,6));
        System.out.println("Surname: "+s2.replace("0", "o"));
        System.out.println("Name length is "+s1.length()+" and Surname length is "+s2.length());
        System.out.println("The initials are: "+s1.substring(0, 1).toUpperCase()+"."+s2.charAt(0)+".");
    }
}
