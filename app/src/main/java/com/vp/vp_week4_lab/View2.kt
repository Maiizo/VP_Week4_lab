package com.vp.vp_week4_lab

import com.vp.vp_week4_lab.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun View2() {
    var selectedTab by remember { mutableStateOf("All") }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFf2f3f7))
            .padding(horizontal = 15.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Good Morning, Jennie!",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "We wish you have a good day",
                fontSize = 15.sp,
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            )

            Spacer(modifier = Modifier.height(25.dp))
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    val text = "All"
                    val isSelected = selectedTab == text
                    Button(
                        onClick = { selectedTab = text },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) Color(0xFF3F414E) else Color.Transparent
                        ),
                        shape = RoundedCornerShape(20.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = text,
                            fontSize = 15.sp,
                            color = if (isSelected) Color.White else Color(0xFFA1A4B2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    val text = "Favorites"
                    val isSelected = selectedTab == text
                    Button(
                        onClick = { selectedTab = text },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) Color(0xFF3F414E) else Color.Transparent
                        ),
                        shape = RoundedCornerShape(20.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = text,
                            fontSize = 15.sp,
                            color = if (isSelected) Color.White else Color(0xFFA1A4B2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    val text = "Anxious"
                    val isSelected = selectedTab == text
                    Button(
                        onClick = { selectedTab = text },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) Color(0xFF3F414E) else Color.Transparent
                        ),
                        shape = RoundedCornerShape(20.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = text,
                            fontSize = 15.sp,
                            color = if (isSelected) Color.White else Color(0xFFA1A4B2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    val text = "Sleep"
                    val isSelected = selectedTab == text
                    Button(
                        onClick = { selectedTab = text },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) Color(0xFF3F414E) else Color.Transparent
                        ),
                        shape = RoundedCornerShape(20.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = text,
                            fontSize = 15.sp,
                            color = if (isSelected) Color.White else Color(0xFFA1A4B2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    val text = "Music"
                    val isSelected = selectedTab == text
                    Button(
                        onClick = { selectedTab = text },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isSelected) Color(0xFF3F414E) else Color.Transparent
                        ),
                        shape = RoundedCornerShape(20.dp),
                        elevation = ButtonDefaults.buttonElevation(0.dp),
                        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
                    ) {
                        Text(
                            text = text,
                            fontSize = 15.sp,
                            color = if (isSelected) Color.White else Color(0xFFA1A4B2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(25.dp))
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(180.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF8E97FD)
                    )
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(15.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.heart_face),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(70.dp)
                                    .align(Alignment.CenterHorizontally)
                            )
                            Column {
                                Text(
                                    text = "Basics",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold))
                                )
                                Text(
                                    text = "COURSE",
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "3-10 MIN",
                                        fontSize = 11.sp,
                                        color = Color.White.copy(alpha = 0.7f),
                                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                                    )
                                    Button(
                                        onClick = { },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.White.copy(alpha = 0.3f)
                                        ),
                                        shape = RoundedCornerShape(20.dp),
                                        contentPadding = PaddingValues(horizontal = 15.dp, vertical = 5.dp),
                                        elevation = ButtonDefaults.buttonElevation(0.dp)
                                    ) {
                                        Text(
                                            text = "START",
                                            fontSize = 11.sp,
                                            color = Color.White,
                                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                        .height(180.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC97E)
                    )
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(15.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.reading_a_book),
                                contentDescription = null,
                                modifier = Modifier
                                        .size(70.dp)
                                    .align(Alignment.CenterHorizontally)
                            )
                            Column {
                                Text(
                                    text = "Relaxation",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold))
                                )
                                Text(
                                    text = "MUSIC",
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.7f),
                                    fontFamily = FontFamily(Font(R.font.poppins_regular))
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "3-10 MIN",
                                        fontSize = 11.sp,
                                        color = Color.White.copy(alpha = 0.7f),
                                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                                    )
                                    Button(
                                        onClick = { },
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.White.copy(alpha = 0.3f)
                                        ),
                                        shape = RoundedCornerShape(20.dp),
                                        contentPadding = PaddingValues(horizontal = 15.dp, vertical = 6.dp),
                                        elevation = ButtonDefaults.buttonElevation(0.dp)
                                    ) {
                                        Text(
                                            text = "START",
                                            fontSize = 11.sp,
                                            color = Color.White,
                                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                                        )
                                    }

                            }}
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(15.dp))
        }

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF414655)
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
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                        Text(
                            text = "MEDITATION • 3-10 MIN",
                            fontSize = 10.sp,
                            color = Color(0xFFE6E7F2),
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }

                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.CenterEnd
                        ) {

                            Icon(
                                imageVector = Icons.Filled.PlayCircle,
                                contentDescription = "microphone",
                                tint = Color.White,
                                modifier = Modifier.size(50.dp)
                            )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }

        item {
            Text(
                text = "Recommended for you",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )

            Spacer(modifier = Modifier.height(15.dp))
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {



                item {
                    Column(modifier = Modifier.width(150.dp)) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFe1e1e6)
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.being_happy_1),
                                    contentDescription = "Focus",
                                    modifier = Modifier.size(100.dp),
                                    contentScale = ContentScale.Fit
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Focus",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                        Text(
                            text = "MEDITATION • 3-10 MIN",
                            fontSize = 10.sp,
                            color = Color.Gray,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    Column(modifier = Modifier.width(150.dp)) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFe1e1e6)
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.meditation_1),
                                    contentDescription = "Meditation",
                                    modifier = Modifier.size(100.dp),
                                    contentScale = ContentScale.Fit
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Happiness",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                        Text(
                            text = "MEDITATION • 3-10 MIN",
                            fontSize = 10.sp,
                            color = Color.Gray,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }
                }
                item {
                    Column(modifier = Modifier.width(150.dp)) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFe1e1e6)
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.being_happy_1),
                                    contentDescription = "Happiness",
                                    modifier = Modifier.size(100.dp),
                                    contentScale = ContentScale.Fit
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Focus",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontFamily = FontFamily(Font(R.font.poppins_bold))
                        )
                        Text(
                            text = "MEDITATION • 3-10 MIN",
                            fontSize = 10.sp,
                            color = Color.Gray,
                            fontFamily = FontFamily(Font(R.font.poppins_regular))
                        )
                    }

                            }}
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(top = 100.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Home",
                        tint = Color.White,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Home",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Medium
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Bedtime,
                        contentDescription = "Sleep",
                        tint = Color.Gray,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sleep",
                        fontSize = 12.sp,
                        color = Color.Gray,
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.SelfImprovement,
                        contentDescription = "Meditate",
                        tint = Color.Gray,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Meditate",
                        fontSize = 12.sp,
                        color = Color.Gray,
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.MusicNote,
                        contentDescription = "Music",
                        tint = Color.Gray,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Music",
                        fontSize = 12.sp,
                        color = Color.Gray,
                    )
                }
        }


    }

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Preview2() {
    View2()
}