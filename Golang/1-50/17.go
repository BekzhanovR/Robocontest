package main

import (
	"fmt"
)

func fff(n int) int {
	s := 0
	for n > 0 {
		p := n % 10
		s = s + p
		n = n / 10
	}
	return s * s
}

func main() {
	var n int
	fmt.Scan(&n)
	k := 0
	i := 1
	var h int
	for k < n {
		if i%fff(i) == 0 {
			k++
		}
		h = i
		i++
	}
	fmt.Println(h)
}
