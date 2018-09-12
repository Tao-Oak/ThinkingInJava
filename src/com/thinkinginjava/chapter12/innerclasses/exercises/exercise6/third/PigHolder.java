//
//Created by CaoTao, 2018/09/09
//
package com.thinkinginjava.chapter12.innerclasses.exercises.exercise6.third;

import com.thinkinginjava.chapter12.innerclasses.exercises.exercise6.classes.AnimalHolder;
import com.thinkinginjava.chapter12.innerclasses.exercises.exercise6.interfaces.Animal;

public class PigHolder extends AnimalHolder {
	Animal getPig() {
		return new Pig();
	}
}
