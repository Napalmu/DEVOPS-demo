import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

class SiteGen {
    static String siteTitle = "My favorite movies";

    static List<String> movieList = List.of(
        "Star Wars",
        "Star Trek",
        "Battlestar Galactica"
    );

    static String htmlString =
        "<html>" +
            "<head><title>" + siteTitle + "</title></head>" +
            "<body>" +
                "<h1>" + siteTitle + "</h1>" +
                "<ul>" + movieList.stream().map(i -> "<li>"+ i + "</li>").collect(Collectors.joining()) + "</ul>" +
            "</body>" +
        "</html>";

    public static void main(String args[]) throws Exception {
        Files.createDirectory(Paths.get("public/"));
        Files.write(Paths.get("public/index.html"), htmlString.getBytes());
    }
}
