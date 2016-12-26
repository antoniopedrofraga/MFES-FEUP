/* 
* Modeling the strututure and execution of deterministic finite automata.
* FEUP, MFES, 22 Nov 2016 
*/

open util/ordering[ExecutionState]

sig State {}

sig Symbol{}

sig Automaton {
	states:  set State,
	alphabet: set Symbol,
	transitions: (states -> alphabet) -> one states,
	start: states,
	accepting: set states
}{
	-- all states are reachable from start
	states = start.* {s, s': states | some s.transitions.s'}
}

sig ExecutionState {
	automaton: Automaton,
	current: State,
	lastSymbol: lone Symbol
} {
	current in automaton.states
	lastSymbol in automaton.alphabet
}

pred start[a: Automaton, e': ExecutionState] {
	e'.automaton = a
	e'.current = a.start
	no e'.lastSymbol
}

pred input[e: ExecutionState, s: Symbol, e': ExecutionState] {
	s in e.automaton.alphabet
	e'.automaton = e.automaton
	e'.current = e.automaton.transitions[e.current][s]
	e'.lastSymbol = s
}

fact validTraces {
	some a: Automaton | start[a, first]	
	all e: ExecutionState, e': e.next | some s: Symbol | input[e, s, e']
}

run findTraceAccepting {
	last.current in last.automaton.accepting
} for 3 but exactly 1 Automaton
