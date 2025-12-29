package com.giriraj;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * Invoke getAvailableZones() method and for each zone display currentDateTime
		 */
		getAvailableZones().stream().sorted().forEach(zone -> {
			ZonedDateTime currentZonedDateTime = ZonedDateTime.now(ZoneId.of(zone));
			System.out.println("Current ZonedDateTime: " + currentZonedDateTime);
		});
	}

	public static Set<String> getAvailableZones() {
		/*
		 * Fetch all availableZoneIds and display the count
		 * Return zones
		 */
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println("There are " + zones.size() + " zones");
		return zones;
	}
		
	}
	

