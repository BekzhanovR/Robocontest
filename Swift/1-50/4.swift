import Foundation

if let input = readLine() {
    let numbers = input.components(separatedBy: " ").compactMap { Int($0) }
    if numbers.count == 2 {
        let n = numbers[0]
        let p = numbers[1]
        print(n * p)
    }
}
