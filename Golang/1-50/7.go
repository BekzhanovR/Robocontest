package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)

	f := make([]int64, 46)
	f[0] = 0
	f[1] = 1

	for i := 2; i <= 45; i++ {
		f[i] = f[i-2] + f[i-1]
	}

	result := f[n] * 2
	fmt.Println(result)
}
