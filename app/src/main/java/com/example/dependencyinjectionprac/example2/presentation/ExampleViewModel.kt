package com.example.dependencyinjectionprac.example2.presentation

import com.example.dependencyinjectionprac.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
