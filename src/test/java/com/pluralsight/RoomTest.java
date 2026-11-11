package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    // MethodName_StateUnderTest_ExpectedBehavior
    public void checkIn_AvailableRoom_RoomBecomesOccupiedAndDirty() {
        // Arrange
        Room kingRoom = new Room(1, 150.00);

        // Act
        kingRoom.checkIn();

        // Assert
        assertTrue(kingRoom.isOccupied());
        assertTrue(kingRoom.isDirty());
    }

    @Test
    public void checkOut_OccupiedRoom_RoomBecomesUnoccupied(){
        // Arrange
        Room doubleBed = new Room(2,75.00);
        doubleBed.checkIn();
        // Act
        doubleBed.checkOut();
        // Assert
        assertFalse(doubleBed.isOccupied());
    }

    @Test
    public void cleanRoom_UnoccupiedRoom_RoomBecomesClean(){
        // Arrange
        Room messBed = new Room(2,125.00);
        messBed.checkIn();
        messBed.checkOut();
        // Act
        messBed.cleanRoom();
        // Assert
        assertFalse(messBed.isDirty());
    }

}