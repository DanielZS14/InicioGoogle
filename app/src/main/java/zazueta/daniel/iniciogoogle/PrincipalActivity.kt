package zazueta.daniel.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import zazueta.daniel.iniciogoogle.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if(bundle != null){
            val nombre  =  bundle.getString("name")
            val email = bundle.getString("email")

            binding.tvNombre.text = nombre
            binding.tvEmail.text = email
        }

        binding.btnCerrar.setOnClickListener{
            finish()
        }
    }
}