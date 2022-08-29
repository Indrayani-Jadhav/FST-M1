package Activities;

public class Activity5 {
    public static void main(String[] args)
    {
        Book novel=new MyBook();
        String title="Hover car racer";
        novel.setTitle(title);
        System.out.println("The title is "+novel.getTitle());
    }
}
