package grupo11;
import robocode.*;

/**
 * @author Oxalde
 *
 */
public class Grupo11 extends JuniorRobot {
	
	private Strategy estrategia;
	
	@Override
	public void run() {
		//me posiciono ?
		ahead(50);
		turnRight(45);
	}
	
	@Override
	public void onScannedRobot() {
		this.getEstrategia().onScannedRobot(this);
	}
	
	@Override
	public void onHitByBullet() {
		this.getEstrategia().onHitByBullet(this);
	}
	
	@Override
	public void onHitWall() {
		this.getEstrategia().onHitWall(this);
	}

	public Strategy getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Strategy estrategia) {
		this.estrategia = estrategia;
	}
	 
}
