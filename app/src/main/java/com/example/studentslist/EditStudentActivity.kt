package com.example.studentslist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_student)

        val index = intent.getIntExtra("index", -1)
        val student = StudentsRepository.getStudent(index)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val idInput = findViewById<EditText>(R.id.idInput)
        val phoneInput = findViewById<EditText>(R.id.phoneInput)
        val addressInput = findViewById<EditText>(R.id.addressInput)

        nameInput.setText(student.name)
        idInput.setText(student.id)
        phoneInput.setText(student.phone)
        addressInput.setText(student.address)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            student.name = nameInput.text.toString()
            student.id = idInput.text.toString()
            student.phone = phoneInput.text.toString()
            student.address = addressInput.text.toString()
            StudentsRepository.updateStudent(index, student)
            finish()
        }

        findViewById<Button>(R.id.deleteButton).setOnClickListener {
            StudentsRepository.deleteStudent(index)
            finish()
        }
    }
}
