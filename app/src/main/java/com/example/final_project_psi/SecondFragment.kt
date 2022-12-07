package com.example.final_project_psi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    lateinit var rvListReview: RecyclerView
    val list = ArrayList<Review>()
    val adapter = ListReviewAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val review1 = Review("Nusantara","Cumi Cabai Hijau","Devina Hermawan","Sangat nikmat, jadi rindu desa",4)
        list.add(review1)
        list.add(review1)
        list.add(review1)
        list.add(review1)
        list.add(review1)
        rvListReview = view.findViewById<RecyclerView>(R.id.rvReview)
        rvListReview.adapter = adapter
        rvListReview.layoutManager = LinearLayoutManager(context)
    }
}