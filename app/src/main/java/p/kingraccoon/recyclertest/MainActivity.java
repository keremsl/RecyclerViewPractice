package p.kingraccoon.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private List<Car> car_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


)
        recycler_view = (RecyclerView) findViewById(R.id.myRecycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(layoutManager);

        car_list = new ArrayList<Car>();

        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));
        car_list.add(new Car(1996,"ferrari","http://www.sanalsayfalar.com/wp-content/uploads/2017/04/araba.jpg"));

        CarAdapter adapter = new CarAdapter(car_list);

        recycler_view.setAdapter(adapter);

        recycler_view.setItemAnimator(new DefaultItemAnimator());

    }

}