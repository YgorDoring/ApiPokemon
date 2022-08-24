package dev.ygordoring.apipkmn.model
import android.content.Context
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonApiResult(

    @SerializedName("name")
     val name: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("types")
    val types: List<PokemonTypes>




): Parcelable {


    fun getnameImg():String{
        return "p"+id
    }

    fun getThumbnail(context: Context): Int {
        return context.resources
                .getIdentifier(getnameImg(),"drawable",context.packageName)
    }
        fun setSolot(tipo :List<PokemonTypes>, int: Int): Boolean{

            return tipo.size < int
        }
}
