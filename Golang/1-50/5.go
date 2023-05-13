package main

import (
	"fmt"
)

func main() {
	var z int
	fmt.Scan(&z)
	s := 0
	n := 0

	if z == 0 {
		s = -1
	} else {
		if z < 0 {
			n = -z
		} else {
			n = z
		}

		i := 1

		for i*i <= n {
			if n%i == 0 {
				s += 1

				if i*i != n {
					s += 1
				}
			}

			i += 1
		}

		if s%2 == 1 && z > 0 {
			s += 1
		}
	}

	fmt.Println(s)
}
