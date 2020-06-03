package ttes.first.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    Spinner sitem2;
    String[] name={"Facebook","Instagram","Twitter","LinkedIn","YouTube"};
    int[] sphoto={R.drawable.bagan,R.drawable.mandalay,R.drawable.taungyi,R.drawable.cancer,R.drawable.taungyi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner  sitem2=(Spinner)findViewById(R.id.spinner);
        sitem2.setOnItemSelectedListener(this);
        customAdapter ca=new customAdapter(this,sphoto,name);
        sitem2.setAdapter(ca);

        fillspinner2();
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
    {
        Toast.makeText(getApplicationContext(), sitem2.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {

    }
    public void fillspinner2()
    {
        ArrayList<String> spinnerArray=new ArrayList<>();
        spinnerArray.add("Item1");
        spinnerArray.add("Item2");
        spinnerArray.add("Item3");
        spinnerArray.add("Item4");
        spinnerArray.add("Item5");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,spinnerArray);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sitem2=(Spinner)findViewById(R.id.spinner2);
        sitem2.setAdapter(adapter);
        sitem2.setOnItemSelectedListener(this);
    }
}
