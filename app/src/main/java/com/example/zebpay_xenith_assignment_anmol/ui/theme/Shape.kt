package com.example.zebpay_xenith_assignment_anmol.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(28.dp)
)
val Shapes.default: RoundedCornerShape
    get() = RoundedCornerShape(0.dp)

//val androidx.compose.material.Shapes.extraSmall: RoundedCornerShape
//    get() = RoundedCornerShape(2.dp)