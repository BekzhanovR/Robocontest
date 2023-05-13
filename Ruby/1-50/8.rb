n = gets.chomp.split.map(&:to_i)
result1 = n.sum - n.max
result2 = n.sum - n.min
puts "#{result1} #{result2}"