if let input = readLine() {
    let n = input.split(separator: " ").compactMap { Int($0) }
    let result1 = n.reduce(0, +) - n.max()!
    let result2 = n.reduce(0, +) - n.min()!
    print("\(result1) \(result2)")
}
