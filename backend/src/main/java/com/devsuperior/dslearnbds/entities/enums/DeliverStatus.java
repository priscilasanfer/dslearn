package com.devsuperior.dslearnbds.entities.enums;

public enum DeliverStatus {
    PENDIND(0),
    ACCEPTED(1),
    REJECTED(2);

    public final Integer number;

    DeliverStatus(Integer number) {
        this.number = number;
    }
}
