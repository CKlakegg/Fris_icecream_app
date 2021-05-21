package com.example.fris_icecream_app.ui.main.pay

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fris_icecream_app.ui.main.database.TypeObject
import com.example.fris_icecream_app.ui.main.view.OrderCard


class CheckOutAdapter : RecyclerView.Adapter<CheckOutAdapter.CheckOutViewHolder>() {

    private var dataSet: List<TypeObject> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckOutViewHolder {
        val view = OrderCard(parent.context, null)

        view.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT

        )
        return CheckOutViewHolder(view)
    }



    override fun onBindViewHolder(holder: CheckOutViewHolder, position: Int) {
        val typeObject = dataSet[position]

        holder.OrderView.setTitle(typeObject.activity)
        holder.OrderView.setPrice(typeObject.price)
        holder.OrderView.setType(typeObject.type)
        holder.OrderView.setAmount(typeObject.amount)
    }

    override fun getItemCount(): Int {
      return dataSet.size
    }

    fun updateData(list: List<TypeObject>){
        dataSet = list
        notifyDataSetChanged()

    }

    inner class CheckOutViewHolder(val OrderView: OrderCard):
        RecyclerView.ViewHolder(OrderView)


}

