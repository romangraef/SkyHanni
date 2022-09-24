package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.config.core.config.Position;
import at.hannibal2.skyhanni.config.core.config.annotations.*;
import com.google.gson.annotations.Expose;

public class Slayer {

    @Expose
    @ConfigOption(name = "Blaze", desc = "")
    @ConfigEditorAccordion(id = 0)
    public boolean damageSplash = false;

    @Expose
    @ConfigOption(name = "Pillar Display", desc = "Cooldown when the Fire Pillar from the Blaze Slayer will kill you.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean firePillarDisplay = false;

    @Expose
    @ConfigOption(name = "Pillar Display Position", desc = "")
    @ConfigEditorButton(runnableId = "firePillar", buttonText = "Edit")
    @ConfigAccordionId(id = 0)
    public Position firePillarPos = new Position(10, 10, false, true);

    @Expose
    @ConfigOption(name = "Pillar Sound", desc = "Custom countdown sound for the Fire Pillar timer for the Blaze Slayer.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean firePillarSound = false;

    @Expose
    @ConfigOption(name = "Hide Pillar", desc = "Hide sound and entities when building the Fire Pillar for the Blaze Slayer.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean firePillarBuildHider = false;

    @Expose
    @ConfigOption(name = "Blaze Daggers", desc = "Faster and permanent display for the Blaze Slayer daggers")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean blazeDaggers = false;

    @Expose
    @ConfigOption(name = "Fire Pits", desc = "Warning when the fire pit phase starts for the Blaze Slayer tier 3 and 4")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean firePitsWarning = false;

    @Expose
    @ConfigOption(name = "Slayer Miniboss Highlight", desc = "Highlight slayer miniboss in blue color")
    @ConfigEditorBoolean
    public boolean slayerMinibossHighlight = false;

    @Expose
    @ConfigOption(name = "Slayer Enderman Beacon", desc = "Highlight the enderman slayer Yang Glyph (Beacon) in red color (supports beacon in hand and beacon flying)")
    @ConfigEditorBoolean
    public boolean slayerEndermanBeacon = false;

    @Expose
    @ConfigOption(name = "Hide Mob Names", desc = "Hide the name of the mobs you need to kill in order for the Slayer boss to spawn. Exclude mobs that are damaged, corrupted, runic or semi rare.")
    @ConfigEditorBoolean
    public boolean hideMobNames = false;

    @Expose
    @ConfigOption(name = "Quest Warning", desc = "Warning when wrong slayer quest is selected, or killing mobs for the wrong slayer.")
    @ConfigEditorBoolean
    public boolean questWarning = false;
}
