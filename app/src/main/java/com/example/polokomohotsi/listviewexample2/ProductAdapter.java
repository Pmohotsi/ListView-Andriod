package com.example.polokomohotsi.listviewexample2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product>
{
    private final Context context;
    private final ArrayList<Product> values;


    public ProductAdapter(Context context, ArrayList<Product> list)
    {
        super(context, R.layout.product_rowlayout,list);
        this.context = context;
        this.values = list;
    }

    @NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.product_rowlayout,parent,false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvPrice = rowView.findViewById(R.id.tvPrice);
        TextView tvDescription = rowView.findViewById(R.id.tvDescription);
        ImageView ivType = rowView.findViewById(R.id.ivType);
        ImageView ivSale = rowView.findViewById(R.id.ivSale);

        tvTitle.setText(values.get(position).getTitle());
        tvPrice.setText("R" + values.get(position).getPrice());
        tvDescription.setText( values.get(position).getDescription());

        if(values.get(position).getSale())
        {
            ivSale.setImageResource(R.mipmap.ic_launcher);//on_sale_big
        }else
        {
            ivSale.setImageResource(R.mipmap.contact);//best_price
        }
        if(values.get(position).getType().equals("Laptop"))
        {
            ivType.setImageResource(R.mipmap.contact);//
        }
        else if(values.get(position).getType().equals("Memory"))
        {
            ivType.setImageResource(R.mipmap.contact);
        }
        else
        {
            ivType.setImageResource(R.mipmap.contact);//hdd
        }



    return rowView;
}

}
