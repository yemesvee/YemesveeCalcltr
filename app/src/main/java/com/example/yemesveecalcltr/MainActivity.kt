package com.example.yemesveecalcltr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yemesveecalcltr.ui.theme.YemesveeCalcltrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YemesveeCalcltrTheme {
                val painter= painterResource(id = R.drawable.myimage)
                val description = ""
                val title="Press C for Calculator"
                var imagecard by remember {
                   mutableStateOf(true)
                }

                var total by remember {
                    mutableStateOf(0f)
                }

                var firstValue by remember {
                    mutableStateOf(0)
                }

                var secondValue by remember {
                    mutableStateOf(0f)
                }
                var isFirstValue by remember {
                    mutableStateOf(false)
                }
                var operator by remember {
                    mutableStateOf("")
                }
                var displayCal by remember {
                    mutableStateOf("YEMESVEE's")
                }

                //Total display COLUMN

                Column(
                    // modifier = Modifier
                    // .verticalScroll(state = ScrollState(10))

                ) {
                    //First Half row
                    Row(
                        modifier = Modifier
                            .fillMaxHeight(0.5f)
                            .fillMaxWidth()
                            .background(color = Color(red = 0, green = 0, blue = 255, alpha = 150))
                            //.padding(horizontal = 50.dp, vertical = 100.dp),
                        //  horizontalArrangement = Arrangement.Center,
                        //  verticalAlignment = Alignment.CenterVertically

                    ) {
                        //First Half content

                        if (imagecard) {

                            Imagecard(
                                painter = painter,
                                contentDescription = description, title = title
                            )
                        }

                        Text(
                            modifier = Modifier
                                .fillMaxSize()
                                //.background(color = Color.Red)
                                .padding(horizontal = 5.dp, vertical = 150.dp),
                            textAlign= TextAlign.Center,
                            text = displayCal,
                            fontSize = 50.sp
                        )
                    }

                    //Second Half column

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .background(
                                color = Color(
                                    red = 200,
                                    green = 40,
                                    blue = 120,
                                    alpha = 150
                                )
                            )
                            .padding(horizontal = 0.dp, vertical = 25.dp)

                    ) {

                        //First row of Buttons

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 0.dp, vertical = 20.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly

                        ) {

                            //Button 7
                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 7
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 7
                                    displayCal += "7"
                                }

                            }) {
                                Text(text = "7",fontSize = 24.sp)
                            }

                            //Button 8

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 8
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 8
                                    displayCal += "8"
                                }

                            }) {
                                Text(text = "8",fontSize = 24.sp)
                            }

                            //Button 9

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 9
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 9
                                    displayCal += "9"
                                }

                            }) {
                                Text(text = "9",fontSize = 24.sp)
                            }
                            //Button / Division

                            Button(onClick = {
                                operator = "/"
                                displayCal = (displayCal + "/")
                                isFirstValue = true
                            }) {
                                Text(text = "/",fontSize = 24.sp)

                            }
                        }

                        //Second Row

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 0.dp, vertical = 20.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly

                        ) {


                            //Button 4
                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 4
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 4
                                    displayCal += "4"
                                }


                            }) {
                                Text(text = "4",fontSize = 24.sp)

                            }

                            //Button 5

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 5
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 5
                                    displayCal += "5"
                                }

                            }) {
                                Text(text = "5",fontSize = 24.sp)
                            }

                            //Button 6

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 6
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 6
                                    displayCal += "6"
                                }

                            }) {
                                Text(text = "6",fontSize = 24.sp)
                            }
                            //Button * Multiply

                            Button(onClick = {
                                operator = "*"
                                displayCal = (displayCal + "*")
                                isFirstValue = true
                            }) {
                                Text(text = "*",fontSize = 24.sp)

                            }
                        }

                        // 3rd Row buttons
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 0.dp, vertical = 20.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly


                        ) {


                            //Button 1
                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 1
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 1
                                    displayCal += "1"
                                }


                            }) {
                                Text(text = "1",fontSize = 24.sp)

                            }

                            //Button 2

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 2
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 2
                                    displayCal += "2"
                                }

                            }) {
                                Text(text = "2",fontSize = 24.sp)
                            }

                            //Button 3

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 3
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 3
                                    displayCal += "3"
                                }

                            }) {
                                Text(text = "3",fontSize = 24.sp)
                            }
                            //Button + Plus

                            Button(onClick = {
                                operator = "+"
                                displayCal = (displayCal + "+")
                                isFirstValue = true
                            }) {
                                Text(text = "+",fontSize = 24.sp)

                            }
                        }

                        //4th Row Buttons

                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically,

                            ) {

                            //Button C - All clear

                            Button(onClick = {
                                total = 0F
                                firstValue = 0
                                secondValue = 0f
                                isFirstValue = false
                                displayCal = "${total.toInt()}"
                                imagecard=false
                            }) {
                                Text(
                                    text = "C",
                                    fontSize = 36.sp,
                                    color = Color.White
                                )
                            }

                            //Button 0

                            Button(onClick = {

                                if (!isFirstValue) {
                                    firstValue = firstValue * 10 + 0
                                    displayCal = "$firstValue"
                                } else {
                                    secondValue = secondValue * 10 + 0
                                    displayCal += "0"
                                }

                            }) {
                                Text(text = "0",fontSize = 24.sp)
                            }

                            //Button = Equals to

                            Button(onClick = {
                                if (operator == "+") {
                                    total = (firstValue + secondValue).toFloat()
                                }
                                if (operator == "-") {
                                    total = (firstValue - secondValue).toFloat()
                                }
                                if (operator == "/") {
                                    total = (firstValue / secondValue).toFloat()
                                }
                                if (operator == "*") {
                                    total = (firstValue * secondValue).toFloat()
                                }
                                displayCal = "$total"

                                //Assigning all variable values to initial values

                                isFirstValue = false
                                firstValue = total.toInt()
                                secondValue = 0f
                                operator = ""
                            }) {
                                Text(text = "=",fontSize = 24.sp)
                            }

                            //Button - Minus

                            Button(onClick = {
                                operator = "-"
                                displayCal = (displayCal + "-")
                                isFirstValue = true
                            }) {
                                Text(text = "-",fontSize = 24.sp)

                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Imagecard(
    painter: Painter,
    contentDescription:String,
    title: String,
    modifier: Modifier=Modifier
) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(5.dp),
        //elevation = 5.dp

    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Image(
                modifier=Modifier.fillMaxSize(),
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.FillBounds
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp), contentAlignment = Alignment.BottomStart){
                Text(title, style = TextStyle(color = Color.Black, fontSize = 30.sp))
            }
        }
    }
}