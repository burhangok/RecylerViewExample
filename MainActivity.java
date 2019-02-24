package ismek.com.attilalhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public RecyclerView poetriesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        PoetryAdapter poetryAdapter = new PoetryAdapter(MainActivity.this,getData());

      LinearLayoutManager layoutManager = new LinearLayoutManager(this);
      layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

      poetriesRV.setLayoutManager(layoutManager);

      poetriesRV.setAdapter(poetryAdapter);




    }

    public void  init () {
        poetriesRV = findViewById(R.id.poetries);
    }

    public List<PoetryItem> getData() {

        List<PoetryItem> poetryItemList = new ArrayList<>();

        poetryItemList.add(new PoetryItem("Ben Sana Mecburum","Ben sana mecburum bilemezsin ",getString(R.string.poetryOne)));

        poetryItemList.add(new PoetryItem("Beni Bir Kere Dövdüler","beni bir kere dövdüler çok gözlüklüydüm",getString(R.string.poetryTwo)));

       return  poetryItemList;
    }
}