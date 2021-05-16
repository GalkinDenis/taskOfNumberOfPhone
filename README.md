# taskOfNumberOfPhone

Форматирование номера телефона:

Команда разрабатывает систему хранения данных клиентов. Один из видов данных для хранения – номера телефонов российских операторов мобильной связи. Команде необходимо разработать функцию, которая будет приводить введенные в разном формате номера к унифицированному виду 8 (ХХХ) ХХХ-ХХ-ХХ.
Чтобы номер был успешно унифицирован, должны соблюдаться следующие правила ввода:

Строка состоит ровно из 11 цифр, но кроме них может содержать пробелы, знак "+ круглые скобки и дефисы.
Первая цифра в строке всегда либо 7, либо 8. Если первой цифрой стоит цифра 7, то непосредственно перед ней должен стоять знак "+". В других местах строки плюс стоять не может.
Цифры со второй по четвертую в номере образуют код оператора. Он может выделяться парными круглыми скобками: открывающая скобка "("слева от кода оператора, закрывающая ")"– справа.
Между соседними цифрами может быть не больше одного дефиса. Дефисы не могут стоять в коде оператора, между скобкой и цифрой, в начале или в конце номера.
Ввод любых других форматов должен приводить к ошибке и выводу error

Формат ввода:
Формат ввода может быть любым.

Формат вывода:
Если входная строка удовлетворяет вышеперечисленным требованиям, то выведите телефонный номер в формате 8 (XXX) XXX-XX-XX, иначе выведите "error".

Пример 1:
Ввод:
85656785588
Вывод:
8 (565) 678-55-88

Пример 2:
Ввод:
+79565765566
Вывод:
8 (956) 576-55-66

Пример 3
Ввод:	
8 (999) 555-66-77
Вывод:
8 (999) 555-66-77

Пример 4:
Ввод:
8 )989) 000-55-66
Вывод:
error

Пример 5:
Ввод:	
+7(999)-2-515-1-77
Вывод:
error
