import static org.junit.Assert.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        List<String> expected = Arrays.asList("https://something.com", "some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLinks2() throws IOException {
        List<String> expected = Arrays.asList("https://something.com", "some-page.html");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLinks3() throws IOException {
        List<String> expected = Arrays.asList();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLinks4() throws IOException {
        List<String> expected = Arrays.asList();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLinks5() throws IOException {
        List<String> expected = Arrays.asList();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

    @Test
    public void testLabReport1() throws IOException {
        List<String> expected = Arrays.asList("`google.com", "google.com", "ucsd.edu");
        Path fileName = Path.of("lab-report-test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(content);
        assertEquals(expected, actual);
    }

}