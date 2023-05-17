input = gets.chomp
inputs = input.split(" ")
n = inputs[0].to_i
k = inputs[1].to_i

if n == 0
    puts "1"
else
    puts k + 1
end