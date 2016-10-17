package example.com.astateofstyle;

import android.content.res.AssetFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.pwittchen.reactivenetwork.library.Connectivity;
import com.github.pwittchen.reactivenetwork.library.ReactiveNetwork;

import java.util.List;

import example.com.astateofstyle.models.categories.Category;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class MainActivity extends AppCompatActivity {

    public AsosApi iCoreApiController;
    public CompositeSubscription iSubs = new CompositeSubscription();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iCoreApiController = AsosSvc.PrepareAsosApi();

        //Watch for network connectivity changes

        ReactiveNetwork.observeInternetConnectivity()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Boolean>() {
                    @Override public void call(Boolean isConnectedToInternet) {
                       Toast netStatus = new Toast(getApplicationContext());
                        netStatus.setText("No Network Connectivity");
                        netStatus.setDuration(Toast.LENGTH_LONG);
                        netStatus.show();
                    }
                });


        //Initialise the RxJava/Retrofit API handlers
       // iCoreApiController

        iSubs.add(iCoreApiController.GetCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<Category>>() {
                    @Override
                    public void onCompleted() {
                        Log.d("AsosSubs", "Finished fetching data...");
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onNext(List<Category> categories) {
                        Log.d("AsosSubs", "Got categories: " + categories.size() + " Also : " +Observable.from(categories).count());
                        Log.d("AsosSubs", categories.toString());

                        ;
                    }
                }));

    }
}


