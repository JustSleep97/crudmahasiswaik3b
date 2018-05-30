package atw.example.user.crudmahasiswaik3b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import atw.example.user.crudmahasiswaik3b.Adapter.MahasiswaAdapter;
import atw.example.user.crudmahasiswaik3b.model.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] nama = new String []{"Aditya", "Taufan","Wira", "Tama"};
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Aditya");
        mahasiswa1.setNim("3.34.15.1.01");
        mahasiswa1.setEmail("adit@gmail.com");
        mahasiswa1.setFoto("https://picsum.photos/200/300?image1");

        Mahasiswa mahasiswa2 = new Mahasiswa(
                    "Topan",
                "3.34.15.1.02",
                "turwae@gmail,com",
                "https://picsum.photos/200/300?image2"

        );
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,
                R.layout.item_mahasiswa, mahasiswas);
        ListView lvDaftarNama= (ListView) findViewById(R.id.lv_daftar_nama);
        lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
}
