package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	input, _ := reader.ReadString('\n')
	inputs := strings.Fields(input)
	n, _ := strconv.Atoi(inputs[0])
	k, _ := strconv.Atoi(inputs[1])

	if n == 0 {
		fmt.Println("1")
	} else {
		fmt.Println(k + 1)
	}
}
