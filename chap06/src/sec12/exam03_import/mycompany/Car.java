package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;
//import sec12.exam03_import.kumho.BigWidthTire;


public class Car {
//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}
