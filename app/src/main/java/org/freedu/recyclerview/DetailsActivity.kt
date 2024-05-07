package org.freedu.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.freedu.recyclerview.databinding.ActivityDetails2Binding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetails2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetails2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var details = intent.getStringExtra("details")
        var image = intent.getIntExtra("image", R.drawable.lionel_messi)

        binding.playerName.text = name.toString()
        binding.profileDetails.text = details.toString()
        binding.profileImage.setImageResource(image)

    }
}