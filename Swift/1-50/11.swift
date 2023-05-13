import Foundation

guard let n = Int(readLine()!) else {
    fatalError("Invalid input")
}

guard let input = readLine() else {
    fatalError("Invalid input")
}

let a = input.split(separator: " ").compactMap { Int($0) }

let sortedA = a.sorted()

guard sortedA.count >= 2 else {
    fatalError("Not enough elements in the array")
}

print(sortedA[n - 2])
