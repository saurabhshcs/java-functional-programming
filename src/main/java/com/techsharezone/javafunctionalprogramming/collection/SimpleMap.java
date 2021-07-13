package com.techsharezone.javafunctionalprogramming.collection;

/*
 * @created 29/03/2021 - 16:54
 * @project java-functional-programming
 * @author saurabhshcs
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

class MileageReading {
    private Long id;

    private Long vehicleId;

    private int mileage;

    private OffsetDateTime recordedOnDate;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public OffsetDateTime getRecordedOnDate() {
        return recordedOnDate;
    }

    public void setRecordedOnDate(OffsetDateTime recordedOnDate) {
        this.recordedOnDate = recordedOnDate;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}

public class SimpleMap {

    public static void main(String[] args) {

        MileageReading mileageReadingOne = new MileageReading();
        mileageReadingOne.setMileage(1200);
        mileageReadingOne.setVehicleId(6131L);

        MileageReading mileageReadingTwo = new MileageReading();
        mileageReadingTwo.setMileage(1300);
        mileageReadingTwo.setVehicleId(131L);

        MileageReading mileageReadingThree = new MileageReading();
        mileageReadingThree.setMileage(1400);
        mileageReadingThree.setVehicleId(1131L);

        MileageReading mileageReadingFour = new MileageReading();
        mileageReadingFour.setMileage(1500);
        mileageReadingFour.setVehicleId(3131L);

        MileageReading mileageReadingFive = new MileageReading();
        mileageReadingFive.setMileage(1580);
        mileageReadingFive.setVehicleId(8131L);

        MileageReading mileageReadingSix = new MileageReading();
        mileageReadingSix.setMileage(1480);
        mileageReadingSix.setVehicleId(331L);

        List<MileageReading> mileageReadings = new ArrayList<>();
        mileageReadings.add(mileageReadingOne);
        mileageReadings.add(mileageReadingTwo);
        mileageReadings.add(mileageReadingThree);
        mileageReadings.add(mileageReadingFour);
        mileageReadings.add(mileageReadingFive);
        mileageReadings.add(mileageReadingSix);

        mileageReadings.forEach(reading -> {
            if (mileageReadings.indexOf(reading) == mileageReadings.size() -1){
                System.out.println(" - - - "+ reading.getVehicleId());
            }
        });
    }
}
