package example.com.astateofstyle;

import android.content.res.AssetFileDescriptor;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.github.pwittchen.reactivenetwork.library.Connectivity;
import com.github.pwittchen.reactivenetwork.library.ReactiveNetwork;

import java.util.List;
import java.util.logging.Logger;

import example.com.astateofstyle.models.categories.Category;
import example.com.astateofstyle.models.categories.Listing;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class MainActivity extends AppCompatActivity {

    public AsosApi iCoreApiController;
    public CompositeSubscription iSubs = new CompositeSubscription();

    NavigationView iNaviView;


    public void BuildCategoryMenu(Category aCatSet) {

        //Purge stale, and placeholder categories
        iNaviView.getMenu().clear();

        List<Listing> cats = aCatSet.getListing();

        Log.d("AsosSubs", "Got categories: " + cats.size());


        for (int aPos = 0; aPos < cats.size(); aPos++) {
            Log.d("AsosSubs", "The name is : " + cats.get(aPos).getName());
            iNaviView.getMenu().add(0,aPos,0, cats.get(aPos).getName());
        }




    }

    //Set up the listeners for the menu items...
    @Override
    public boolean onOptionsItemSelected(MenuItem aItem) {
        switch (aItem.getItemId()) {
            default:
                Log.d("AsosMenu", "An item was clicked, and a handler wasn't implemented (" +
                        aItem.getItemId() + ")");
        }

        return super.onOptionsItemSelected(aItem);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iCoreApiController = AsosSvc.PrepareAsosApi();

        iNaviView = (NavigationView) findViewById(R.id.navigation);

//Set up the NavigationView's click handlers
        iNaviView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                                                        @Override
                                                        public boolean onNavigationItemSelected(@NonNull MenuItem aItem) {

                                                            switch (aItem.getItemId()) {
                                                                default:
                                                                Log.d("AsosNavi", "Selected category ID : " + aItem.getItemId());
                                                            }

                                                            return true;
                                                        }
                                                    }
        );

        //Watch for network connectivity changes
        ReactiveNetwork.observeInternetConnectivity()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Boolean>() {
                    @Override public void call(Boolean isConnectedToInternet) {

                        Log.d("AStateOfStyle", "Internet connectivity status: " + isConnectedToInternet);

                        if (isConnectedToInternet == true) {
                            Toast.makeText(getApplicationContext(), "Welcome to the world of Asos!", Toast.LENGTH_LONG);
                        }

                        else {
                            Toast.makeText(getApplicationContext(), "No Network Connectivity", Toast.LENGTH_LONG);
                        }



                    }
                });

        //Initialise the RxJava/Retrofit API handlers
         iSubs.add(iCoreApiController.GetCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<Category>() {


                    @Override
                    public void onCompleted() {
                        Log.d("AsosSubs", "Finished fetching data...");
                    }


                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onNext(Category aCategories) {

                        BuildCategoryMenu(aCategories);

                    };
                }));

    }
}


