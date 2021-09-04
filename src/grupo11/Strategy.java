package grupo11;

public interface Strategy {
	// en esto se diferencian las dos estrategias
	//por eso lo pongo en una interface
	
	public void onScannedRobot(Grupo11 robot);
	
	public void onHitByBullet(Grupo11 robot);
	
	public void onHitWall(Grupo11 robot);
	
}
