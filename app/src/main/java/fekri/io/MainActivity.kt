package fekri.io

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import fekri.io.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMessage.setOnClickListener {
            Toast.makeText(this, "Hooray!", Toast.LENGTH_SHORT).show() // output --> Show 'Hooray!'
        }

    }
}