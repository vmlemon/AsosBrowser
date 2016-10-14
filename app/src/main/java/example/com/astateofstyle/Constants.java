package example.com.astateofstyle;

/**
 * Created by tyson_000 on 14/10/2016.
 */

public class Constants {
    //Base URLs

    public static String KEndpointRootUri = "https://dl.dropboxusercontent.com/u/1559445/ASOS/SampleApi";

    public static final String KWomenCatsBaseUri = "/cats_women.json";
    public static String KMenCatsBaseUri = "/cats_men.json";
    public static String KProductsByCatUri = "/anycat_products.json";
    public static String KProductDetailsUri = "/anyproduct_details.json";

    public String GlueUrl(String aUrl) {
        return KEndpointRootUri + aUrl;
    }

}
