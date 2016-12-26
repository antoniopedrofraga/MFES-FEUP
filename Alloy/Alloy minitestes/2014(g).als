sig Student{}
sig Exam{grades:Student->lone Int}

fun results[s: Student]: Exam->Int { {e:Exam, g: e.grades[s]} }

run {}
