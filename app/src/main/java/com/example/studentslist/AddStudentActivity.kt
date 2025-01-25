package com.example.studentslist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.studentslist.models.Student

class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            val name = findViewById<EditText>(R.id.nameInput).text.toString()
            val id = findViewById<EditText>(R.id.idInput).text.toString()
            val phone = findViewById<EditText>(R.id.phoneInput).text.toString()
            val address = findViewById<EditText>(R.id.addressInput).text.toString()
            StudentsRepository.addStudent(Student(id, name, phone, address))
            finish()
        }
    }
}
