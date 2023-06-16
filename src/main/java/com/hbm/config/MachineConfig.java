package com.hbm.config;

import net.minecraftforge.common.config.Configuration;

public class MachineConfig {

	public static int delayPerOperationDerrick = 50;
	public static int powerConsumptionPerOperationDerrick = 100;

	public static int oilPerDepositBlockMinDerrick = 500;
	public static int oilPerDepositBlockMaxExtraDerrick = 0;
	public static int gasPerDepositBlockMinDerrick = 100;
	public static int gasPerDepositBlockMaxExtraDerrick = 401;


	public static int delayPerOperationPumpjack = 25;
	public static int powerConsumptionPerOperationPumpjack = 200;
	public static int oilPerDepositBlockMinPumpjack = 650;

	public static int oilPerDepositBlockMaxExtraPumpjack = 0;
	public static int gasPerDepositBlockMinPumpjack = 110;
	public static int gasPerDepositBlockMaxExtraPumpjack = 401;

	public static int delayPerOperationFrackingTower = 20;
	public static int powerConsumptionPerOperationFrackingTower = 5000;
	public static int solutionConsumptionPerOperationFrackingTower = 10;
	public static int worldDestructionRangeFrackingTower = 32;

	public static int oilPerDepositBlockMinFrackingTower = 1000;
	public static int oilPerDepositBlockMaxExtraFrackingTower = 0;
	public static int gasPerDepositBlockMinFrackingTower = 200;
	public static int gasPerDepositBlockMaxExtraFrackingTower = 401;

	public static int oilPerBedrockDepositBlockMinFrackingTower = 100;
	public static int oilPerBedrockDepositBlockMaxExtraFrackingTower = 0;
	public static int gasPerBedrockDepositBlockMinFrackingTower = 10;
	public static int gasPerBedrockDepositBlockMaxExtraFrackingTower = 50;

	private static String generateConfigName(final int idx, final String fieldName) {
		return String.format("9.%02d_%s", idx, fieldName);
	}

	public static void loadFromConfig(Configuration config) {
		final String CATEGORY_MACHINE = "09_machines";

		// Oil derrick settings
		delayPerOperationDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(0, "delayPerOperationDerrick"), "Controls how much delay between extraction or drilling operations for Oil Derricks", 50);
		powerConsumptionPerOperationDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(1, "powerConsumptionPerOperationDerrick"), "Controls how much power is consumed per operation for Oil Derricks", 100);

		oilPerDepositBlockMinDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(2, "oilPerDepositBlockMinDerrick"), "Controls how much crude oil at minimum is extracted per deposit block for Oil Derricks", 500);
		oilPerDepositBlockMaxExtraDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(3, "oilPerDepositBlockMaxExtraDerrick"), "Controls how much extra crude oil can be extracted per deposit block for Oil Derricks", 0);
		gasPerDepositBlockMinDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(4, "gasPerDepositBlockMinDerrick"), "Controls how much natrual gas at minimum is extracted per deposit block for Oil Derricks", 100);
		gasPerDepositBlockMaxExtraDerrick = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(5, "gasPerDepositBlockMaxExtraDerrick"), "Controls how much extra natrual gas can be extracted per deposit block for Oil Derricks", 401);

		// Pumpjack settings
		delayPerOperationPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(6, "delayPerOperationPumpjack"), "Controls how much delay between extraction or drilling operations for Pumpjacks", 25);
		powerConsumptionPerOperationPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(7, "powerConsumptionPerOperationPumpjack"), "Controls how much power is consumed per operation for Pumpjacks", 200);

		oilPerDepositBlockMinPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(8, "oilPerDepositBlockMinPumpjack"), "Controls how much crude oil at minimum is extracted per deposit block for Pumpjacks", 650);
		oilPerDepositBlockMaxExtraPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(9, "oilPerDepositBlockMaxExtraPumpjack"), "Controls how much extra crude oil can be extracted per deposit block for Pumpjacks", 0);
		gasPerDepositBlockMinPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(10, "gasPerDepositBlockMinPumpjack"), "Controls how much natrual gas at minimum is extracted per deposit block for Pumpjacks", 110);
		gasPerDepositBlockMaxExtraPumpjack = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(11, "gasPerDepositBlockMaxExtraPumpjack"), "Controls how much extra natrual gas can be extracted per deposit block for Pumpjacks", 401);

		// Fracking tower settings
		delayPerOperationFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(12, "delayPerOperationFrackingTower"), "Controls how much delay between extraction or drilling operations for Fracking towers", 20);
		powerConsumptionPerOperationFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(13, "powerConsumptionPerOperationFrackingTower"), "Controls how much power is consumed per operation for Fracking towers", 5000);
		solutionConsumptionPerOperationFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(14, "solutionConsumptionPerOperationFrackingTower"), "Controls how much fracking solution is consumed per operation for Fracking towers", 10);
		worldDestructionRangeFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(15, "worldDestructionRangeFrackingTower"), "Controls how far in blocks around a Fracking tower the world is affected during operation", 32);

		oilPerDepositBlockMinFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(16, "oilPerDepositBlockMinFrackingTower"), "Controls how much crude oil at minimum is extracted per deposit block for Fracking towers", 1000);
		oilPerDepositBlockMaxExtraFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(17, "oilPerDepositBlockMaxExtraFrackingTower"), "Controls how much extra crude oil can be extracted per deposit block for Fracking towers", 0);
		gasPerDepositBlockMinFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(18, "gasPerDepositBlockMinFrackingTower"), "Controls how much natrual gas at minimum is extracted per deposit block for Fracking towers", 200);
		gasPerDepositBlockMaxExtraFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(19, "gasPerDepositBlockMaxExtraFrackingTower"), "Controls how much extra natrual gas can be extracted per deposit block for Fracking towers", 401);

		oilPerBedrockDepositBlockMinFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(20, "oilPerBedrockDepositBlockMinFrackingTower"), "Controls how much crude oil at minimum is extracted per bedrock deposit block for Fracking towers", 100);
		oilPerBedrockDepositBlockMaxExtraFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(21, "oilPerBedrockDepositBlockMaxExtraFrackingTower"), "Controls how much extra crude oil can be extracted per bedrock deposit block for Fracking towers", 0);
		gasPerBedrockDepositBlockMinFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(22, "gasPerBedrockDepositBlockMinFrackingTower"), "Controls how much natrual gas at minimum is extracted per bedrock deposit block for Fracking towers", 10);
		gasPerBedrockDepositBlockMaxExtraFrackingTower = CommonConfig.createConfigInt(config, CATEGORY_MACHINE, generateConfigName(23, "gasPerBedrockDepositBlockMaxExtraFrackingTower"), "Controls how much extra natrual gas can be extracted per bedrock deposit block for Fracking towers", 50);

	}
}
