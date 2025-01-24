package com.example.studentslist
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        findViewById<Button>(R.id.addStudentButton).setOnClickListener {
            startActivity(Intent(this, AddStudentActivity::class.java))
        }
    }
}
