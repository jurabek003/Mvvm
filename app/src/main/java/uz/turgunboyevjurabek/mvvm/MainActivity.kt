package uz.turgunboyevjurabek.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import uz.turgunboyevjurabek.mvvm.ViewModel.Mvvm
import uz.turgunboyevjurabek.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mvvm: Mvvm
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        mvvm=ViewModelProvider(this).get(Mvvm::class.java)

        binding.layner1.setOnClickListener {
            mvvm.addClick()
        }

        binding.layner2.setOnClickListener {
            mvvm.addClick2()
        }
        mvvm.getData().observe(this, Observer {
            binding.textView.text=it.toString()
        })

        mvvm.liveData2.observe(this, Observer {
            binding.textView2.text=it.toString()
        })


    }
}