import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        final String regex = "[^abc]";
        final String string = "Farmingdale State College Bachelors in Artificial Intelligence Management is designed to meet both transfer and continuing education needs for students, preparing them for a wide range of careers in the emerging field of AI. This program builds a foundation of both managerial and technical skills by combining business and computer science to understand, develop and manage AI09 applications. In particular, the program builds technical skills in machine learning and management, enabling the student to apply those skills in areas such as marketing, finance, supply chain, and other basic functions. In addition, with courses on ethics and the societal implications of AI, the program reflects perspectives that are both diverse and international. The program is ideal for students with backgrounds in computer science and interested in learning more about the application of AI in business, and for students with backgrounds in business and interested in learning more about the technical aspects of AI. Student Name: Muhammad Abdullah Atif R02178890 ";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
