def summation(a, b)
	return a + b
end

t = gets.to_i

(0...t).each do |i|
	list = gets.strip.split(" ")
	_a = list[0].to_i
	_b = list[1].to_i
	sum = summation(_a, _b)
	puts sum
end