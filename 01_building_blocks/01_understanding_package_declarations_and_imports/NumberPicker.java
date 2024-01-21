import java.lang.System; // java.lang is an special package that it is automatically imported
import java.lang.*; // it is redudant as the first for the same reason and because is already imported in System
import java.util.Random; 
import java.util.*; // it is redundant because is already imported Rnadom
public class NumberPicker {
	public static void main(String[] args){
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}