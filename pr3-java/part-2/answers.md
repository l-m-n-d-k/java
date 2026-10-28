# Практика 3, часть 2. Ответы на вопросы

## 1. Пример примитивного типа данных, который используется для хранения полей в классе

`int`. Например, в классе `Bike` поле `private int numGears;` (количество передач).

Другие примеры: `int tyreWidth` и `int postHeight` в `RoadBike`, `int frameSize` в `MountainBike`.

`String` примитивным типом не является, это ссылочный тип (класс).

## 2. Пример того, где происходит конкатенация строк

В методе `printDescription()` класса `Bike`: строки склеиваются оператором `+`:

```java
System.out.println("\n" + this.getMake() + "\n"
        + "This bike has " + this.handleBars + " handlebars on a "
        + this.frame + " frame with " + this.numGears + " gears."
        + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
```

Аналогично в `printDescription()` классов `RoadBike` и `MountainBike`. Числа (`numGears`, `tyreWidth`) при склейке автоматически преобразуются в текст.

## 3. Каковы имена объектов, созданных в этой программе

Все объекты создаются в `BikeDriver.main`:

| Имя | Класс | Как создан |
|---|---|---|
| `bike1` | `RoadBike` | конструктор без параметров (значения по умолчанию) |
| `bike2` | `RoadBike` | конструктор с 7 параметрами (`"drop", "tourer", "semi-grip", "comfort", 14, 25, 18`) |
| `bike3` | `MountainBike` | конструктор без параметров (значения по умолчанию) |
| `bike4` | `Bike` | конструктор без параметров (поля не заданы: `null` и `0`) |

## 4. Сколько конструкторов у каждого класса

| Класс | Конструкторов | Какие |
|---|---|---|
| `Bike` | 2 | без параметров; с 5 параметрами (`handleBars`, `frame`, `tyres`, `seatType`, `numGears`) |
| `RoadBike` | 3 | без параметров; с одним параметром (`postHeight`); с 7 параметрами |
| `MountainBike` | 2 | без параметров; с 8 параметрами |
| `BikeDriver` | 0 явных | Java создаёт конструктор по умолчанию, объекты этого класса не создаются |

Интерфейсы (`BikeParts`, `MountainParts`, `RoadParts`) конструкторов не имеют: объект интерфейса создать нельзя.

## 5. Наследование: определите супер- и подклассы

- **Суперкласс** (родитель): `Bike`.
- **Подклассы** (наследники): `RoadBike` и `MountainBike`.

`BikeDriver` в иерархии не участвует, он только использует классы.

После модернизации к этому добавляются интерфейсы:
`Bike implements BikeParts`, `RoadBike implements RoadParts`, `MountainBike implements MountainParts`.

## 6. Примеры значений, назначенных стандартному велосипеду каждого типа

| Поле | Стандартный `RoadBike` (`bike1`) | Стандартный `MountainBike` (`bike3`) |
|---|---|---|
| `handleBars` | `drop` | `Bull Horn` |
| `frame` | `racing` | `Hardtail` |
| `tyres` | `tread less` | `Maxxis` |
| `seatType` | `razor` | `dropper` |
| `numGears` | 19 | 27 |
| `tyreWidth` | 20 | нет такого поля |
| `postHeight` | 22 | нет такого поля |
| `suspension` | нет такого поля | `RockShox XC32` |
| `type` | нет такого поля | `Pro` |
| `frameSize` | нет такого поля | 19 |
