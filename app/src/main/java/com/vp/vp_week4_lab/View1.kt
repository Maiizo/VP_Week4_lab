package com.vp.vp_week4_lab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import androidx.compose.foundation.clickable

data class GameModel(
    val name: String,
    val rating: Double,
    val isFree: Boolean,
    val imgName: String
)

@Composable
fun View1() {
    val dataSource = GameDataSource()
    val recommendedGames = dataSource.loadRecommendedGames()
    val newGames = dataSource.loadNewGames()
    val popularGames = dataSource.loadPopularGames()

    val categories = listOf("TOP CHARTS", "ACTION", "PUZZLE")

    val gameSections = listOf(
        "Recommended for You" to recommendedGames,
        "New & Updated Games" to newGames,
        "Popular Games" to popularGames
    )

    var selectedTab by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F0F0))
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0f9b55))
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
                    .background(Color.White, shape = RoundedCornerShape(4.dp))
                    .padding(15.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black,
                        modifier = Modifier.size(25.dp)
                    )

                    Text(
                        text = "Boogle Play",
                        color = Color.Gray,
                        fontSize = 19.sp,
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 10.dp)
                    )

                    Icon(
                        imageVector = Icons.Filled.Mic,
                        contentDescription = "microphone",
                        tint = Color.Black,
                        modifier = Modifier.size(24.dp)
                    )
                }

            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF0f9b55))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable { selectedTab = 0 }
                ) {
                    Text(
                        text = "APPS & GAMES",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                    if (selectedTab == 0) {
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(
                            modifier = Modifier
                                .width(150.dp)
                                .height(3.dp)
                                .background(Color.White)
                        )
                    }
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable { selectedTab = 1 }
                ) {
                    Text(
                        text = "MOVIES, MUSIC, BOOKS",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                    if (selectedTab == 1) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .height(2.dp)
                                .background(Color.White)
                        )
                    }
                    }


            }
        }


        LazyRow(
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 17.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(categories) { category ->
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = Color(0xFF0F9D58),
                    modifier = Modifier.height(40.dp)
                ) {
                    Box(
                        modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = category,
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }

        for (section in gameSections) {
            val sectionTitle = section.first
            val sectionGames = section.second

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 10.dp)
                    .background(Color.White, RoundedCornerShape(10.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = sectionTitle,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF202124)
                    )
                    Text(
                        text = "MORE",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF0F9D58)
                    )
                }

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 13.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(sectionGames) { game ->
                        val imageId = when (game.imgName) {
                            "game_1" -> R.drawable.game_1
                            "game_2" -> R.drawable.game_2
                            "game_3" -> R.drawable.game_3
                            "game_4" -> R.drawable.game_4
                            "game_5" -> R.drawable.game_5
                            "game_6" -> R.drawable.game_6
                            "game_7" -> R.drawable.game_7
                            "game_8" -> R.drawable.game_8
                            "game_9" -> R.drawable.game_9
                            "game_10" -> R.drawable.game_10
                            "game_11" -> R.drawable.game_11
                            "game_12" -> R.drawable.game_12
                            "game_13" -> R.drawable.game_13
                            "game_14" -> R.drawable.game_14
                            "game_15" -> R.drawable.game_15
                            else -> R.drawable.game_1
                        }

                        Column(
                            modifier = Modifier
                                .width(150.dp)
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = imageId),
                                contentDescription = game.name,
                                modifier = Modifier
                                    .height(120.dp)
                                    .fillMaxWidth()
                                    .background(Color(0xFFF5F5F5), RoundedCornerShape(10.dp)),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(2.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = game.name,
                                            fontSize = 15.sp,
                                            color = Color(0xFF202124),
                                            maxLines = 1,
                                        )
                                        Icon(
                                            imageVector = Icons.Filled.MoreVert,
                                            contentDescription = "microphone",
                                            tint = Color.Gray,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {Text(
                                            text = game.rating.toString(),
                                            fontSize = 12.sp,
                                            color = Color(0xFF5F6368)
                                        )
                                        Text(
                                            text = "★",
                                            fontSize = 12.sp,
                                            color = Color(0xFF5F6368)
                                        )
                                    }
                                    Text(
                                        text = if (game.isFree) "FREE" else "PAID",
                                        fontSize = 13.sp,
                                        color = if (game.isFree) Color(0xFF0F9D58) else Color(0xFFEA4335),
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }

                        }
                    }
                }
            }}
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview1() {
    View1()
}