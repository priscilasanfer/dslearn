package com.devsuperior.dslearnbds.entities.enums;

public enum ResourceType {
    LESSON_ONLY(0),
    LESSON_TASK(1),
    FORUM(2),
    EXTERNAL_LINK(3);

    public final Integer number;

    ResourceType(Integer number) {
        this.number = number;
    }
}
