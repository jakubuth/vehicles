# Zadanie Domowe – Klasy Abstrakcyjne i Dziedziczenie w Java

## Ważne Uwagi

1. **Praca musi być samodzielna!**  
   Rozwiąż zadanie bez konsultacji z innymi. Rozmowy z kolegami, zadawanie pytań i odpowiadanie na pytania dotyczące tego zadania (zarówno w trakcie jego rozwiązywania, jak i po ukończeniu) będą uznane za brak samodzielności. Skutkuje to **brakiem możliwości otrzymania plusa za aktywność na ćwiczeniach**.

2. **Pomaganie innym**, nawet po ukończeniu zadania, również spowoduje utratę uzyskanego wcześniej plusa.

3. Zadanie należy rozwiązać w środowisku **IntelliJ IDEA**.

4. **Zrzut ekranu na dowód samodzielności:**
   - Otwórz dysk `z:` w swoim systemie.
   - Na zrzucie ekranu powinny być widoczne: 
     - wszystkie testy przechodzące (w zakładce testów IntelliJ IDEA, po rozwinięciu opcji `Show Passed`),  
     - Twój identyfikator użytkownika (login z systemu).  

5. Po wykonaniu zrzutu ekranu, **wyślij swoje rozwiązanie na GitHub**.

---

## Treść Zadania

Stwórz hierarchię klas, która odwzorowuje różne rodzaje **pojazdów**. Zadanie ma na celu przećwiczenie dziedziczenia oraz wykorzystania klas abstrakcyjnych w Javie. Napisane klasy powinny spełniać wymagania zawarte w dostarczonych testach.

---

### Wymagania

1. **Pakiet**:  
   - Wszystkie klasy umieść w pakiecie `pl.example.vehicles`.

2. **Klasa abstrakcyjna `Vehicle`**:
   - Pole `String name`, przechowujące nazwę pojazdu.
   - Konstruktor przyjmujący `name` i przypisujący go do pola `name`.
   - Metoda `String getName()`, która zwraca nazwę pojazdu.
   - Abstrakcyjna metoda `void move()`, która będzie definiowana w klasach dziedziczących.
   - Abstrakcyjna metoda `String fuelType()`, która zwróci typ paliwa używanego przez dany pojazd.

3. **Klasy dziedziczące:**
   - **Klasa `Car`**:
     - Metoda `move()` wyświetla `"Car is driving"`.
     - Metoda `fuelType()` zwraca `"Petrol"`.
   - **Klasa `Bicycle`**:
     - Metoda `move()` wyświetla `"Bicycle is pedaling"`.
     - Metoda `fuelType()` zwraca `"Human Power"`.
   - **Klasa `Boat`**:
     - Metoda `move()` wyświetla `"Boat is sailing"`.
     - Metoda `fuelType()` zwraca `"Diesel"`.

4. **Testy:**
   - Przetestuj klasy przy użyciu dostarczonych testów w pliku `VehicleTest` (dostarczone w kodzie projektu).
   - Testy weryfikują poprawność implementacji metod `move()` i `fuelType()` oraz działania konstruktora.

---

## Co należy oddać?

1. **Pliki `.java`**:
   - `Vehicle`, `Car`, `Bicycle`, `Boat`.

2. **Zrzut ekranu**:
   - Widoczne wszystkie testy, które przeszły (zakładka testów IntelliJ IDEA, z rozwiniętą opcją `Show Passed`).
   - Widoczny identyfikator użytkownika (login w systemie po otwarciu dysku `z:`).

