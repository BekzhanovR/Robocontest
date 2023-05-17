let mod = Int(1e9 + 7)

func binpow(_ a: Int, _ n: Int) -> Int {
    if n == 0 {
        return 1
    }
    if n % 2 == 0 {
        let x = binpow(a, n / 2)
        return (1 * x * x) % mod
    }
    return (1 * a * binpow(a, n - 1)) % mod
}

if let input = readLine() {
    let nk = input.split(separator: " ").map { Int($0)! }
    let n = nk[0]
    let k = nk[1]

    let a = binpow(k, n) - 1
    let b = k - 1

    let result = (1 * a * binpow(b, mod - 2)) % mod
    print(result)
}
