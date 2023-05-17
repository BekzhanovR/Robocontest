package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)

	a := make([]int, n+1)
	for i := 0; i <= n; i++ {
		a[i] = i
	}

	a[1] = 0
	i := 2
	for i <= n {
		if a[i] != 0 {
			j := i + i
			for j <= n {
				a[j] = 0
				j = j + i
			}
		}
		i += 1
	}

	primes := make([]int, 0)
	for _, num := range a {
		if num != 0 {
			primes = append(primes, num)
		}
	}

	ism := []string{"Bobur", "Ali"}

	if n == 1 {
		fmt.Println("Ali")
	} else {
		fmt.Println(ism[len(primes)%2])
	}
}