public class CommandLineArray {
    public static void main(String[] args) {
        String[] strArray = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            strArray[i] = args[i];
        }
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}