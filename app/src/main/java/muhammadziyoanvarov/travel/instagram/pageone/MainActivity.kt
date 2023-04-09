package muhammadziyoanvarov.travel.instagram.pageone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import muhammadziyoanvarov.travel.instagram.*

class MainActivity : AppCompatActivity() {
    lateinit var  recyclerView:RecyclerView
    lateinit var  recyclerView2:RecyclerView
    lateinit var  recyclerView3:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

        recyclerView = findViewById(R.id.reyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.reyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(this)

        refreshAdapter(data())


        recyclerView2 = findViewById(R.id.recyclerView_id2)
        recyclerView2.layoutManager = LinearLayoutManager(this)

        refreshAdapter2(data2())

        recyclerView3 = findViewById(R.id.recyclerView_id3)
        recyclerView3.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        refreshAdapter3(data3())
    }



    private fun refreshAdapter(user:ArrayList<User>) {
    val adapter = UserAdapter(user)

        recyclerView.adapter = adapter
    }

    fun data():ArrayList<User>{
        val list = ArrayList<User>()
        list.add(User(R.drawable.profile,"nurafshonpm "))
            list.add(User(R.drawable.alisheraka,"Alisher Daminov "))
        list.add(User(R.drawable.ras1,"Muhammadziyo "))
        list.add(User(R.drawable.ulu,"Ulug'bek"))
        list.add(User(R.drawable.bob,"Bobur "))

        return list


}









    private fun data2(): ArrayList<User2> {
        val list22 = ArrayList<User2>()
        list22.add(
            User2(
                R.drawable.profile,"nurafshonpm ",
                R.drawable.content , "nurafshonpm" , "#Uraaaaa"  , "#BIZNING JAMOA" , R.drawable.profile
            )
        )
        list22.add(
            User2(
                R.drawable.ras1,"Muhammadziyo Anvarov ",
                R.drawable.ras1 , "Guitar" , "PlayGuitar"  , "#Learn it" , R.drawable.ras1
            )
        )
        list22.add(
            User2(
                R.drawable.alisheraka,"Alisher Daminov",
                R.drawable.alisheraka , "Alisher Daminov" , "#App Development"  , "#Developer" , R.drawable.alisheraka
            )
        )


        return list22
    }

    private fun refreshAdapter2(list2: ArrayList<User2>) {
        val adapter2 = UserAdapter2(list2)
        recyclerView2.adapter = adapter2
    }




    private fun data3(): ArrayList<User3> {
        val list4 = ArrayList<User3>()
        list4.add(
            User3(
                R.drawable.home ,
                R.drawable.search ,
                R.drawable.save ,
                R.drawable.reels , R.drawable.alisheraka
            )
        )


        return list4
    }

    private fun refreshAdapter3(list3: ArrayList<User3>) {
        val adapter3 = UserAdapter3(list3)
        recyclerView3.adapter = adapter3
    }




}