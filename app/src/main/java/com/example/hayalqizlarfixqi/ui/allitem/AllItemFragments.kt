package com.example.hayalqizlarfixqi.ui.allitem

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.hayalqizlarfixqi.R
import com.example.hayalqizlarfixqi.Settings

class AllItemFragments : Fragment(R.layout.fragment_allitems) {

    private lateinit var presenter : AllItemPresenter
    private lateinit var settings: Settings
    private var textList = mutableListOf<TextView>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}