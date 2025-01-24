package com.example.studentslist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = StudentAdapter(mutableListOf())
        recyclerView.adapter = adapter

        StudentsRepository.students.observe(this) { students ->
            adapter.updateStudents(students)
        }

        findViewById<Button>(R.id.addStudentButton).setOnClickListener {
            startActivity(Intent(this, AddStudentActivity::class.java))
        }
    }
}
