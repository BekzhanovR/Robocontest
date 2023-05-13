package main

import (
	"fmt"
)

func main() {
	var A, B, C, N, d int
	fmt.Scan(&N)
	fmt.Scan(&A, &B, &C)
	d = A + B + C
	if N <= d {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}
