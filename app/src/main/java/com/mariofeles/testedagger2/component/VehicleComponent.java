package com.mariofeles.testedagger2.component;

import com.mariofeles.testedagger2.model.Vehicle;
import com.mariofeles.testedagger2.module.VehicleModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by mario on 23/09/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}
