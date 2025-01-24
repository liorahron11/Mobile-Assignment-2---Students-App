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

        findViewById<TextView>(R.id.nameView).text = "name"
        findViewById<TextView>(R.id.idView).text = "id"
        findViewById<TextView>(R.id.phoneView).text = "phone"
        findViewById<TextView>(R.id.addressView).text = "address"

        findViewById<Button>(R.id.editButton).setOnClickListener {
            val intent = Intent(this, EditStudentActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
