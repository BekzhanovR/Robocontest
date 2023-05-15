if let input = readLine() {
    let inputs = input.components(separatedBy: " ")
    if let n = Int(inputs[0]), let k = Int(inputs[1]) {
        if n == 0 {
            print("1")
        } else {
            print(k + 1)
        }
    }
}