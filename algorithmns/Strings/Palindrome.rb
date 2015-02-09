def check_palindrome(variable)
  if variable.reverse == variable #Check if string same when reversed 
    puts "#{ variable } is a palindrome."
  else # If string is not the same when reversed
    puts "#{ variable } is not a palindrome."
  end
end

t = gets.to_i
strsArr = Array.new(t)

(0...t).each do |i|
	strsArr[i] = gets.chomp.to_s
end

(0...t).each do |i|
	check_palindrome(strsArr[i])
end