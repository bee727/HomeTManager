package com.example.hometmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.hometmanager.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

//    private var mBinding: ActivitySubBinding? = null
//    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.ibToolbar.setOnClickListener{
            setDrawerLayout(binding.drawerLayoutMain, binding.mainNavigationView)
        }
    }

    private fun setDrawerLayout(drawerLayout: DrawerLayout, navigationView: NavigationView){
        drawerLayout.openDrawer(Gravity.LEFT)
        drawerLayout.let {
            //왼쪽
            if(it.isDrawerOpen(GravityCompat.START)){
                it.closeDrawer(GravityCompat.START)
            }
        }
    }



}