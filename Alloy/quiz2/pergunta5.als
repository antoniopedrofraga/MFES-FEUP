abstract sig Person {}

sig Teacher extends Person {}

abstract sig Student extends Person {}

sig Graduate, Undergrad extends Student {}

sig Instructor in Teacher + Graduate {}

sig Course {
      taughtby: one Instructor,
      enrolled: some Student
}
