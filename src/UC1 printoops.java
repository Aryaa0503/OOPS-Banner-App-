public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define the gap between letters (5 spaces)
        String gap = "     ";

        // UC5: Combining declaration, initialization, and String.join()
        // into a single statement to remove repetitive assignment lines.
        String[] bannerLines = {
                String.join("", "*****", gap, "*****", gap, "*******", gap,  "********"),
                String.join("", "** **", gap, "** **", gap, "**   **", gap, "**"),
                String.join("", "** **", gap, "** **", gap, "**   **", gap, "**"),
                String.join("", "** **", gap, "** **", gap, "*******", gap,  "********"),
                String.join("", "** **", gap, "** **", gap, "**", gap, "           **"),
                String.join("", "** **", gap, "** **", gap, "**", gap, "           **"),
                String.join("", "*****", gap, "*****", gap, "** ", gap, "    ********")
        };

        // UC5: Utilizing an enhanced for loop to display the banner lines efficiently.
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}