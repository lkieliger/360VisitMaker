package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.UriUtils.INVALID_URI;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public class Scene {

    private final String tag;
    private String imageUri;
    private String previewUri;
    private List<Hotspot> hotspots;

    public Scene(String tag) {
        this.tag = tag;
        this.imageUri = INVALID_URI;
        this.previewUri = INVALID_URI;

        hotspots = new ArrayList<>();
    }

    public Scene(String tag, String imageUri, String previewUri) {
        this.tag = tag;
        this.imageUri = imageUri;
        this.previewUri = previewUri;

        hotspots = new ArrayList<>();
    }

    public String getTag() {
        return tag;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getPreviewUri() {
        return previewUri;
    }

    public void setPreviewUri(String previewUri) {
        this.previewUri = previewUri;
    }

    public List<Hotspot> getHotspots() {
        return Collections.unmodifiableList(new ArrayList<>(hotspots));
    }

    public void addHotspot(Hotspot h) {
        hotspots.add(new Hotspot(h));
    }

}
