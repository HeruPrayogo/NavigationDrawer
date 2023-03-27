package com.example.navigationdrawer




import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.navigation.NavigationView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.navigationdrawer.databinding.ActivityMainBinding




@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val nvView = findViewById<NavigationView>(R.id.nvView)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

         nvView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Home -> supportFragmentManager.beginTransaction()
                    .replace(R.id.flContent, HomePageFragment()).commit()

                R.id.pencarian-> supportFragmentManager.beginTransaction()
                    .replace(R.id.flContent, SearchFragment()).commit()


                R.id.Setting ->supportFragmentManager.beginTransaction()
                    .replace(R.id.flContent, ProfileFragment()).commit()

            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}










