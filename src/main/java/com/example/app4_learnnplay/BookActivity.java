package com.example.app4_learnnplay;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

        ListView lv;
        ArrayList<String> alBooks;
        ArrayAdapter<String> aa;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_book);

            lv = (ListView) this.findViewById(R.id.lvBooks);

            alBooks = new ArrayList<String>();
            alBooks.add("Counting fruits");
            alBooks.add("Happy Birthday!");

            aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alBooks);

            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent i = new Intent(BookActivity.this, ReadBookActivity.class);

                    String a = lv.getItemAtPosition(position).toString();

                    i.putExtra("selectedBook", a);

                    startActivity(i);

                }

            });
    }
}