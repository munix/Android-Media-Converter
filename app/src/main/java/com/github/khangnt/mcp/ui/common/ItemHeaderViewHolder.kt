package com.github.khangnt.mcp.ui.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.khangnt.mcp.R
import kotlinx.android.synthetic.main.item_header.view.*

/**
 * Created by Khang NT on 1/5/18.
 * Email: khang.neon.1997@gmail.com
 */


open class HeaderModel(val header: String) : AdapterModel, HasIdString {
    override val idString: String = header
}

open class ItemHeaderViewHolder<in T : HeaderModel>(itemView: View) : CustomViewHolder<T>(itemView) {
    val tvHeader: TextView = itemView.tvHeader

    override fun bind(model: T, pos: Int) {
        tvHeader.text = model.header
    }

    object Factory : ViewHolderFactory {
        override fun invoke(inflater: LayoutInflater, parent: ViewGroup): CustomViewHolder<*> =
                ItemHeaderViewHolder<HeaderModel>(inflater.inflate(R.layout.item_header, parent, false))
    }
}