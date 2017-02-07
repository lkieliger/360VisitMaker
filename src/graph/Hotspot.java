package graph;

/**
 * 360VisitMaker - LKieliger on 07.02.2017.
 */


public class Hotspot {

    private String sceneTag;
    private double theta;       //Polar angle
    private double phi;         //Azimuthal angle
    private double radius;
    private double distance;

    public Hotspot() {
        sceneTag = null;
        phi = 0;
        theta = 0;
        radius = 0;
        distance = 0;
    }

    public Hotspot(String sceneTag, double theta, double phi, double radius, double distance) {
        this.sceneTag = sceneTag;
        this.theta = theta;
        this.phi = phi;
        this.radius = radius;
        this.distance = distance;
    }

    public Hotspot(Hotspot h) {
        this.sceneTag = h.sceneTag;
        this.theta = h.theta;
        this.phi = h.phi;
        this.radius = h.radius;
        this.distance = h.distance;
    }

    public String getSceneTag() {
        return sceneTag;
    }

    public void setSceneTag(String sceneTag) {
        this.sceneTag = sceneTag;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
