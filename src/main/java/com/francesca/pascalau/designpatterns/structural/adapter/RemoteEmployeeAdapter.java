package com.francesca.pascalau.designpatterns.structural.adapter;

public class RemoteEmployeeAdapter implements Employee {

    public RemoteEmployee remoteEmployee;

    public RemoteEmployeeAdapter(RemoteEmployee remoteEmployee) {
        this.remoteEmployee = remoteEmployee;
    }

    @Override
    public String getName() {
        return remoteEmployee.getId();
    }

    //No additional implementation, otherwise Adapter converts into Decorator
}
