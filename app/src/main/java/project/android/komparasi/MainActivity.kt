package project.android.komparasi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import project.android.komparasi.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //var nim: String = ""
    //var nama: String = ""

    var mahasiswa: Mahasiswa = Mahasiswa()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSimpan.setOnClickListener {
            mahasiswa.nim = binding.edtNim.text.toString()
            mahasiswa.nama = binding.edtNama.text.toString()

            binding.mahasiswa = mahasiswa

            //binding.txtNim.text = "NIM : " + nim
            //binding.txtNama.text = "Nama : " + nama
            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
        }

        //setContentView(R.layout.activity_main)

    }
}

// Senin 13 Mei 2025

/*
NIM   : 10122231
NAMA  : Zaidan Febriandi
Kelas : PA3
*/