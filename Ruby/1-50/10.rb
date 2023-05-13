N = gets.to_i
A, B, C = gets.split.map(&:to_i)
d = A + B + C
if N <= d
  puts "Yes"
else
  puts "No"
end
