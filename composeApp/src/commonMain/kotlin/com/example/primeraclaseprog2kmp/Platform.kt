package com.example.primeraclaseprog2kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform