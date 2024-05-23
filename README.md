# klasa tacka
0. NULTI ZAHTEV klasa point treba da nasledi klasu shape
1. Class point treba da sadrzi dva atributa sa njenim koordinatama u 2d prostoru u celobrojnoj vrednost
2. Klasa point treba imati atribut koji oznacava da li je tacka selektovana ili ne
3. Klasa point treba da ima prazan konstruktor
4. Klasa point treba imati konstruktor kojim mozemo inicijalizovati koordinate
5. Klasa point mora imati konst. kojim se inicijalizuju svi atributi klase
6. Klasa point mora imati metodu kojom se racuna udaljenost tacke od neke druge tacke 
7. Klasa point treba da sadrzi metodu kojom se odredjuje da li tacka sadrzi neku drugu tacku(distanca izmedju dve tacke <=2)
8. Klasa point treba imati metodu ToString koja vraca koordinate tacaka u zagradi odvojene zarezom
9. Klasa point treba da ima metodu equals koja treba da prima univerzalni tip object i vraca boolean ukoliko poslati objekat ima iste koord. kao i objekat koji ga poziva
10. Klasa point mora imati getere i setere za x i y
11. Klasa poit mora da overriduje metodu draw i da u toj metodi setuje boju na crnu, nacrta horizontalnu liniju pomocu metode DrawLine sa argumentima: x-2, y, x+2, y i nacrta vert. liniju sa drawline sa argumentima x, y-2, x, 2+2, Nakon toga ako je tacka selektovana treba da promeni boju u plavu i da se nacrta pravougaonik sa metodom DrawRect sa arg: x-2, y-2, 4, 4
12. Klasa point treba da overriduje metodu MoveTo za pomeranje tako sto ce da se tacka pomeri na nove date koordinate
13. Klasa point treba da overriduje metodu MoveBy iz Shape
14. Klasa point treba da overriduje metodu CompareTo
