package navigationcomponentturtorialcom.example.reyclerviewscrollview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val mListCategory: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.imgCategory?.setImageResource(mListCategory[position].resourceId)
        holder.tvTitle?.text = mListCategory[position].title
    }

    override fun getItemCount(): Int {
        return mListCategory.size
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgCategory: ImageView? = null
        var tvTitle: TextView? = null

        init {
            // Define click listener for the ViewHolder's View
            imgCategory = itemView.findViewById(R.id.img_category)
            tvTitle = itemView.findViewById(R.id.tv_title)
        }
    }
}