# Tarea2
Tarea2

Existen 4 paquetes
1.- AST:
  Este paquete contiene la interfaz NodeType y cada clase de operaciones. La documentacion se encuentra en la interface NodeType y en la clase Or.
  Un ej uso de AST, tomando en cuenta el correcto uso de los tipos es el siguiente:
  NodeType Arbol = Add(new TypeString("hola"), new TypeString("mundo"));
  TypeString Arbolresultado = Arbol.calculate;
  *Notese* En caso de que alguna de las operaciones sea incorrecta el retorno de .calculate() sera null.
  OrTest esta documentado.
  
2.- Factory/ActualType:
  Este paquete contiene las clases que permiten crear objetos ahorrando memoria, mediante el uso del patron Flyweight. La documentacion se encuentra en la clase
  MakeString.
  Un ej de uso para MakeString seria el siguiente:
  MakeString StringMaker = new MakeString();
  TypeString Str1 = StringMaker.make(id: "holamundo", new TypeString("hola mundo"));
  TypeString Str2 = StringMaker.simpleMake(new TypeString("hola mundo"));
  MakeStringTest esta documentado.
  
3.- TESTS:
  Este package contiene todos los test de la tarea 2 ordenados para que sea mas sencillo revisarlos. Algo que mejore de la entrega de la tarea pasada.
  
4.- Type:
  Los tipos definidos en la tarea pasada. Poco o nada ha cambiado. Los cambios estan descritos en la documentacion de AST.
  
  
