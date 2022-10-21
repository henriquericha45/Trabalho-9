; Henrique Levandoski Richa

; 1. Utilizando a linguagem Clojure, crie uma função chamada ultimo 
; que receba uma lista e devolva o último elemento desta lista sem 
; usar as funções já prontas e disponíveis para esta mesma 
; finalidade na linguagem Clojure.
(defn ultimo [lista]
    (if (empty? (rest lista))
      (first lista)
      (ultimo (rest lista))))
  
  (print "Func. 1: entrada: 1 2 3 4 5 6 7 8 9 10; resultado: ")
  (println(ultimo '(1 2 3 4 5 6 7 8 9 10)))
  
  ; 2. Utilizando a linguagem Clojure, crie uma função chamada 
  ; penultimo que receba uma lista e devolva o penúltimo elemento 
  ; desta lista usar as funções já prontas e disponíveis para 
  ; esta mesma finalidade na linguagem Clojure.
  (defn penultimo [lista]
    (if (empty? (rest (rest lista)))
      (first lista)
      (penultimo (rest lista))))
  
  (print "Func. 2: entrada: 1 2 3 4 5 6 7 8 9 10; resultado: ")
  (println (penultimo '(1 2 3 4 5 6 7 8 9 10)))
  
  ; 3. Utilizando a linguagem Clojure, crie uma função chamada 
  ; elementoN que receba uma lista e um inteiro N e devolva o 
  ; elemento que está na posição N desta lista usar as funções já
  ;prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
  (defn elementoN [lista n]
    (nth lista n))
  
  (print "Func. 3: entrada: [1 2 3 4 5] 4; resultado: ")
  (println(elementoN [1 2 3 4 5] 4))
  
  ; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso
  ; que  receba uma  lista  e devolva esta lista com as posições dos 
  ; elementos invertidas. Por exemplo recebe [1,2,3] e 
  ; devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para 
  ; esta mesma finalidade na 
  ;linguagem Clojure.
  (defn inverso [lista]
    (reverse lista))
  
  (print "Func. 4: entrada: [1 2 3]; resultado: ")
  (println(inverso [1 2 3]))
  
  ; 5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e 
  ; devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis 
  ; para esta mesma finalidade na linguagem Clojure.
  (defn mdc [a b]
    (if (= b 0)
      a
      (recur b (mod a b))))
  
  (print "Func. 5: entrada: 12 24; resultado: ")
  (println(mdc 12 24))
  