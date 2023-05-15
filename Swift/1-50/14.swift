import Foundation

if let input = readLine() {
    let inputs = input.components(separatedBy: " ")
    if let n = Int(inputs[0]), let k = Int(inputs[1]) {
        var output = 0
        if n == 0 {
            output = 1
        } else {
            output = modularPow(k + 1, n, 1000000007)
        }
        print(output)
    }
}

func modularPow(_ baseNumber: Int, _ exponent: Int, _ modulus: Int) -> Int {
    var result = 1
    var base = baseNumber
    var exp = exponent
    let mod = modulus

    while exp > 0 {
        if exp % 2 == 1 {
            result = (result * base) % mod
        }
        base = (base * base) % mod
        exp /= 2
    }

    return result
}
