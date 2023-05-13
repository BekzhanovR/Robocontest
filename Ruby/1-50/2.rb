input = gets.chomp
numbers = input.split(' ')

a = numbers[0].to_i
b = numbers[1].to_i

x = if a > b
      '>'
    elsif a == b
      '='
    else
      '<'
    end

puts x
