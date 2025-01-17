package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.config.core.config.annotations.ConfigAccordionId;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigEditorAccordion;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigEditorBoolean;
import at.hannibal2.skyhanni.config.core.config.annotations.ConfigOption;
import com.google.gson.annotations.Expose;

public class Mobs {

    @Expose
    @ConfigOption(name = "Highlighters", desc = "")
    @ConfigEditorAccordion(id = 0)
    public boolean highlighters = false;

    @Expose
    @ConfigOption(name = "Area Boss", desc = "Highlight Golden Ghoul, Old Wolf, Voidling Extremist and Millenia-Aged Blaze.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean areaBossHighlight = true;

    @Expose
    @ConfigOption(name = "Arachne Keeper", desc = "Highlight corrupted mobs in purple color.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean arachneKeeperHighlight = true;

    @Expose
    @ConfigOption(name = "Corleone", desc = "Highlight Boss Corleone in the Crystal Hollows.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean corleoneHighlighter = true;

    @Expose
    @ConfigOption(name = "Zealot", desc = "Highlight Zealots and Bruisers in The End.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean zealotBruiserHighlighter = false;

    @Expose
    @ConfigOption(name = "Special Zealots", desc = "Highlight Special Zealots in The End. (The one that drops Summoning Eyes)")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean specialZealotHighlighter = true;

    @Expose
    @ConfigOption(name = "Corrupted Mob", desc = "Highlight corrupted mobs in purple color.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean corruptedMobHighlight = false;

    @Expose
    @ConfigOption(name = "Respawn Timers", desc = "")
    @ConfigEditorAccordion(id = 1)
    public boolean timers = false;

    @Expose
    @ConfigOption(name = "Area Boss", desc = "Show a timer when Golden Ghoul, Old Wolf, Voidling Extremist or Millenia-Aged Blaze respawns.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 1)
    public boolean areaBossRespawnTimer = false;
}
