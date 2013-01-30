package in.dashie.energetic.mod;

public class TestMod extends Mod implements IPlayerMoveEvent, IGameTick {
	@Override
	public void playerMoveEvent(double posX, double posY, double posZ,
			boolean onGround) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
	}

	@Override
	public double getVersion() {
		return 6.9;
	}

	@Override
	public String getName() {
		return "Test Mod";
	}

	@Override
	public String getDeveloper() {
		return "Jordin";
	}

	@Override
	public void onGameTick() {
		// TODO Auto-generated method stub
	}

	@Override
	public String getCategory() {
		return "Developer";
	}

	@Override
	public int getColor() {
		return 0xff000000;
	}

}
