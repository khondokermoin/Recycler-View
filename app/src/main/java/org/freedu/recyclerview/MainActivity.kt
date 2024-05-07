package org.freedu.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import org.freedu.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val player = ArrayList<Player>()

        player.add(Player("Lionel Messi", "Argentine maestro, dribbler, goal-scorer.", "Lionel Messi: Argentine forward known for his exceptional dribbling skills, vision, and goal-scoring ability. Spent most of his career at Barcelona before moving to Paris Saint-Germain.Lionel Messi, born on June 24, 1987, in Rosario, Argentina, is widely regarded as one of the greatest footballers of all time. His remarkable skill, agility, and scoring prowess have earned him numerous accolades and a place in footballing history.Messi began his football journey at a young age, joining the youth ranks of his local club, Newells Old Boys. At just 13 years old, he moved to Spain to join FC Barcelonas famed La Masia youth academy, where his talent quickly became evident.In 2004, Messi made his first-team debut for Barcelona at the age of 17. Since then, he has enoyed unparalleled success with the club, winning numerous domestic and international titles, including multiple UEFA Champions League titles and La Liga championships. Messis style of play is characterized by his dribbling ability, vision, and incredible goal-scoring instincts. He has broken numerous records during his time at Barcelona, including becoming the clubs all-time leading scorer.",R.drawable.lionel_messi ))
        player.add(Player("Cristiano Ronaldo", " Portuguese powerhouse, scorer, athlete.","Cristiano Ronaldo: Portuguese forward renowned for his athleticism, speed, and goal-scoring prowess. Played for top clubs like Manchester United, Real Madrid, Juventus, and currently back at Manchester United.", R.drawable.cristiano_ronaldo))
        player.add(Player("Neymar Jr.", "Brazilian flair, skill, playmaker.","Neymar Jr.: Brazilian forward with exceptional flair, agility, and creativity. Known for his skillful dribbling and ability to change the game. Played for Barcelona before joining Paris Saint-Germain.", R.drawable.neymar_jr))
        player.add(Player("Robert Lewandowski", "Polish striker, prolific, lethal finisher.","Robert Lewandowski: Polish striker known for his clinical finishing and goal-scoring record. Plays for Bayern Munich in the German Bundesliga.", R.drawable.robert_lewandowski))
        player.add(Player("Kevin De Bruyne", "Belgian midfielder, visionary passer.","Kevin De Bruyne: Belgian midfielder known for his vision, passing ability, and versatility. Plays for Manchester City in the English Premier League.", R.drawable.kevin_de_bruyne))
        player.add(Player("Kylian Mbappé", "French speedster, agile dribbler.","Kylian Mbappé: French forward known for his incredible speed, dribbling, and goal-scoring ability. Plays for Paris Saint-Germain and the French national team.", R.drawable.kylian_mbappe))
        player.add(Player("Erling Haaland", "Norwegian striker, strong, clinical finisher.", "Erling Haaland: Norwegian striker known for his strength, speed, and goal-scoring instinct. Plays for Borussia Dortmund in the German Bundesliga.",R.drawable.erling_haaland))
        player.add(Player("Mohamed Salah", "Egyptian winger, speedy, lethal finisher.","Mohamed Salah: Egyptian forward known for his speed, dribbling, and goal-scoring ability. Plays for Liverpool in the English Premier League.", R.drawable.mohamed_salah))
        player.add(Player("Harry Kane", "English striker, precise finisher.","Harry Kane: English striker known for his clinical finishing, vision, and playmaking ability. Plays for Tottenham Hotspur in the English Premier League.", R.drawable.harry_kane))
        player.add(Player("N'Golo Kanté", "French midfielder, tireless ball-winner.","N'Golo Kanté: French midfielder known for his exceptional work rate, interceptions, and ball-winning ability. Plays for Chelsea in the English Premier League and the French national team.", R.drawable.ngolo_kante))


        var playerAdapter = PlayerAdapter(player)
        binding.recyclerView.adapter = playerAdapter

        playerAdapter.onClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("name",it.playerName)
            intent.putExtra("details",it.longDetails)
            intent.putExtra("image",it.playerImage)
            startActivity(intent)
        }



    }
}