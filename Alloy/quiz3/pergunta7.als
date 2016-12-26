open util/ordering[RunState]

-- static model

sig Symbol {}

sig State {}

one sig DFA {
  states: set State, 
  alphabet: set Symbol, 
  start: states,
  transitions: states -> alphabet -> lone states,
  accept: set states
}
{
  states = start.*{source: states, target: transitions[source, Symbol]} 
}

-- dynamic model

sig RunState { 
  dfa: DFA, 
  current: lone State,
  lastSymbol: lone Symbol -- last symbol processed
}

pred init[a: DFA, r: RunState] {
	r.dfa = a,
	no r.lastSymbol,
	r.current = a.start
}

pred step[r: RunState, s: Symbol, r': RunState] {
	r'dfa = r.dfa,
	r'.lastSymbol = s
}

fact trace {
  init[DFA, first]
  all r: RunState, r': r.next | some s: Symbol | step[r, s, r']
}
