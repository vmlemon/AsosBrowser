package example.com.astateofstyle;

//import com.example.astateofstyle.AsosApi;
import retrofit.RestAdapter;

/**
 * Created by tyson_000 on 14/10/2016.
 */

public class AsosSvc {

    public static AsosApi PrepareAsosApi() {
        RestAdapter.Builder builder = new RestAdapter.Builder().
                setEndpoint(Constants.KEndpointRootUri)
                /* setErrorHandler(new APIErrorHandler()*/
                .setLogLevel(RestAdapter.LogLevel.FULL);

        return  builder.build().create(AsosApi.class);
    }
}
