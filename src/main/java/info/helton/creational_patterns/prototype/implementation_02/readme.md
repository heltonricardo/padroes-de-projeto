#### Usando deep copy (cópia profunda):

Supondo a estrutura:

- ObjetoOriginal

  - campo1: int / Integer
  - campo2: Referencia

- ObjetoCopia
  - campo1: int / Integer
  - campo2: Referencia

As referências do ObjetoCopia também são clonadas. Dessa forma, existirá um
objeto referência para o ObjetoOriginal e um objeto referência diferente para o
ObjetoCopia.
