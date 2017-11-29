package p.kingraccoon.recyclertest;


import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Kerem on 26.11.2017.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

  private final int NUMBER_OF_ITEMS = 10;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView car_name;
        public TextView car_model_year;
        public ImageView car_img;



        public ViewHolder(View view) {
            super(view);


            car_name = (TextView)view.findViewById(R.id.carName);
            car_model_year = (TextView)view.findViewById(R.id.carModelYear);
            car_img = (ImageView)view.findViewById(R.id.carImage);

        }
    }

    List<Car> carList;
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.simplecarcontainer, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }

    public CarAdapter(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void onBindViewHolder(CarAdapter.ViewHolder holder, int position) {
        holder.car_name.setText(carList.get(position).getCarName());
        holder.car_model_year.setText(String.valueOf(carList.get(position).getModelYear()));

        Context context = holder.car_img.getContext();
        Picasso
                .with(context)
                .load(Uri.parse(carList.get(position).getCarImageURL()))
                .into(holder.car_img);
    }

    @Override
    public int getItemCount() {


        return NUMBER_OF_ITEMS;
    }
}
