package navigationcomponentturtorialcom.example.reyclerviewscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rcvCategory: RecyclerView
    private lateinit var rcvUser: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcvCategory = findViewById(R.id.rcv_category)
        rcvUser = findViewById(R.id.rcv_user)

        val mListCategory = mutableListOf<Category>()
        val mListUser = mutableListOf<User>()
        mListCategory.add(Category(R.drawable.img_1,"Category 1"))
        mListCategory.add(Category(R.drawable.img_2,"Category 2"))
        mListCategory.add(Category(R.drawable.img_3,"Category 3"))

        mListUser.add(User(R.drawable.img_1,"User 1"))
        mListUser.add(User(R.drawable.img_2,"User 2"))
        mListUser.add(User(R.drawable.img_3,"User 3"))

        val categoryAdapter = CategoryAdapter(mListCategory)
        val userAdapter = UserAdapter(mListUser)

        rcvCategory.adapter = categoryAdapter
        rcvCategory.layoutManager = GridLayoutManager(this,2)

        rcvUser.adapter = userAdapter
        rcvUser.layoutManager = LinearLayoutManager(this)
    }
}