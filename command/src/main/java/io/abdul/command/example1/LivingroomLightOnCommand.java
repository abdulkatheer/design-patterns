package io.abdul.command.example1;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
