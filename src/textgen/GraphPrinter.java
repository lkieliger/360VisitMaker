package textgen;

import graph.Hotspot;
import graph.Scene;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public interface GraphPrinter {
    String print(Scene p);

    String print(Hotspot p);
}
