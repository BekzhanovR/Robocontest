import Foundation

var s = 0
var n = 0

if let z = readLine(), let intValue = Int(z) {
    if intValue == 0 {
        s = -1
    } else {
        if intValue < 0 {
            n = -intValue
        } else {
            n = intValue
        }

        var i = 1

        while i * i <= n {
            if n % i == 0 {
                s += 1

                if i * i != n {
                    s += 1
                }
            }

            i += 1
        }

        if s % 2 == 1 && intValue > 0 {
            s += 1
        }
    }

    print(s)
}
