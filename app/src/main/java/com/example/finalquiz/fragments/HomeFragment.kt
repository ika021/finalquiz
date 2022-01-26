package com.example.finalquiz.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalquiz.DifAdapter
import com.example.finalquiz.Difficulty
import com.example.finalquiz.R


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Difficulty>

    lateinit var id : Array<Int>
    lateinit var imageUrl : Array<String>
    lateinit var name : Array<String>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        id = arrayOf(
            1,
            2,
            3

        )
        imageUrl = arrayOf(
            "https://d31xsmoz1lk3y3.cloudfront.net/games/images/ec64d682c220f1de707ba6fa7d69d2c7.jpg",//easy
            "https://media.istockphoto.com/photos/presentation-of-the-car-covered-with-a-black-cloth-3d-rendering-picture-id1124272253?k=20&m=1124272253&s=612x612&w=0&h=y--uW_wwA3T4HxdLqMvXeIrnRMPnmz88kr0lFXWfsVY=",
            "https://i.pinimg.com/originals/45/4a/ce/454acecc5c8cbe0bc970eae6d1cd21f4.jpg"



            )
        name = arrayOf(
            "Easy",//easy
            "Medium",
            "Hard"

        )



        newRecyclerView = view.findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(activity)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Difficulty>()
        getUserdata()


    }

    private fun getUserdata() {

        for(i in id.indices){
            val mcars = Difficulty(id[i],imageUrl[i],name[i])
            newArrayList.add(mcars)

        }

        newRecyclerView.adapter = DifAdapter(newArrayList)

    }
}