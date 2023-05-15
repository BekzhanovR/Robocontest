import Foundation

if let input = readLine(), let n = Int(input) {
    var a = Array(0...n)
    a[1] = 0
    var i = 2
    
    while i <= n {
        if a[i] != 0 {
            var j = i + i
            while j <= n {
                a[j] = 0
                j += i
            }
        }
        i += 1
    }
    
    let primes = a.filter { $0 != 0 }
    let ism = ["Bobur", "Ali"]
    
    if n == 1 {
        print("Ali")
    } else {
        print(ism[primes.count % 2])
    }
}