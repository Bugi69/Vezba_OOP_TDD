# klasa tacka
NULTI ZAHTEV klasa tacka treba da nasledi klasu shape
Class point treba da sadrzi dva atributa sa njenim koordinatama u 2d prostoru u celobrojnoj vrednost
Klasa tacka treba imati atribut koji oznacava da li je tacka selektovana ili ne
Klasa tacka treba da ima prazan konstruktor
Klasa tacka treba imati konstruktor kojim mozemo inicijalizovati koordinate
Klasa tacka mora imati konst. kojim se inicijalizuju svi atributi klase
Klasa tacka mora imati metodu kojom se racuna udaljenost tacke od neke druge tacke 
Klasa tacka treba da sadrzi metodu kojom se odredjuje da li tacka sadrzi neku drugu tacku(distanca izmedju dve tacke <=2)
Klasa tacka treba imati metodu ToString koja vraca koordinate tacaka u zagradi odvojene zarezom
Klasa tacka treba da ima metodu equals koja treba da prima univerzalni tip object i vraca boolean ukoliko poslati objekat ima iste koord. kao i objekat koji ga poziva
Klasa tacka mora imati getere i setere za x i y
Klasa tacka mora da overriduje metodu draw i da u toj metodi setuje boju na crnu, nacrta horizontalnu liniju pomocu metode DrawLine sa argumentima: x-2, y, x+2, y i nacrta vert. liniju sa drawline sa argumentima x, y-2, x, 2+2, Nakon toga ako je tacka selektovana treba da promeni boju u plavu i da se nacrta pravougaonik sa metodom DrawRect sa arg: x-2, y-2, 4, 4
Klasa tacka treba da overriduje metodu MoveTo za pomeranje tako sto ce da se tacka pomeri na nove date koordinate
Klasa tacka treba da overriduje metodu MoveBy iz Shape
Klasa tacka treba da overriduje metodu CompareTo