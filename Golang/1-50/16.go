package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

var a = []int{1000000000, 1000000, 1000, 100}
var b = []string{"milliard ", "million ", "ming ", "yuz "}
var c = []string{"", "o'n ", "yigirma ", "o'ttiz ", "qirq ", "ellik ", "oltmish ", "yetmish ", "sakson ", "to'qson "}
var d = []string{"", "bir ", "ikki ", "uch ", "to'rt ", "besh ", "olti ", "yetti ", "sakkiz ", "to'qqiz "}

func Natural(n int) string {
	for i := 0; i < 4; i++ {
		if n >= a[i] {
			return Natural(n/a[i]) + b[i] + Natural(n%a[i])
		}
	}
	return c[n/10] + d[n%10]
}

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	n, _ := strconv.Atoi(scanner.Text())
	a := Natural(n)
	fmt.Println(a)
}