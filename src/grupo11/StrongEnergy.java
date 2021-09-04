package grupo11;

public class StrongEnergy implements Strategy {

	@Override
	public void onScannedRobot(Grupo11 robot) {
		// si el robot esta cerca disparo mas balas
		robot.turnGunTo(robot.scannedAngle);
		if(robot.scannedDistance < 20) {
			robot.fire(2);
		}else {
			robot.fire(1);
		}

	}

	@Override
	public void onHitByBullet(Grupo11 robot) {
		
		System.out.println("AHHHHH me dieron!!!");
		robot.turnRight(90);
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(1);
	}

	@Override
	public void onHitWall(Grupo11 robot) {
		System.out.println("alerta pared");
		robot.back(70);
		//robot.turnRight(90);
		//divido el tamaño del campo en 3 y me alejo esa distancia
		//robot.ahead(50);
	}

}
