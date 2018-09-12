//
//Created by CaoTao, 2018/09/10
//
package com.thinkinginjava.chapter12.innerclasses.examples.controller;

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gControls = new GreenhouseControls();
		gControls.addEvent(gControls.new Bell(900));
		
		Event[] eventList = {
			gControls.new ThermostatNight(0),
			gControls.new LightOn(200),
			gControls.new LightOff(400),
			gControls.new WaterOn(600),
			gControls.new WaterOff(800),
			gControls.new ThermostatDay(1400)
		};
		
		gControls.addEvent(gControls.new Restart(2000, eventList));
		
		if (args.length == 1) {
			gControls.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gControls.run();
	}
}
