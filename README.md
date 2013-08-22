﻿## Sinrel Launcher Engine  
SLE ( Sinrel Launcher Engine ) — это движок позволяющий создавать Minecraft-лаунчеры практически любой сложности.  

### Внимание
В связи с разработкой второго поколения SLE, ветка develop крайне нестабильна, и негодится для использования в разработке!  
Настоятельно не рекомендуется использовать в коммерческих проектах.
  
### Текущая версия  
2.0.0

### Процесс разработки  
При разработке на движке SLE разработчику фактически остаётся писать только графический интерфейс (GUI), что весьма значительно сокращает сроки разработки лаунчера.  

Для инициализации и работы с SLE используйте такую конструкцию:
```Java
//EngineSettings settings = new EngineSettings( "домен", "путь на сервере", "рабочая папка", "версия", "код версии");
EngineSettings settings = new EngineSettings( "example.com", "launcher", "minecraft", "0.1", 1 );
Engine engine = new Engine(settings);
```  

### Отличие SLE от SLE 2
Новое поколение движка построено практически полностью на переработанной архитектуре. Что положительно скажется на вашем коде.  
Также появилась поддержка Minecraft версии 1.6 и выше! Теперь ваш лаунчер с минимальными от вас усилиями сможет оставаться актуальным в мире игры Minecraft. 

### Лицензия  
GNU Lesser General Public License v3.0 (LGPL v3)
                       