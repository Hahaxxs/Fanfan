package com.example.mylibrary.annotations

annotation class Subscribe(
    val onThread: OnThread = OnThread.MAIN_THREAD,
    val filter:Array<String> = []

)
enum class OnThread{
    MAIN_THREAD,
    IO_THREAD
}
