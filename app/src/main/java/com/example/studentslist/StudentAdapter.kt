package com.example.studentslist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.studentslist.models.Student

class StudentAdapter(private val students: MutableList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.studentName)
        val id: TextView = view.findViewById(R.id.studentId)
        val checkbox: CheckBox = view.findViewById(R.id.checkbox)

        init {
            view.setOnClickListener {
                val position = adapterPosition
                val intent = Intent(view.context, StudentDetailsActivity::class.java)
                intent.putExtra("index", position)
                view.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = students[position]
        holder.name.text = student.name
        holder.id.text = student.id
        holder.checkbox.isChecked = student.checked
        holder.checkbox.setOnCheckedChangeListener { _, isChecked ->
            student.checked = isChecked
        }
    }

    fun updateStudents(newStudents: List<Student>) {
        students.clear()
        students.addAll(newStudents)
        notifyDataSetChanged()
    }

    override fun getItemCount() = students.size
}
