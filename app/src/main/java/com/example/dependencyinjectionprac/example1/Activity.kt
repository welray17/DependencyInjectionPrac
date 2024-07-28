package com.example.dependencyinjectionprac.example1

import javax.inject.Inject

class Activity {

//    val component = DaggerNewComponent.create()
//    val keyboard = component.getKeyboard()
//    val mouse = component.getMouse()
//    val monitor = component.getMonitor()


    @Inject
    lateinit var computer: Computer
    init {
        DaggerNewComponent.create().inject(this)
    }


}