package com.example.slimeapp.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.slimeapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.game_row.view.*


class GamesAdapter(val games: List<Game>, var clickListener: OnGameItemClickListener) :
    RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.game_row, parent, false)

        return ViewHolder(
            view
        )
    }

    override fun getItemCount() = games.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initialize(games.get(position),clickListener)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.name
        val image: ImageView = itemView.image

        fun initialize(game: Game, action: OnGameItemClickListener) {
            name.text = game.name
            Picasso.get().load(game.image).into(image)


            itemView.setOnClickListener{
                action.onItemClic(game, adapterPosition)
            }
        }
    }

    interface OnGameItemClickListener{
        fun onItemClic(game : Game, position: Int)
    }

}

