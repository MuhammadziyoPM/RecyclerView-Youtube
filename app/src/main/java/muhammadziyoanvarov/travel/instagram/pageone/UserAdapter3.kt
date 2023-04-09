package muhammadziyoanvarov.travel.instagram.pageone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import muhammadziyoanvarov.travel.instagram.R


class UserAdapter3(var list3: ArrayList<User3>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list3,parent,false)

        return UserViewHolder(view)

    }




    override fun getItemCount(): Int {
        return list3.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: User3 = list3[position]
        if(holder  is UserViewHolder){
            holder.home.setImageResource(user.img1)
            holder.search.setImageResource(user.img2)
            holder.save.setImageResource(user.img3)
            holder.reels.setImageResource(user.img4)
            holder.home.setImageResource(user.img5)

        }
    }
    inner class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var home:ImageView = view.findViewById(R.id.home)
        var search:ImageView = view.findViewById(R.id.search)
        var save:ImageView = view.findViewById(R.id.save)
        var reels:ImageView = view.findViewById(R.id.reels)
        var pro:ImageView = view.findViewById(R.id.pro)

    }

}