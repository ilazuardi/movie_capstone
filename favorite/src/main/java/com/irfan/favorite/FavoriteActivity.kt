package com.irfan.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.irfan.favorite.databinding.ActivityFavoriteBinding
import com.irfan.favorite.di.favoriteModule
import com.irfan.favorite.favorite.FavoriteFragment
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadKoinModules(favoriteModule)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, FavoriteFragment())
                .commit()
            supportActionBar?.title = "Favorite"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}