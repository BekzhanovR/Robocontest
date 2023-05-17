package main

import (
	"fmt"
)

func pow(base, exponent, mod int) int {
	result := 1
	for exponent > 0 {
		if exponent%2 == 1 {
			result = (result * base) % mod
		}
		base = (base * base) % mod
		exponent /= 2
	}
	return result
}

func main() {
	var n, k int
	fmt.Scan(&n, &k)
	m := int(1e9) + 7
	if n != 0 {
		result := ((pow(k, n, m) - 1) * pow(k-1, m-2, m)) % m
		fmt.Println(result)
	} else {
		fmt.Println(0)
	}
}
