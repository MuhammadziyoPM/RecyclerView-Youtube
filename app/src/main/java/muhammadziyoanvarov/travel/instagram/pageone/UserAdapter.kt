package muhammadziyoanvarov.travel.instagram.pageone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import muhammadziyoanvarov.travel.instagram.R


class UserAdapter(var list: ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list1,parent,false)

        return UserViewHolder(view)

    }




    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: User = list[position]
        if(holder  is UserViewHolder){
            holder.img.setImageResource(user.image)
            holder.name.text = user.fullname
        }
    }
    inner class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {
        
    var img:ShapeableImageView = view.findViewById(R.id.img_id)
    var name:TextView = view.findViewById(R.id.fullname_id)
    }

}