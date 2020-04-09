package com.seetaface6.model;

/**
 * @author Kaisir
 */
public   enum SeetaDevice
{
       SEETA_DEVICE_AUTO(0),
       SEETA_DEVICE_CPU(1),
       SEETA_DEVICE_GPU(2);

       private int value;
       private SeetaDevice(int value) {
          this.value = value;
       }

       public int getValue(){
          return value;
       }
}

