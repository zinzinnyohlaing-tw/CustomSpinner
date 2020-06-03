package ttes.first.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class customAdapter extends BaseAdapter {
    Context context;
    int[] flages;
    String[] socialmedia;
    LayoutInflater inflater;
    public customAdapter(Context application,int[] flages,String[]socialmedia)
    {
        this.context=application;
        this.flages=flages;
        this.socialmedia=socialmedia;
        inflater=(LayoutInflater.from(application));

    }
    @Override
    public int getCount()
    {
        return flages.length;
    }
    @Override
    public Object getItem(int i)
    {
        return null;
    }
    @Override
    public long getItemId(int i)
    {
        return 0;
    }
    public View getView(int i, View view ,ViewGroup viewGroup)
    {
        view=inflater.inflate(R.layout.activity_custom_list_view,null);
        ImageView icon=(ImageView)view.findViewById(R.id.simage);
        TextView names=(TextView)view.findViewById(R.id.snames);
        names.setText(socialmedia[i]);
        icon.setImageResource(flages[i]);
        return view;


    }
}
