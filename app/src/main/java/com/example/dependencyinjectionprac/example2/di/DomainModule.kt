package com.example.dependencyinjectionprac.example2.di

import com.example.dependencyinjectionprac.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionprac.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}