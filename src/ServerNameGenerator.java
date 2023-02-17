public class ServerNameGenerator {

        String[] adjectives = {"large", "tiny", "slow", "fast", "heavy", "light", "strong", "weak", "short", "long"};
        String[] nouns = {"Marge", "Tim", "Moe", "cheetah", "Beverly", "pole", "dancer", "jaw", "skirt", "jacket"};

        public static String serverName(String[] array){
            int random = (int) (Math.random() * array.length);
            return array[random];
        }

    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.println(serverName(server.adjectives) + "-" + serverName(server.nouns));
    }

}
