public class _10_Extract_Class {
    // Old
    static class CustomerOld{
        String userName;
        // hobby
        boolean loveFootball;
        String favoriatePlayer;
    }
    
    // New
    static class CustomerNew{
        String userName;
        Hobby hobby;
    }
    static class Hobby{
        boolean loveFootball;
        String favoriatePlayer;
    }
        
}