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
	fmt.Print()
	input, _ := reader.ReadString('\n')
	input = strings.TrimSuffix(input, "\n")

	numbers := strings.Split(input, " ")
	var1, _ := strconv.Atoi(numbers[0])
	var2, _ := strconv.Atoi(numbers[1])

	sum := var1 + var2
	fmt.Println(sum)
}