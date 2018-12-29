package com.cc.my_pt_manager.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cc.my_pt_manager.R
import kotlinx.android.synthetic.main.fragment_card_news.view.*

/**
 * Created by wee on 2018. 5. 17..
 */
class CardNewsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_card_news, container, false)

        view.apply {
            card_news.setBackgroundResource(R.drawable.cardnews)
        }
        return view
    }
}