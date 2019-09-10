package com.tanks.main;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.AbstractAction;
import com.tanks.display.Display;

public class Main {

	public static void main(String[] args) {
		
		Display.Create(800, 600, "Tanks", 0x00ff00);
		
		Timer t  = new Timer(1000/60, new AbstractAction() {
			
			
			public void actionPerformed(ActionEvent e) {
				Display.clear();
				Display.render();
				Display.swapBuffers();
			}
		});
		
		t.setRepeats(true);
		t.restart();
	}
}
