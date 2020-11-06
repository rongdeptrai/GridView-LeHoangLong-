package HoangLong.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<LS> lsArrayList;
    GridView gridView;
    final Context context = this;
    CustomAdapter customAdapter;
    List<LS> arrayList= new ArrayList<LS>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsArrayList= new ArrayList<LS>();
        lsArrayList.add(new LS("Le Hoang Long",R.drawable.avata));
        lsArrayList.add(new LS("Justin Bieber",R.drawable.justin));
        lsArrayList.add(new LS("Shaw Mendes",R.drawable.mendens));
        lsArrayList.add(new LS("Trinh Thang Binh",R.drawable.binh));
        lsArrayList.add(new LS("Binz",R.drawable.binz));
        lsArrayList.add(new LS("Charlie Puth",R.drawable.charlie));
        lsArrayList.add(new LS("GDragon",R.drawable.gd));
        lsArrayList.add(new LS("Justa Tee",R.drawable.jaytee));

        customAdapter=new CustomAdapter(this,R.layout.row,lsArrayList);
        gridView=findViewById(R.id.gridview);
        gridView.setAdapter(customAdapter);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

}