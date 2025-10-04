package com.vp.vp_week4_lab


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
val poppinsFamily = FontFamily(Font(R.font.poppins_regular))

@Composable
fun View2() {
    var selectedTab by remember { mutableIntStateOf(2) }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5F7))
        ) {
            // Header Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F5F7))
                    .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 16.dp)
            ) {
                Text(
                    text = "Good Morning, Jennie!",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color(0xFF2D3142)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "We wish you have a good day",
                    fontFamily = poppinsFamily,
                    fontSize = 14.sp,
                    color = Color(0xFF9E9E9E)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    Button(
                        onClick = { selectedTab = 0 },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == 0) Color(0xFF3D4354) else Color.Transparent,
                            contentColor = if (selectedTab == 0) Color.White else Color(0xFF9E9E9E)
                        ),
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier.height(50.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp)
                    ) {
                        Text(
                            text = "All",
                            fontFamily = poppinsFamily,
                            fontSize = 14.sp
                        )
                    }
                }
                item {
                    Button(
                        onClick = { selectedTab = 1 },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == 1) Color(0xFF3D4354) else Color.Transparent,
                            contentColor = if (selectedTab == 1) Color.White else Color(0xFF9E9E9E)
                        ),
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier.height(50.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp)
                    ) {
                        Text(
                            text = "Favorites",
                            fontFamily = poppinsFamily,
                            fontSize = 14.sp
                        )
                    }
                }
                item {
                    Button(
                        onClick = { selectedTab = 2 },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == 2) Color(0xFF3D4354) else Color.Transparent,
                            contentColor = if (selectedTab == 2) Color.White else Color(0xFF9E9E9E)
                        ),
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier.height(50.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp)
                    ) {
                        Text(
                            text = "Anxious",
                            fontFamily = poppinsFamily,
                            fontSize = 14.sp
                        )
                    }
                }
                item {
                    Button(
                        onClick = { selectedTab = 3 },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == 3) Color(0xFF3D4354) else Color.Transparent,
                            contentColor = if (selectedTab == 3) Color.White else Color(0xFF9E9E9E)
                        ),
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier.height(50.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp)
                    ) {
                        Text(
                            text = "Sleep",
                            fontFamily = poppinsFamily,
                            fontSize = 14.sp
                        )
                    }
                }
                item {
                    Button(
                        onClick = { selectedTab = 4 },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedTab == 4) Color(0xFF3D4354) else Color.Transparent,
                            contentColor = if (selectedTab == 4) Color.White else Color(0xFF9E9E9E)
                        ),
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier.height(50.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp)
                    ) {
                        Text(
                            text = "Music",
                            fontFamily = poppinsFamily,
                            fontSize = 14.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 80.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 0.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .height(180.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF8E97FD)
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(16.dp),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                /*Image(
                                    painter = painterResource(id = R.drawable.being_happy_1),
                                    contentDescription = "Basics",
                                    modifier = Modifier.size(60.dp)
                                )*/
                                Column {
                                    Text(
                                        text = "Basics",
                                        fontFamily = poppinsFamily,
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "COURSE",
                                        fontFamily = poppinsFamily,
                                        fontSize = 10.sp,
                                        color = Color.White.copy(alpha = 0.7f)
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "3-10 MIN",
                                            fontFamily = poppinsFamily,
                                            fontSize = 10.sp,
                                            color = Color.White.copy(alpha = 0.7f)
                                        )
                                        Button(
                                            onClick = {},
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = Color.White.copy(alpha = 0.3f)
                                            ),
                                            shape = RoundedCornerShape(20.dp),
                                            modifier = Modifier.height(32.dp),
                                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                                        ) {
                                            Text(
                                                text = "START",
                                                fontFamily = poppinsFamily,
                                                fontSize = 11.sp,
                                                color = Color.White
                                            )
                                        }
                                    }
                                }
                            }
                        }

                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .height(180.dp),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFFC97E)
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(16.dp),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                /*Image(
                                    painter = painterResource(id = R.drawable.meditation_1),
                                    contentDescription = "Relaxation",
                                    modifier = Modifier.size(60.dp)
                                )*/
                                Column {
                                    Text(
                                        text = "Relaxation",
                                        fontFamily = poppinsFamily,
                                        fontSize = 20.sp,
                                        color = Color.White
                                    )
                                    Text(
                                        text = "MUSIC",
                                        fontFamily = poppinsFamily,
                                        fontSize = 10.sp,
                                        color = Color.White.copy(alpha = 0.7f)
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "3-10 MIN",
                                            fontFamily = poppinsFamily,
                                            fontSize = 10.sp,
                                            color = Color.White.copy(alpha = 0.7f)
                                        )
                                        Button(
                                            onClick = {},
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = Color.White.copy(alpha = 0.3f)
                                            ),
                                            shape = RoundedCornerShape(20.dp),
                                            modifier = Modifier.height(32.dp),
                                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                                        ) {
                                            Text(
                                                text = "START",
                                                fontFamily = poppinsFamily,
                                                fontSize = 11.sp,
                                                color = Color.White
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // Daily Thought card
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF3D4354)
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = "Daily Thought",
                                    fontFamily = poppinsFamily,
                                    fontSize = 18.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "MEDITATION • 3-10 MIN",
                                    fontFamily = poppinsFamily,
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.7f)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape)
                                    .background(Color.White),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = android.R.drawable.ic_media_play),
                                    contentDescription = "Play",
                                    tint = Color(0xFF3D4354),
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                }

                // Recommended for you section
                item {
                    Text(
                        text = "Recommended for you",
                        fontFamily = poppinsFamily,
                        fontSize = 20.sp,
                        color = Color(0xFF2D3142),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                // Horizontal scrollable cards
                item {
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        item {
                            Card(
                                modifier = Modifier
                                    .width(160.dp)
                                    .height(200.dp),
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                ),
                                elevation = CardDefaults.cardElevation(2.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp)
                                ) {
                                    /*Image(
                                        painter = painterResource(id = R.drawable.heart_face),
                                        contentDescription = "Happiness",
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(120.dp)
                                            .clip(RoundedCornerShape(12.dp)),
                                        contentScale = ContentScale.Crop
                                    )*/
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = "Happiness",
                                        fontFamily = poppinsFamily,
                                        fontSize = 16.sp,
                                        color = Color(0xFF2D3142)
                                    )
                                    Text(
                                        text = "MEDITATION • 3-10 MIN",
                                        fontFamily = poppinsFamily,
                                        fontSize = 10.sp,
                                        color = Color(0xFF9E9E9E)
                                    )
                                }
                            }
                        }
                        item {
                            Card(
                                modifier = Modifier
                                    .width(160.dp)
                                    .height(200.dp),
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                ),
                                elevation = CardDefaults.cardElevation(2.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp)
                                ) {
                                    /*Image(
                                        painter = painterResource(id = R.drawable.reading_a_book),
                                        contentDescription = "Focus",
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(120.dp)
                                            .clip(RoundedCornerShape(12.dp)),
                                        contentScale = ContentScale.Crop
                                    )*/
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = "Focus",
                                        fontFamily = poppinsFamily,
                                        fontSize = 16.sp,
                                        color = Color(0xFF2D3142)
                                    )
                                    Text(
                                        text = "MEDITATION • 3-10 MIN",
                                        fontFamily = poppinsFamily,
                                        fontSize = 10.sp,
                                        color = Color(0xFF9E9E9E)
                                    )
                                }
                            }
                        }
                        item {
                            Card(
                                modifier = Modifier
                                    .width(160.dp)
                                    .height(200.dp),
                                shape = RoundedCornerShape(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                ),
                                elevation = CardDefaults.cardElevation(2.dp)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp)
                                ) {
                                    /*Image(
                                        painter = painterResource(id = R.drawable.being_happy_1),
                                        contentDescription = "Peace",
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(120.dp)
                                            .clip(RoundedCornerShape(12.dp)),
                                        contentScale = ContentScale.Crop
                                    )*/
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = "Peace",
                                        fontFamily = poppinsFamily,
                                        fontSize = 16.sp,
                                        color = Color(0xFF2D3142)
                                    )
                                    Text(
                                        text = "MEDITATION • 3-10 MIN",
                                        fontFamily = poppinsFamily,
                                        fontSize = 10.sp,
                                        color = Color(0xFF9E9E9E)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        // Bottom Navigation Bar (Static)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color.White)
                .align(Alignment.BottomCenter)
                .padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_compass),
                    contentDescription = "Home",
                    tint = Color(0xFF8E97FD),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "Home",
                    fontFamily = poppinsFamily,
                    fontSize = 11.sp,
                    color = Color(0xFF8E97FD)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_lock_idle_alarm),
                    contentDescription = "Sleep",
                    tint = Color(0xFF9E9E9E),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "Sleep",
                    fontFamily = poppinsFamily,
                    fontSize = 11.sp,
                    color = Color(0xFF9E9E9E)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_my_calendar),
                    contentDescription = "Meditate",
                    tint = Color(0xFF9E9E9E),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "Meditate",
                    fontFamily = poppinsFamily,
                    fontSize = 11.sp,
                    color = Color(0xFF9E9E9E)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                    contentDescription = "Music",
                    tint = Color(0xFF9E9E9E),
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "Music",
                    fontSize = 11.sp,
                    color = Color(0xFF9E9E9E)
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview2() {
    View2()
}