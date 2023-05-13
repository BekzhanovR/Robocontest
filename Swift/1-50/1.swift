import Foundation
let input = readLine()!
let numbers = input.components(separatedBy: " ")

if let var1 = Int(numbers[0]), let var2 = Int(numbers[1]) {
    let sum = var1 + var2
    print(sum)
}
