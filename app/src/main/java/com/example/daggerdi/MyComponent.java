package com.example.daggerdi;


import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {SharedPrefModule.class}) //component is like my real estate agent who know where is the customer and seller
public interface MyComponent {
    void inject(MainActivity activity);
}