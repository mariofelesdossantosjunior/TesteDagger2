package com.mariofeles.testedagger2.module;




import com.mariofeles.testedagger2.model.Motor;
import com.mariofeles.testedagger2.model.Vehicle;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mario on 23/09/15.
 */

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}