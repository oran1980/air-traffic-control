package com.airtrafficcontriolapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.airtrafficcontriolapp.domain.aircrafts.AirCraft737;
import com.airtrafficcontriolapp.domain.aircrafts.AirCraftA320;

@RunWith(SpringRunner.class)
public class SpeedOfRollingCalculatorTest {

    @Test
    public void calcSpeedOfRolling_airCraft737_expected10seconds () {
        AirCraft737 airCraft737 = new AirCraft737();
        int speedOfRolling = airCraft737.calcSpeedOfRolling(airCraft737);
        assertThat(speedOfRolling).isEqualTo(10);
    }

    @Test
    public void calcSpeedOfRolling_airCraftA320_expected10seconds () {
        AirCraftA320 airCraftA320 = new AirCraftA320();
        int speedOfRolling = airCraftA320.calcSpeedOfRolling(airCraftA320);
        assertThat(speedOfRolling).isEqualTo(10);
    }
}