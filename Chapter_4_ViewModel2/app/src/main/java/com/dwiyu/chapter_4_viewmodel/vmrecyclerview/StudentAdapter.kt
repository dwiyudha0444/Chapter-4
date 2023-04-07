package com.dwiyu.chapter_4_viewmodel.vmrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dwiyu.chapter_4_viewmodel.R

class StudentAdapter (var listStudent : ArrayList<DataStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.studentName)
        var nim = itemView.findViewById<TextView>(R.id.studentNim)
        var img = itemView.findViewById<ImageView>(R.id.studentImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        var data = listStudent[position]
        holder.name.text = data.name
        holder.nim.text = data.nim
        holder.img.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    fun setStudentData(listStudent: java.util.ArrayList<DataStudent>)
    {
        this.listStudent=listStudent
//        notifyDataSetChanged()
    }
}