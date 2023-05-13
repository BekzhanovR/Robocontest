import Foundation

if let input = readLine(), let n = Int(input) {
    var k = 1
    var f = 0
    
    for _ in 0..<n {
        let temp = k
        k = k + f
        f = temp
    }
    
    print(f * 2)
}