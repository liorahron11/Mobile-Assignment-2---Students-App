package com.example.studentslist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.studentslist.models.Student

object StudentsRepository {
    private val _students = MutableLiveData<MutableList<Student>>(mutableListOf())
    val students: LiveData<MutableList<Student>> get() = _students

    fun getAllStudents() = _students.value

    fun getStudent(index: Int): Student {
        return this.getAllStudents()!![index];
    }

    fun addStudent(student: Student) {
        val currentList = _students.value ?: mutableListOf()
        currentList.add(student)
        _students.value = currentList
    }

    fun updateStudent(index: Int, updatedStudent: Student) {
        val currentList = _students.value ?: mutableListOf()
        currentList[index] = updatedStudent
        _students.value = currentList
    }

    fun deleteStudent(index: Int) {
        val currentList = _students.value ?: mutableListOf()
        currentList.removeAt(index)
        _students.value = currentList
    }

}
