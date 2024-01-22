package navigationcomponentturtorialcom.example.reyclerviewscrollview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val mListUser: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.imgUser?.setImageResource(mListUser[position].resourceId)
        holder.tvName?.text = mListUser[position].name
    }

    override fun getItemCount(): Int {
        return mListUser.size
    }

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUser: ImageView? = null
        var tvName: TextView? = null

        init {
            imgUser = itemView.findViewById(R.id.img_user)
            tvName = itemView.findViewById(R.id.tv_name)
        }
    }
}