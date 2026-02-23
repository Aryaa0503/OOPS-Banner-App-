public class uc4-Array-loops {

    public static void main(String[] args) {

        // Banner lines stored in String array
        String[] banner = {
                String.join(" ", "*****", "*   *", "*****", "*   *", "*   *"),
                String.join(" ", "*   *", "**  *", "* * *", "*  **", "*   *"),
                String.join(" ", "*****", "*   *", "*   *", "*   *", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *", "*****")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);

        }
    }
}