package example.com.astateofstyle;

/**
 * Created by tyson_000 on 14/10/2016.
 */


import java.util.List;

import example.com.astateofstyle.models.categories.Category;
import rx.Observable;
import example.com.astateofstyle.Constants.*;
import rx.Observer;
import retrofit.http.GET;

import static example.com.astateofstyle.Constants.KWomenCatsBaseUri;

//import static final example.com.astateofstyle.Constants.KWomenCatsBaseUri;


public interface AsosApi {
@GET(KWomenCatsBaseUri)
    Observable<List<Category>> GetCategories();
}
