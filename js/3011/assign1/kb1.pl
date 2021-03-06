numeral(0).
numeral(s(X)) :- numeral(X).
numeral(X + Y) :- numeral(X), numeral(Y).
numeral(p(X)) :- numeral(X).

add(0,X,X).
add(s(X), Y, s(Z)) :- add(X,Y,Z).

%Exercise 1
add2(0,Y,Z) :- eval(Y,Z).
add2(s(W),Y,s(Z)):-
	add2(W,Y,Z).
%add2(X,0,Z) :- eval(X,Z).
add2(W,s(Y),s(Z)):-	
	add2(W,Y,Z).
add2(U+V,Y,Z):-
	add2(U,V,W),
	add2(W,Y,Z).
%Exercise 2
add2(p(W),Y,Z):-
   add2(W,Y,s(Z)).
add2(W,p(Y),Z):-
   add2(W,Y,s(Z)).
add2(p(W),Y,p(Z)):-
   add2(W,Y,Z).

eval(0,0).
eval(X,X).
   
%eval(p(X),p(X)).
eval(X+Y,Z):-
	add2(X,Y,Z).

