public class Coordinates {
    static double distance(double lat1, double lat2, double lon1, double lon2) {
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        double dist_lon = lon2 - lon1;
        double dist_lat = lat2 - lat1;
        double a = Math.pow(Math.sin(dist_lat / 2.0D), 2.0D) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dist_lon / 2.0D), 2.0D);
        double c = 2.0D * Math.asin(Math.sqrt(a));
        double r = 6371.0D;
        return c * r;
    }
}
