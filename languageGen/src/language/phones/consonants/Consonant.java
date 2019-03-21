package language.phones.consonants;

import java.util.EnumSet;
import language.phones.Voice;
import language.phones.Length;
import language.phones.Sound;

public class Consonant extends Sound {
/*
 *Place - list of Enums ?
 *Manner - Enum
 *Voicing - Enum
 *Length - Enum
 *Modifiers  - List of Enums?
 */
	EnumSet<Place> p;
	Manner m;
	Voice v;
	Length l;
	EnumSet<Modifier> ms;
}
