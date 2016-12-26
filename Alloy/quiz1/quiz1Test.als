 sig Town{country: Country}
 sig Country {capital: Town} {capital.country = this}

sig Lisboa, Madrid, Barcelona, Londres, Berlim extends Town {}
sig Alemanha, Portugal, Inglaterra, Espanha extends Country {}

run {} 
