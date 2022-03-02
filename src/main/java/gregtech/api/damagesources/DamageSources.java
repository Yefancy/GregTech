package gregtech.api.damagesources;

import gregtech.api.util.GregFakePlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;

public class DamageSources {

    private static final DamageSource EXPLOSION = new DamageSource("explosion").setExplosion();
    private static final DamageSource HEAT = new DamageSource("heat");
    private static final DamageSource FROST = new DamageSource("frost");
    private static final DamageSource ELECTRIC = new DamageSource("electric");
    private static final DamageSource RADIATION = new DamageSource("radiation").setDamageBypassesArmor();
    private static final DamageSource TURBINE = new DamageSource("turbine");
    private static final DamageSource EXTRACTION = new DamageSource("extraction");


    public static DamageSource getElectricDamage() {
        return ELECTRIC;
    }

    public static DamageSource getRadioactiveDamage() {
        return RADIATION;
    }

    public static DamageSource getExplodingDamage() {
        return EXPLOSION;
    }

    public static DamageSource getHeatDamage() {
        return HEAT;
    }

    public static DamageSource getFrostDamage() {
        return FROST;
    }

    public static DamageSource getTurbineDamage() {
        return TURBINE;
    }

    public static DamageSource getExterminationDamage(World worldIn) {
        return new EntityDamageSource("extermination", new GregFakePlayer(worldIn)).setDamageBypassesArmor();
    }

    public static DamageSource getExtractionDamage() {
        return EXTRACTION;
    }

}
