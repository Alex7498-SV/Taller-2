package com.naldana.ejemplo10

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.naldana.ejemplo10.pojos.Currency
import kotlinx.android.synthetic.main.fragment_currency.view.*

class CurrencyFragment: Fragment() {

    var currency = Currency()

   companion object {
       fun newInstance(currency: Currency): CurrencyFragment{
           val newFragment = CurrencyFragment()
           newFragment.currency = currency
           return newFragment
       }
   }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_currency, container, false)

        bindData(view)

        return view
    }

    fun bindData(view: View){
        view.tv_frag_activity_name.text = currency.name
        view.tv_frag_activity_country.text = currency.country
        Glide.with(view).load(currency.img)
            .placeholder(R.drawable.ic_launcher_background)
            .into(view.iv_currency_frag)
    }

}