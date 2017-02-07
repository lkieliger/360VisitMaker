package textgentests;

import graph.Hotspot;
import graph.Scene;
import org.junit.Test;
import textgen.JavascriptPrinter;

import static org.junit.Assert.assertEquals;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public class JavascriptPrinterTest {

    private Hotspot h1 = new Hotspot("h1", 0, 90, 0.05, 1);
    private Hotspot h2 = new Hotspot("h2", 10, 20, 0.03, 4);
    private Scene s1 = new Scene("scene1", "uri1", "uri2");
    private JavascriptPrinter printer = new JavascriptPrinter();

    @Test
    public void hotspotPrintIsCorrect() {
        assertEquals("\t\t\th1: {\n" +
                        "\t\t\t\tpitch: 0.0,\n" +
                        "\t\t\t\tyaw: 90.0,\n" +
                        "\t\t\t\tradius: 0.05,\n" +
                        "\t\t\t\tdistance: 1.0\n" +
                        "\t\t\t}",
                printer.print(h1));
    }

    @Test
    public void emptyScenePrintIsCorrect() {
        assertEquals("\tscene1: {\n" +
                        "\t\timage: 'uri1',\n" +
                        "\t\tpreview: 'uri2',\n" +
                        "\t\thotspots: {\n" +
                        "\t\t}\n" +
                        "\t}",
                printer.print(s1));
    }

    @Test
    public void nonEmptyScenePrintIsCorrect() {
        s1.addHotspot(h1);
        s1.addHotspot(h2);
        assertEquals("\tscene1: {\n" +
                        "\t\timage: 'uri1',\n" +
                        "\t\tpreview: 'uri2',\n" +
                        "\t\thotspots: {\n" +
                        "\t\t\th1: {\n" +
                        "\t\t\t\tpitch: 0.0,\n" +
                        "\t\t\t\tyaw: 90.0,\n" +
                        "\t\t\t\tradius: 0.05,\n" +
                        "\t\t\t\tdistance: 1.0\n" +
                        "\t\t\t},\n" +
                        "\t\t\th2: {\n" +
                        "\t\t\t\tpitch: 10.0,\n" +
                        "\t\t\t\tyaw: 20.0,\n" +
                        "\t\t\t\tradius: 0.03,\n" +
                        "\t\t\t\tdistance: 4.0\n" +
                        "\t\t\t}\n" +
                        "\t\t}\n" +
                        "\t}",
                printer.print(s1));
    }
}
