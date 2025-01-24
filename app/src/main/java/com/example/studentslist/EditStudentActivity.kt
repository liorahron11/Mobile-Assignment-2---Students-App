package com.example.studentslist

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_student)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val idInput = findViewById<EditText>(R.id.idInput)
        val phoneInput = findViewById<EditText>(R.id.phoneInput)
        val addressInput = findViewById<EditText>(R.id.addressInput)

        nameInput.setText("name")
        idInput.setText("id")
        phoneInput.setText("phone")
        addressInput.setText("address")

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.deleteButton).setOnClickListener {
            finish()
        }
    }
}
