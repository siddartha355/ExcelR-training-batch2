public class UserLogin {
    public static void main(String[] args) {
        String username = "user001"; 
        String pd = "user_001"; 
        
        // Use .equals() for comparing string values
        while(username.equals("user001") && pd.equals("user_001")) {
            System.out.println("Happy New Year");
            break; // This break will exit the loop after the first iteration
        }
    }
}
