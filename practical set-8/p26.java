import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Please provide file name");
                return;
            }

            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
