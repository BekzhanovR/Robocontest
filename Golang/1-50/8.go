package main

import (
	"fmt"
	"math"
	"os"
)

func main() {
	var a, b, c, d, e, mn, mx int64

	fmt.Fscan(os.Stdin, &a)
	fmt.Fscan(os.Stdin, &b)
	fmt.Fscan(os.Stdin, &c)
	fmt.Fscan(os.Stdin, &d)
	fmt.Fscan(os.Stdin, &e)

	mn = int64(math.Min(math.Min(float64(a), float64(b)), math.Min(float64(c), math.Min(float64(d), float64(e)))))
	mx = int64(math.Max(math.Max(float64(a), float64(b)), math.Max(float64(c), math.Max(float64(d), float64(e)))))

	fmt.Printf("%d %d\n", a+b+c+d+e-mx, a+b+c+d+e-mn)
}
