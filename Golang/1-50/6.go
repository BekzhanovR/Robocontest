package main

import (
	"fmt"
)

func main() {
	var jil int
	fmt.Scan(&jil)

	var x string

	if jil < 10 {
		x = "000"
	} else if jil < 100 {
		x = "00"
	} else if jil < 1000 {
		x = "0"
	}

	if jil%400 == 0 || (jil%4 == 0 && jil%100 != 0) {
		x = fmt.Sprintf("12/09/%s%d", x, jil)
	} else {
		x = fmt.Sprintf("13/09/%s%d", x, jil)
	}

	fmt.Println(x)
}