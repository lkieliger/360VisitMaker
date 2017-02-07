package textgen;

import graph.Hotspot;
import graph.Scene;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public class JavascriptPrinter implements GraphPrinter {

    public String print(Scene s) {
        StringBuilder sb = new StringBuilder();

        sb.append("\t" + s.getTag() + ": {\n");
        sb.append("\t\timage: '" + s.getImageUri() + "',\n");
        sb.append("\t\tpreview: '" + s.getPreviewUri() + "',\n");
        sb.append("\t\thotspots: {\n");

        for (int i = 0; i < s.getHotspots().size(); i++) {
            sb.append(print(s.getHotspots().get(i)));
            if (i < s.getHotspots().size() - 1)
                sb.append(",\n");
            else
                sb.append("\n");
        }

        sb.append("\t\t}\n");
        sb.append("\t}");

        return sb.toString();
    }

    @Override
    public String print(Hotspot h) {
        StringBuilder sb = new StringBuilder();

        sb.append("\t\t\t" + h.getSceneTag() + ": {\n");
        sb.append("\t\t\t\tpitch: " + h.getTheta() + ",\n");
        sb.append("\t\t\t\tyaw: " + h.getPhi() + ",\n");
        sb.append("\t\t\t\tradius: " + h.getRadius() + ",\n");
        sb.append("\t\t\t\tdistance: " + h.getDistance() + "\n");
        sb.append("\t\t\t}");

        return sb.toString();
    }

}
