package uz.turgunboyevjurabek.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.textView.text=mvvm.getData().toString()
        binding.textView2.text=mvvm.getData2().toString()
        binding.textView.setOnClickListener {
            mvvm.addClick()
            binding.textView.text=mvvm.getData().toString()
        }

        binding.textView2.setOnClickListener {
            mvvm.addClick2()
            binding.textView2.text=mvvm.getData2().toString()
        }

    }
}