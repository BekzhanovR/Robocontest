import Foundation

let input = readLine()!
let numbers = input.components(separatedBy: " ")

if let a = Int(numbers[0]), let b = Int(numbers[1]) {
    let x: String
    if a > b {
        x = ">"
    } else if a == b {
        x = "="
    } else {
        x = "<"
    }

    print(x)
}
