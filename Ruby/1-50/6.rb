jil = gets.chomp.to_i

x = ''

if jil < 10
  x = '000'
elsif jil < 100
  x = '00'
elsif jil < 1000
  x = '0'
end

if jil % 400 == 0 || (jil % 4 == 0 && jil % 100 != 0)
  x = "12/09/#{x}#{jil}"
else
  x = "13/09/#{x}#{jil}"
end

puts x
