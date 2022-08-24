package dev.ygordoring.apipkmn.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isGone
import androidx.recyclerview.widget.RecyclerView
import dev.ygordoring.apipkmn.R
import dev.ygordoring.apipkmn.model.PokemonApiResult


class AdapterPokemon(private val pokemons: List<PokemonApiResult>):RecyclerView.Adapter<AdapterPokemon.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokomons_recicler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(pokemons[position])
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    inner class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

        private val nomePokemon: TextView =itemView.findViewById(R.id.nomePokemon)
        private val imagemPokemon: ImageView =itemView.findViewById(R.id.imageViewPokemon)
        private val frameTipo1: FrameLayout = itemView.findViewById(R.id.frameTipo1)
        private val frameTipo2: FrameLayout = itemView.findViewById(R.id.frameTipo2)
        private val frameTipo3: FrameLayout = itemView.findViewById(R.id.frameTipo3)
        private val imageTipo01: ImageView =itemView.findViewById(R.id.imageTipo01)
        private val imageTipo02: ImageView =itemView.findViewById(R.id.imageTipo02)
        private val imageTipo03: ImageView =itemView.findViewById(R.id.imageTipo03)


        fun bind(entPokemon:PokemonApiResult){

            imageTipo01.setImageResource(entPokemon.types[0].type.
            getThumbnail(itemView.context,frameTipo1))
            frameTipo2.isGone = entPokemon.setSolot(entPokemon.types,2)
            if (frameTipo2.isGone == false) {
                imageTipo02.setImageResource(entPokemon.types[1].
                type.getThumbnail(itemView.context,frameTipo2))
            }
            frameTipo3.isGone = entPokemon.setSolot(entPokemon.types,3)
            if (frameTipo3.isGone == false) {
                imageTipo03.setImageResource(entPokemon.types[2].
                type.getThumbnail(itemView.context,frameTipo3))
            }

            nomePokemon.text = entPokemon.name.substring(0,1).toUpperCase() + entPokemon.name.substring(1)

            imagemPokemon.setImageResource(entPokemon.getThumbnail(itemView.context))
            


        }

    }
}