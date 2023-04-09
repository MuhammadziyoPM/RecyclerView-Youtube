package muhammadziyoanvarov.travel.instagram.pageone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import muhammadziyoanvarov.travel.instagram.R


class UserAdapter2(var list2: ArrayList<User2>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list2,parent,false)

        return UserViewHolder(view)

    }




    override fun getItemCount(): Int {
        return list2.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user: User2 = list2[position]
        if(holder  is UserViewHolder){
            holder.profile_image_id.setImageResource(user.profile_image)
            holder.profile_name_id.text = user.profile_name
            holder.com1.text = user.com1
            holder.com2.text = user.com2
            holder.com3.text = user.com3
            holder.profile_content.setImageResource(user.profile_content)
            holder.ras1.setImageResource(user.imgCom)
        }
    }
    inner class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var profile_image_id:ShapeableImageView = view.findViewById(R.id.profile_image_id)
        var profile_name_id:TextView = view.findViewById(R.id.profile_name_id)
        val profile_content:ImageView = view.findViewById(R.id.profile_content_id)
        val ras1:ImageView = view.findViewById(R.id.img_id)
        val com1:TextView = view.findViewById(R.id.com1)
        val com2:TextView = view.findViewById(R.id.com2)
        val com3:TextView = view.findViewById(R.id.com3)
    }

}