package vn.com.nghiemduong.paypal.adapter

import android.content.res.ColorStateList.*
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.databinding.ItemRcvActividadBinding
import vn.com.nghiemduong.paypal.model.Actividad

class ActividadAdapter(var mListActividad: MutableList<Actividad>) :
    RecyclerView.Adapter<ActividadAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_rcv_actividad, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mListActividad.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val actividad = mListActividad[position]
        actividad.let {
            holder.binding.actividad = actividad

            if (it.dola > 0) {
                holder.binding.tvDola.setTextColor(valueOf(Color.GREEN))
            }

            if (position == mListActividad.size - 1) {
                holder.binding.tvViewLine.visibility = View.GONE
            }
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemRcvActividadBinding.bind(itemView)
    }
}