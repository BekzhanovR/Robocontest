import Foundation

if let _ = readLine(), let s = readLine() {
    let sInt = s.split(separator: " ").compactMap { Int($0) }
    
    for i in sInt {
        if sInt.filter({ $0 == i }).count == 1 {
            print(i)
        }
    }
}
