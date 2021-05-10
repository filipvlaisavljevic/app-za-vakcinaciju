

<br />
<p >
  <a href="https://github.com/github_username/repo_name">
    <img src="https://i.imgur.com/Mx9CcVW.png" alt="Logo" width="80" height="80">
  </a> <h3 >Aplikacija za vakcinaciju</h3>

  <p >
    Mobilna aplikacija napravljena sa ciljem lakše evidencije i prijava za vakcinaciju tijekom pandemije izazvane Covid-19 virusom. U teškoj situaciji u borbi sa korona virusom, pravovremena vakcinacija je ključna. Ova omogućava jednostavnu prijavu za vakcinaciju. Sve što trebate je upisati svoje lične podatke i odabrati kojom vakcinom se želite vakcinisati. Aplikacija vodi računa o ukupnom broju dosad prijavljenih korisnika i na taj način ubrzava sam proces vakcinacije.
    <br />
    <br />
    <a href="#dodati_youtube_link">Pogledaj Demo</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Sadržaj projekta</h2></summary>
  <ol>
    <li><a href="#struktura-aplikacije">Struktura apliakcije</a></li>
    <li><a href="#fragmenti-aplikacije">Fragmenti aplikacije</a></li>
    <li><a href="#autori-projekta">Informacije o autorima projekta</a></li>
  </ol>
</details>


<!-- INFORMACIJE O PROJEKTU -->
## Struktura aplikacije
Sama struktura aplikacije sačinjena je od više različitih fragmenata od kojih svaki ima svoju ulogu. Na svakom fragmentu postavljena su sljedeća ograničenja: font, size, layouti za svaki fragment itd. Korištena je navigacijska komponenta zajedno sa bočnim menijem, bottom menijem te navigacijom putem buttona. Većina fragmenata urađena je koristeći ConstraintLayout kako bi se lakše postigao željeni raspored elemenata u fragmentu. Za textualne informacije, kroz cijelu aplikaciju, korišten je font family: "font/asap".Veličina fonta naslova je 40 sp, veličina fonta na buttonima je 23 sp, dok svaki text view ima font 16 sp. U res/values folderu korišten je string.xml za svaki oblik texta kako bi se izbjeglo korištenje "hardcodiran-ih" naziva i textualnih polja. Za dizajn su iskorištene 3 nijanse plave boje, te je raspored ključnh elemenata na svakom fragmentu isti kako bi se držali standardnih Android vizuelnih rješenja.

#### Navigaciona komponenta
Navigacija se odnosi na interakcije koje omogućavaju korisnicima navigaciju kroz različite dijelove sadržaja u aplikaciji i natrag iz njih. Navigacijska komponenta također osigurava dosljedno i unaprijed poznato korisničko iskustvo pridržavajući se utvrđenog skupa principa. Navigacija se odvija između odredišta aplikacije - to jest bilo gdje u aplikaciji do koje korisnici mogu doći. Ova odredišta su povezana akcijama. Grafikon za navigaciju je datoteka resursa koja sadrži sva odredišta i radnje. Grafikon predstavlja sve navigacijske staze aplikacije. Komponenta navigacija pruža niz mogućnosti, koje omogućavaju lakše korištenje aplikacije kao što su:
- Pravilno rukovanje aktivnostima gore i nazad prema zadanim postavkama.
- Omogućava standardiziranih resursa za animacije i prijelaze.
- Daje poveznicu između svih fragmenata aplikacije
- Sadrži Safe Args - Gradle dodatak koji pruža sigurnost tipa prilikom navigacije i prosljeđivanja podataka između odredišta

#### Bočni meni

Nakon što korisnik pokrene aplikaciju, u lijevom gornjem uglu nalazi se button koji, kada se klikne, otvara bočni meni.  U otvorenom bočnom meniju korisnik ima dvije opcije:

- Klik na "Vrati se na početak" koji ga vodi nazad na početnu stranicu
- Klik na "Informacije" koje prikazuju kratki opis aplikacije i imena studentata koji su vršili razvoj ove aplikacije 

Ukoliko korisnik klikne na "Informacije" ima mogućnost da odabere na kojem jeziku (bosanski ili engleski) želi da pročita osnovne informacije o aplikaciji.  Nakon što provjeri informacije o projektu korisnik ima mogućnost da se vrati na početni frgment na 2 načina:
- Klikom na "Vrati se na početak" u donjem lijevom uglu (dio bottom menija)
- Ponovnim klikom na bočni menij i unutar bočnog menija pronaći "Vrati se na početak" što ga vodi na početni fragment koji započinje prijavu za vakcinaciju

<!-- INFORMACIJE O PROJEKTU -->
## Fragmenti aplikacije
#### Početni fragment 
Na početnom fragmentu nalazi se kratki opis aplikacije, te logo aplikacije. Također, korisnik može odabrati koji jezik želi - bosanski ili engleski i shodno tome koji je jezik korisnik izabrao, text na fragmentu se mijenja.  Na dnu stranice nalazi se button "Započni prijavu". Klikom na to dugme korisnik prelazi na naredni fragment i započinje prijavu za vakcinaciju.

#### Prijava fragment
Na prijava fragmentu aplikacija zahtjeva od korisnika da unese osnovne informacije o sebi. Potrebno je unijeti podatke o imenu, prezimenu korisnika, državi u kojoj je rođen, gradu stanovanja, ulici prebivališta, te datumu rođenja. U pojašnjenju je navedeno kako se dobiveni podaci neće zloupotrebljavati, već da će služiti samo u svrhu prijave za vakcinaciju. Nakon što je unijeo sve potrebne podatke o sebi, korisnik klikom na dugme "Nastavak" spašava svoje podatke i započinje proces prijave za vakcinaciju. Nakon klika na dugme "Nastavak" otvara se novi fragmenat. Ukoliko je korisnik državljanin Bosne i Hercegovine, te je unijeo sve podatke ispravno, otvara se novi fragment - provjera pripadnosti određenoj prioritetnoj grupi. Ukoliko je korisnik strani državljanin te je u polje "država" unijeo neku državu koja nije Bosna i Hercegovina, otvara se novi fragment - strani državljanin, greška.

