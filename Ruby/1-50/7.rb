n = gets.chomp.to_i
k, f = 1, 0
for i in 1..n do
    k, f = k+f, k
end
puts f*2