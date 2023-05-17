package main

import (
	"bufio"
	"fmt"
	"math/big"
	"os"
	"strconv"
	"strings"
)

func modularPow(baseNumber, exponent, modulus int64) int64 {
	result := big.NewInt(1)
	base := big.NewInt(baseNumber)
	mod := big.NewInt(modulus)

	for exponent > 0 {
		if exponent%2 == 1 {
			result.Mul(result, base).Mod(result, mod)
		}
		base.Mul(base, base).Mod(base, mod)
		exponent /= 2
	}

	return result.Int64()
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	input, _ := reader.ReadString('\n')
	inputs := strings.Fields(input)
	n, _ := strconv.ParseInt(inputs[0], 10, 64)
	k, _ := strconv.ParseInt(inputs[1], 10, 64)

	var output int64
	if n == 0 {
		output = 1
	} else {
		output = modularPow(k+1, n, 1000000007)
	}

	fmt.Println(output)
}
