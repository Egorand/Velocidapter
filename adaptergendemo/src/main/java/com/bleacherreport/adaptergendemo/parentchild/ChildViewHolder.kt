package com.bleacherreport.adaptergendemo.parentchild

import android.annotation.SuppressLint
import android.view.View
import com.bleacherreport.adaptergenanotations.Bind
import com.bleacherreport.adaptergenanotations.ViewHolder
import com.bleacherreport.adaptergendemo.MainActivity
import com.bleacherreport.adaptergendemo.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_string.*

@ViewHolder(adapters = [MainActivity.PARENT_AND_CHILD_VIEW_HOLDER_TYPE_ADAPTER], layoutResId = R.layout.item_string)
class ChildViewHolder(override val containerView: View) : ParentViewHolder(containerView), LayoutContainer {

    @SuppressLint("SetTextI18n")
    @Bind
    fun bindModel(model: ChildPoko, position: Int) {
        textView.text = "ChildPoko ${model.string}"
    }
}

class ChildPoko(string: String) : ParentPoko(string)