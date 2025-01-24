package com.example.studentslist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_details)

        val index = intent.getIntExtra("index", -1)
        val student = StudentsRepository.getStudent(index)

        findViewById<TextView>(R.id.nameView).text = student.name
        findViewById<TextView>(R.id.idView).text = student.id
        findViewById<TextView>(R.id.phoneView).text = student.phone
        findViewById<TextView>(R.id.addressView).text = student.address

        findViewById<Button>(R.id.editButton).setOnClickListener {
            val intent = Intent(this, EditStudentActivity::class.java)
            intent.putExtra("index", index)
            startActivity(intent)
            finish()
        }
    }
}