#### Greška za stranog državljanina
Ukoliko se prilikom prijave korisnik izjasnio kao strani državljanin, tj. da nije državljanin Bosne i Hercegovine, prikazuje mu se ovaj fragment. Na fragmentu je jednostavna slika koja pokazuje korisniku da je napravio grešku, te da ne može nastaviti prijavu za vakcinaciju. Ispod slike je jednostavno textualno objašnjenje koje naglašava korisniku kako vakcinacija nije moguća za strane državljane.

#### Prioritetna grupa fragment

Ovaj fragment provjerava da li korisnik pripada nekoj od grupa ljudi koji po zakonu imaju pravo prvenstva prilikom vakcinacije, tj. prioritet su u odnosu na ostale građane. Jednostavno, kako je u objašnjenu navedeno, korisnik koji se prijavljuje za vakcinaciju treba označiti da li pripada nekoj od ponuđenih grupa. Ukoliko ne pripada, treba označiti dugme "Ne pripadam" i nastavi dalje. Buttoni su formirani kao "Radio button-i", jer na taj način želimo dozvoliti korisniku da može izabrati samo jednu grupu kojoj pripada (pretpostavljamo da korisnik ne može biti npr. u isto vrijeme u staračkom domu i obavljati funkciju medicinskog radnika). Nakon označavanja jednog od ponuđenih radio buttona, korisnik klikom na dugme "Nastavi dalje" prelazi na sljedeći fragment. Odabir odgovora je zabilježen i bit će prikazan na konačnom fragmentu.

#### Bolest fragment

Kako bi se izbjegle neželjene nuspojave nakon vakcinacije, neophodno je da korisnik, ukoliko boluje od neke bolesti, navede o kojoj je bolesti riječ. U bolest fragment korisnik ima opciju da napiše ukoliko boluje od neke bolesti, a ukoliko ne boluje, treba ostaviti polje prazno. Nakon što završi ovaj korak, korisnik klikom na dugme "Nastavak" prelazi na sljedeću aktivnost, a njegov odgovor je zabilježen i sačuvan.

#### Izbor vakcine fragment

Ovaj fragment je jedan od važnijih dijelova aplikacije. U ovom fragmentu korisnik na raspolaganju ima 4 najpoznatije i najkorištenije vakcine. Aplikacija omogućava korisniku da odabere jednu od 4 ponuđene vakcine kojom želi da se vakciniše. Vakcine su ponuđene u obliku radio buttona, jer se podrazumijeva da korisnik ne može izabrati više od jedne vakcine za vakcinaciju. Na fragmetu se nalaze još dva buttona od kojih je jedan button "Pogledaj statistiku". Klikom na taj dugmić, korisniku se otvara novi fragment u kojem je prikazan grafik korištenosti ove 4 vakcine. Na taj način, korisniku se omogućava statistički uvid u iskorištenost određene vakcine i omogućava lakši odabir vakcine. Nakon odabira željene vakcine, korisnik klikom na dugme "Nastavak" spašava svoj odabir i završava najvažniji dio prijave za vakcinaciju.

#### Statistika fragment

Ovaj fragment je grafički prikaz statistike odabira vakcina od strane korisnika. Grafika je prikazana pomuću stupčastog dijagrama od kojih svaki stupac pretstavlja jednu vakcinu. Veličina samog stupca zavisi od broja vakcina iste vrste koju su korisnici izabrali kao vakcinu kojom žele da se vakcinišu.

#### Sažetak fragment
U ovom fragmentu su prikazane osnovne informacije o korisniku. Prikazuju se osobne informacije sa početnog fragmenta, kao što su ime i prezime, datum rođenja, grad i ulica stanovanja. Također, prikazuje se bolest koju je korisnik naveo (ako boluje od nečega) u bolset fragmentu, te prioritetna grupa kojoj korisnik pripada (ukoliko pripada ijednoj prioritetnoj grupi). U prevodu, ovaj fragment sumira sve informacije koje je korisnik upisao i prikazuje ih na jednom mjestu. Na dnu se nalazi dugme "Nastavak" koje korisnika, nakon klika, vodi na poslijednji fragment aplikacije, termin fragment.

#### Termin fragment

Ovaj fragment je poslijedni fragment ove aplikacije. Na ovom fragmentu se nalazi brojač koji prikazuje koliko je dosad ljudi prijavljeno za vakcinaciju. Nakon svake nove uspješne prijave, broj prijavljenih korisnika se povećava za jedan. Također, korisniku se dodjeljuje lokacija vakcinacije i vrijeme vakcinacije. Lokacije i vremena vakcinacije čuvaju se u listi i dodjeljuju korisniku nakon prijave. Na dnu fragmenta nalazi se button "Podijeli sa ostalima". Klikom na ovo dugme korisnik može podijeliti uspješnu prijavu za vakcinaciju sa ostalim ljudima i na taj način ih motivisati da se i oni prijave za vakcinaciju. Ovim fragmentom je kompletirana aplikacija.

## Autori projekta

:man: Filip Vlaisavljević  - Prirodno-matematički fakultet, Sarajevo <br>
:man: Stefan Košavić - Prirodno-matematički fakultet, Sarajevo




<!-- LICENSA -->
## License

Distributed under the MIT License. See `LICENSE` for more information.


