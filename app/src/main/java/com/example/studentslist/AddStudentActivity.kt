package com.example.studentslist

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            finish()
        }
    }
}
