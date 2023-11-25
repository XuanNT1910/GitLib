package com.example.mathlib

import kotlin.math.pow
import kotlin.math.sqrt


data class Point(val x:Double, val y:Double)

fun Point.caculateDistanceto(point: Point):Double{
    return sqrt((x-point.x).pow(2)+(y-point.y).pow(2))
}