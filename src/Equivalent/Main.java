package Equivalent;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import Equivalent.contents.blocks.*;

public class Main extends Mod{
	

	
    public Main(){
    }

    @Override
    public void loadContent(){
		new NewRecovery().load();
    }
	
}
